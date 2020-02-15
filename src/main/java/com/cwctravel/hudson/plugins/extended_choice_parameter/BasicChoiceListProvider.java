package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.List;

public class BasicChoiceListProvider extends ChoiceListProvider {
    private String type;
    private String value;
    private String defaultValue;
    private int visibleItemCount;
    private String multiSelectDelimiter;
    private boolean quoteValue;

    private String propertyValue = null;
    private String propertyKey = null;
    private String propertyFile = null;
    private String groovyScript = null;
    private String groovyScriptFile = null;
    private String bindings = null;
    private String groovyClasspath = null;

    private String defaultPropertyValue = null;
    private String defaultPropertyKey = null;
    private String defaultPropertyFile = null;
    private String defaultGroovyScript = null;
    private String defaultGroovyScriptFile = null;
    private String defaultBindings = null;
    private String defaultGroovyClasspath = null;

    private String descriptionPropertyValue = null;
    private String descriptionPropertyKey = null;
    private String descriptionPropertyFile = null;
    private String descriptionGroovyScript = null;
    private String descriptionGroovyScriptFile = null;
    private String descriptionBindings = null;
    private String descriptionGroovyClasspath = null;


    @DataBoundConstructor
    public BasicChoiceListProvider(String type, int visibleItemCount, String multiSelectDelimiter, boolean quoteValue,
                                   PropertySource propertySource,
                                   DefaultPropertySource defaultPropertySource,
                                   DescriptPropertySource descriptionPropertySource) {
        this.type = type;
        this.visibleItemCount = visibleItemCount;
        this.multiSelectDelimiter = multiSelectDelimiter;
        this.quoteValue = quoteValue;
        this.propertyValue = propertySource.getPropertyValue();
        this.value = propertySource.getPropertyValue();
        this.propertyKey = propertySource.getPropertyKey();
        this.propertyFile = propertySource.getPropertyFile();

        this.groovyScript = propertySource.getGroovyScript();
        this.groovyScriptFile = propertySource.getGroovyScriptFile();
        this.bindings = propertySource.getBindings();
        this.groovyClasspath = propertySource.getGroovyClasspath();


        this.defaultPropertyValue = defaultPropertySource.getDefaultPropertyValue();
        this.defaultValue = defaultPropertySource.getDefaultPropertyValue();
        this.defaultPropertyKey = defaultPropertySource.getDefaultPropertyKey();
        this.defaultPropertyFile = defaultPropertySource.getDefaultPropertyFile();
        this.defaultGroovyScript = defaultPropertySource.getDefaultGroovyScript();
        this.defaultGroovyScriptFile = defaultPropertySource.getDefaultGroovyScriptFile();
        this.defaultBindings = defaultPropertySource.getDefaultBindings();
        this.defaultGroovyClasspath = defaultPropertySource.getDefaultGroovyClasspath();


        this.descriptionPropertyValue = descriptionPropertySource.getDescriptionPropertyValue();
        this.descriptionPropertyKey = descriptionPropertySource.getDescriptionPropertyKey();
        this.descriptionPropertyFile = descriptionPropertySource.getDescriptionPropertyFile();
        this.descriptionGroovyScript = descriptionPropertySource.getDescriptionGroovyScript();
        this.descriptionGroovyScriptFile = descriptionPropertySource.getDescriptionGroovyScriptFile();
        this.descriptionBindings = descriptionPropertySource.getDescriptionBindings();
        this.descriptionGroovyClasspath = descriptionPropertySource.getDescriptionGroovyClasspath();
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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


    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyFile() {
        return propertyFile;
    }

    public void setPropertyFile(String propertyFile) {
        this.propertyFile = propertyFile;
    }

    public String getGroovyScript() {
        return groovyScript;
    }

    public void setGroovyScript(String groovyScript) {
        this.groovyScript = groovyScript;
    }

    public String getGroovyScriptFile() {
        return groovyScriptFile;
    }

    public void setGroovyScriptFile(String groovyScriptFile) {
        this.groovyScriptFile = groovyScriptFile;
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

    public String getDefaultPropertyValue() {
        return defaultPropertyValue;
    }

    public void setDefaultPropertyValue(String defaultPropertyValue) {
        this.defaultPropertyValue = defaultPropertyValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultPropertyKey() {
        return defaultPropertyKey;
    }

    public void setDefaultPropertyKey(String defaultPropertyKey) {
        this.defaultPropertyKey = defaultPropertyKey;
    }

    public String getDefaultPropertyFile() {
        return defaultPropertyFile;
    }

    public void setDefaultPropertyFile(String defaultPropertyFile) {
        this.defaultPropertyFile = defaultPropertyFile;
    }

    public String getDefaultGroovyScript() {
        return defaultGroovyScript;
    }

    public void setDefaultGroovyScript(String defaultGroovyScript) {
        this.defaultGroovyScript = defaultGroovyScript;
    }

    public String getDefaultGroovyScriptFile() {
        return defaultGroovyScriptFile;
    }

    public void setDefaultGroovyScriptFile(String defaultGroovyScriptFile) {
        this.defaultGroovyScriptFile = defaultGroovyScriptFile;
    }

    public String getDefaultBindings() {
        return defaultBindings;
    }

    public void setDefaultBindings(String defaultBindings) {
        this.defaultBindings = defaultBindings;
    }

    public String getDefaultGroovyClasspath() {
        return defaultGroovyClasspath;
    }

    public void setDefaultGroovyClasspath(String defaultGroovyClasspath) {
        this.defaultGroovyClasspath = defaultGroovyClasspath;
    }

    public String getDescriptionPropertyValue() {
        return descriptionPropertyValue;
    }

    public void setDescriptionPropertyValue(String descriptionPropertyValue) {
        this.descriptionPropertyValue = descriptionPropertyValue;
    }

    public String getDescriptionPropertyKey() {
        return descriptionPropertyKey;
    }

    public void setDescriptionPropertyKey(String descriptionPropertyKey) {
        this.descriptionPropertyKey = descriptionPropertyKey;
    }

    public String getDescriptionPropertyFile() {
        return descriptionPropertyFile;
    }

    public void setDescriptionPropertyFile(String descriptionPropertyFile) {
        this.descriptionPropertyFile = descriptionPropertyFile;
    }

    public String getDescriptionGroovyScript() {
        return descriptionGroovyScript;
    }

    public void setDescriptionGroovyScript(String descriptionGroovyScript) {
        this.descriptionGroovyScript = descriptionGroovyScript;
    }

    public String getDescriptionGroovyScriptFile() {
        return descriptionGroovyScriptFile;
    }

    public void setDescriptionGroovyScriptFile(String descriptionGroovyScriptFile) {
        this.descriptionGroovyScriptFile = descriptionGroovyScriptFile;
    }

    public String getDescriptionBindings() {
        return descriptionBindings;
    }

    public void setDescriptionBindings(String descriptionBindings) {
        this.descriptionBindings = descriptionBindings;
    }

    public String getDescriptionGroovyClasspath() {
        return descriptionGroovyClasspath;
    }

    public void setDescriptionGroovyClasspath(String descriptionGroovyClasspath) {
        this.descriptionGroovyClasspath = descriptionGroovyClasspath;
    }
}
