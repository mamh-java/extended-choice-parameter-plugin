package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;
import net.sf.json.JSONObject;

import javax.annotation.Nonnull;
import java.util.List;

import static com.cwctravel.hudson.plugins.extended_choice_parameter.ExtendedChoiceParameterDefinition.PARAMETER_TYPE_JSON;

public class JSONChoiceListProvider extends ChoiceListProvider {
    private String type;
    private String groovyScript;
    private String bindings;
    private String groovyClasspath;
    private String groovyScriptFile;

    private String javascript;
    private String javascriptFile;

    private boolean saveJSONParameterToFile;


    @DataBoundConstructor
    public JSONChoiceListProvider() {

    }

    @Override
    public List<String> getChoiceList() {
        return null;
    }


    @Extension
    public static class DescriptorImpl extends ChoiceListProviderDescriptor {

        @Nonnull
        @Override
        public String getDisplayName() {
            return Messages.JSONChoiceListProvider_DisplayName();
        }


        @Override
        public JSONChoiceListProvider newInstance(StaplerRequest req, JSONObject formData) throws FormException {
            JSONChoiceListProvider provider = (JSONChoiceListProvider) super.newInstance(req, formData);
            boolean saveJSONParameterToFile = false;

            String groovyScript = null;
            String groovyScriptFile = null;
            String bindings = null;
            String groovyClasspath = null;
            String javascriptFile = null;
            String javascript = null;


            provider.setType(PARAMETER_TYPE_JSON);
            JSONObject json1 = (JSONObject) formData.get("jsonParameterConfigSource");
            if (json1 != null) {
                if (json1.getInt("value") == 0) {
                    groovyScript = json1.getString("groovyScript");
                    groovyScriptFile = null;
                    bindings = json1.getString("bindings");
                    groovyClasspath = json1.getString("groovyClasspath");
                } else if (json1.getInt("value") == 1) {
                    groovyScript = null;
                    groovyScriptFile = json1.getString("groovyScriptFile");
                    bindings = json1.getString("bindings");
                    groovyClasspath = json1.getString("groovyClasspath");
                }
            }
            provider.setGroovyScriptFile(groovyScriptFile);
            provider.setGroovyScript(groovyScript);
            provider.setBindings(bindings);
            provider.setGroovyClasspath(groovyClasspath);


            JSONObject json2 = (JSONObject) formData.get("jsonParameterConfigJavascriptSource");
            if (json2 != null) {
                if (json2.getInt("value") == 0) {
                    javascript = json2.optString("javascript");
                    javascriptFile = null;
                } else if (json2.getInt("value") == 1) {
                    javascriptFile = json2.optString("javascriptFile");
                    javascript = null;
                }
            }
            provider.setJavascript(javascript);
            provider.setJavascriptFile(javascriptFile);

            saveJSONParameterToFile = formData.optBoolean("saveJSONParameterToFile");
            provider.setSaveJSONParameterToFile(saveJSONParameterToFile);


            return provider;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroovyScript() {
        return groovyScript;
    }

    public void setGroovyScript(String groovyScript) {
        this.groovyScript = groovyScript;
    }

    public String getBindings() {
        return bindings;
    }

    public void setBindings(String bindings) {
        this.bindings = bindings;
    }

    public String getGroovyClasspath() {
        return groovyClasspath;
    }

    public void setGroovyClasspath(String groovyClasspath) {
        this.groovyClasspath = groovyClasspath;
    }

    public String getGroovyScriptFile() {
        return groovyScriptFile;
    }

    public void setGroovyScriptFile(String groovyScriptFile) {
        this.groovyScriptFile = groovyScriptFile;
    }

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    public String getJavascriptFile() {
        return javascriptFile;
    }

    public void setJavascriptFile(String javascriptFile) {
        this.javascriptFile = javascriptFile;
    }

    public boolean isSaveJSONParameterToFile() {
        return saveJSONParameterToFile;
    }

    public void setSaveJSONParameterToFile(boolean saveJSONParameterToFile) {
        this.saveJSONParameterToFile = saveJSONParameterToFile;
    }
}
