package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.logging.Logger;

public class BasicChoiceListProvider extends ChoiceListProvider {
    private static final Logger LOGGER = Logger.getLogger(BasicChoiceListProvider.class.getName());

    private String type;
    private int visibleItemCount;
    private String multiSelectDelimiter;
    private boolean quoteValue;

    @DataBoundConstructor
    public BasicChoiceListProvider(String type, int visibleItemCount, String multiSelectDelimiter, boolean quoteValue) {
        this.type = type;
        this.visibleItemCount = visibleItemCount;
        this.multiSelectDelimiter = multiSelectDelimiter;
        this.quoteValue = quoteValue;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVisibleItemCount() {
        return visibleItemCount;
    }

    public void setVisibleItemCount(int visibleItemCount) {
        this.visibleItemCount = visibleItemCount;
    }

    public String getMultiSelectDelimiter() {
        return multiSelectDelimiter;
    }

    public void setMultiSelectDelimiter(String multiSelectDelimiter) {
        this.multiSelectDelimiter = multiSelectDelimiter;
    }

    public boolean isQuoteValue() {
        return quoteValue;
    }

    public void setQuoteValue(boolean quoteValue) {
        this.quoteValue = quoteValue;
    }


}
