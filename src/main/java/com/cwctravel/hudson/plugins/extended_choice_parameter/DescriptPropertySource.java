package com.cwctravel.hudson.plugins.extended_choice_parameter;

import org.kohsuke.stapler.DataBoundConstructor;

public class DescriptPropertySource {
    private String value;
    private String descriptionPropertyValue;
    private String descriptionPropertyFile;
    private String descriptionPropertyKey;
    private String descriptionGroovyScript;
    private String descriptionGroovyClasspath;
    private String descriptionGroovyScriptFile;
    private String descriptionBindings;

    @DataBoundConstructor
    public DescriptPropertySource(String value, String descriptionPropertyValue, String descriptionPropertyFile, String descriptionPropertyKey, String descriptionGroovyScript, String descriptionGroovyClasspath, String descriptionGroovyScriptFile, String descriptionBindings) {
        this.value = value;
        this.descriptionPropertyValue = descriptionPropertyValue;
        this.descriptionPropertyFile = descriptionPropertyFile;
        this.descriptionPropertyKey = descriptionPropertyKey;
        this.descriptionGroovyScript = descriptionGroovyScript;
        this.descriptionGroovyClasspath = descriptionGroovyClasspath;
        this.descriptionGroovyScriptFile = descriptionGroovyScriptFile;
        this.descriptionBindings = descriptionBindings;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescriptionPropertyValue() {
        return descriptionPropertyValue;
    }

    public void setDescriptionPropertyValue(String descriptionPropertyValue) {
        this.descriptionPropertyValue = descriptionPropertyValue;
    }

    public String getDescriptionPropertyFile() {
        return descriptionPropertyFile;
    }

    public void setDescriptionPropertyFile(String descriptionPropertyFile) {
        this.descriptionPropertyFile = descriptionPropertyFile;
    }

    public String getDescriptionPropertyKey() {
        return descriptionPropertyKey;
    }

    public void setDescriptionPropertyKey(String descriptionPropertyKey) {
        this.descriptionPropertyKey = descriptionPropertyKey;
    }

    public String getDescriptionGroovyScript() {
        return descriptionGroovyScript;
    }

    public void setDescriptionGroovyScript(String descriptionGroovyScript) {
        this.descriptionGroovyScript = descriptionGroovyScript;
    }

    public String getDescriptionGroovyClasspath() {
        return descriptionGroovyClasspath;
    }

    public void setDescriptionGroovyClasspath(String descriptionGroovyClasspath) {
        this.descriptionGroovyClasspath = descriptionGroovyClasspath;
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
}
