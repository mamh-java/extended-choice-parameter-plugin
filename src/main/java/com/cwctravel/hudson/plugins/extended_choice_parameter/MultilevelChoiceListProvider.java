package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.List;

public class MultilevelChoiceListProvider extends ChoiceListProvider {
    private String type;
    private String propertyFile;
    private String propertyValue;


    @DataBoundConstructor
    public MultilevelChoiceListProvider(String type, String propertyFile, String propertyValue) {
        this.type = type;
        this.propertyFile = propertyFile;
        this.propertyValue = propertyValue;
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
            return Messages.MultilevelChoiceListProvider_DisplayName();
        }

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPropertyFile() {
        return propertyFile;
    }

    public void setPropertyFile(String propertyFile) {
        this.propertyFile = propertyFile;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
}
