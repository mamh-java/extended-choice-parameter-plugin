package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.List;

public class JSONChoiceListProvider extends ChoiceListProvider  {
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
    }
}
