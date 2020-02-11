package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.List;

public class BasicChoiceListProvider extends ChoiceListProvider{
    @DataBoundConstructor
    public BasicChoiceListProvider() {
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
            return Messages.BasicChoiceListProvider_DisplayName();
        }
    }
}
