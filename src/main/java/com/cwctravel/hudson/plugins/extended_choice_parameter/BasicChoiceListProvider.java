package com.cwctravel.hudson.plugins.extended_choice_parameter;

import org.kohsuke.stapler.DataBoundConstructor;

import java.util.List;

import javax.annotation.Nonnull;

import hudson.Extension;

public class BasicChoiceListProvider extends ChoiceListProvider {
    private String type;
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
    private String javascriptFile = null;
    private String javascript = null;

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
    public BasicChoiceListProvider(String type, int visibleItemCount, String multiSelectDelimiter, boolean quoteValue, String propertyValue, String propertyKey, String propertyFile, String groovyScript, String groovyScriptFile, String bindings, String groovyClasspath, String javascriptFile, String javascript, String defaultPropertyValue, String defaultPropertyKey, String defaultPropertyFile, String defaultGroovyScript, String defaultGroovyScriptFile, String defaultBindings, String defaultGroovyClasspath, String descriptionPropertyValue, String descriptionPropertyKey, String descriptionPropertyFile, String descriptionGroovyScript, String descriptionGroovyScriptFile, String descriptionBindings, String descriptionGroovyClasspath) {
        this.type = type;
        this.visibleItemCount = visibleItemCount;
        this.multiSelectDelimiter = multiSelectDelimiter;
        this.quoteValue = quoteValue;
        this.propertyValue = propertyValue;
        this.propertyKey = propertyKey;
        this.propertyFile = propertyFile;
        this.groovyScript = groovyScript;
        this.groovyScriptFile = groovyScriptFile;
        this.bindings = bindings;
        this.groovyClasspath = groovyClasspath;
        this.javascriptFile = javascriptFile;
        this.javascript = javascript;
        this.defaultPropertyValue = defaultPropertyValue;
        this.defaultPropertyKey = defaultPropertyKey;
        this.defaultPropertyFile = defaultPropertyFile;
        this.defaultGroovyScript = defaultGroovyScript;
        this.defaultGroovyScriptFile = defaultGroovyScriptFile;
        this.defaultBindings = defaultBindings;
        this.defaultGroovyClasspath = defaultGroovyClasspath;
        this.descriptionPropertyValue = descriptionPropertyValue;
        this.descriptionPropertyKey = descriptionPropertyKey;
        this.descriptionPropertyFile = descriptionPropertyFile;
        this.descriptionGroovyScript = descriptionGroovyScript;
        this.descriptionGroovyScriptFile = descriptionGroovyScriptFile;
        this.descriptionBindings = descriptionBindings;
        this.descriptionGroovyClasspath = descriptionGroovyClasspath;
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

    public String getJavascriptFile() {
        return javascriptFile;
    }

    public void setJavascriptFile(String javascriptFile) {
        this.javascriptFile = javascriptFile;
    }

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    public String getDefaultPropertyValue() {
        return defaultPropertyValue;
    }

    public void setDefaultPropertyValue(String defaultPropertyValue) {
        this.defaultPropertyValue = defaultPropertyValue;
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
