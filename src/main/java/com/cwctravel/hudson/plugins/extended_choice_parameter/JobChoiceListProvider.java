package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import hudson.Util;
import hudson.model.AutoCompletionCandidates;
import hudson.model.Item;
import hudson.model.ItemGroup;
import hudson.model.Items;
import hudson.model.Job;
import hudson.model.queue.Tasks;
import hudson.security.ACL;
import hudson.util.FormValidation;
import jenkins.model.Jenkins;
import jenkins.model.ParameterizedJobMixIn;
import jenkins.security.QueueItemAuthenticatorConfiguration;
import org.acegisecurity.Authentication;
import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.AncestorInPath;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.StringTokenizer;


public class JobChoiceListProvider extends ChoiceListProvider {
    private String type;
    private String value;
    private String defaultValue;
    private String multiSelectDelimiter;
    private String projects;
    private int visibleItemCount; //从value中随机的选取多少个。 范围 是 0 到 value分割之后 list 的长度

    @DataBoundConstructor
    public JobChoiceListProvider(String type, int visibleItemCount, String multiSelectDelimiter, String projects) {
        this.type = type;
        this.visibleItemCount = visibleItemCount;
        this.multiSelectDelimiter = multiSelectDelimiter;
        this.projects = projects;
    }

    @Override
    public List<String> getChoiceList() {
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getMultiSelectDelimiter() {
        return multiSelectDelimiter;
    }

    public void setMultiSelectDelimiter(String multiSelectDelimiter) {
        this.multiSelectDelimiter = multiSelectDelimiter;
    }

    public int getVisibleItemCount() {
        return visibleItemCount;
    }

    public void setVisibleItemCount(int visibleItemCount) {
        this.visibleItemCount = visibleItemCount;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    @Extension
    public static class DescriptorImpl extends ChoiceListProviderDescriptor {
        @Nonnull
        @Override
        public String getDisplayName() {
            return Messages.JobChoiceListProvider_DisplayName();
        }

        /**
         * Form validation method.
         *
         * Copied from hudson.tasks.BuildTrigger.doCheck(Item project, String value)
         */
        public FormValidation doCheckProjects(@AncestorInPath Job<?,?> project, @QueryParameter String value ) {
            // JENKINS-32527: Check that it behaves gracefully for an unknown context
            if (project == null) return FormValidation.ok("Context Unknown: the value specified cannot be validated");
            // Require CONFIGURE permission on this project
            if(!project.hasPermission(Item.CONFIGURE)){
                return FormValidation.ok();
            }
            StringTokenizer tokens = new StringTokenizer(Util.fixNull(value),",");
            boolean hasProjects = false;
            while(tokens.hasMoreTokens()) {
                String projectName = tokens.nextToken().trim();
                if (StringUtils.isBlank(projectName)) {
                    return FormValidation.error(Messages.JobChoiceListProvider_BlankProjectName());
                }

                Item item = Jenkins.get().getItem(projectName,project,Item.class); // only works after version 1.410
                if(item==null){
                    Item nearest = Items.findNearest(Job.class, projectName, Jenkins.get());
                    String alternative = nearest != null ? nearest.getRelativeNameFrom(project) : "?";
                    return FormValidation.error(Messages.JobChoiceListProvider_NoSuchProject(projectName, alternative));
                }
                if(!(item instanceof Job) || !(item instanceof ParameterizedJobMixIn.ParameterizedJob)) {
                    return FormValidation.error(Messages.JobChoiceListProvider_NotBuildable(projectName));
                }

                // check whether the supposed user is expected to be able to build
                Authentication auth = Tasks.getAuthenticationOf((ParameterizedJobMixIn.ParameterizedJob)project);
                if (auth.equals(ACL.SYSTEM) && !QueueItemAuthenticatorConfiguration.get().getAuthenticators().isEmpty()) {
                    auth = Jenkins.ANONYMOUS;
                }
                if (!item.getACL().hasPermission(auth, Item.BUILD)) {
                    return FormValidation.error(Messages.JobChoiceListProvider_you_have_no_permission_to_build_(projectName));
                }

                hasProjects = true;
            }
            if (!hasProjects) {
                return FormValidation.error(Messages.JobChoiceListProvider_NoProjectSpecified());
            }

            return FormValidation.ok();
        }


        /**
         * Autocompletion method
         *
         * Copied from hudson.tasks.BuildTrigger.doAutoCompleteChildProjects(String value)
         *
         * @param value
         * @return
         */
        public AutoCompletionCandidates doAutoCompleteProjects(@QueryParameter String value, @AncestorInPath ItemGroup context) {
            AutoCompletionCandidates candidates = new AutoCompletionCandidates();
            List<Job> jobs = Jenkins.get().getAllItems(Job.class);
            for (Job job: jobs) {
                String relativeName = job.getRelativeNameFrom(context);
                if (relativeName.startsWith(value)) {
                    if (job.hasPermission(Item.READ)) {
                        candidates.add(relativeName);
                    }
                }
            }
            return candidates;
        }
    }
}
