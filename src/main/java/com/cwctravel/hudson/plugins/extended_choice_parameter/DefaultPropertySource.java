package com.cwctravel.hudson.plugins.extended_choice_parameter;

import org.kohsuke.stapler.DataBoundConstructor;

public class DefaultPropertySource {
    private String value;
    private String defaultPropertyValue;
    private String defaultPropertyFile;
    private String defaultPropertyKey;
    private String defaultGroovyScript;
    private String defaultGroovyClasspath;
    private String defaultGroovyScriptFile;
    private String defaultBindings;

    @DataBoundConstructor
    public DefaultPropertySource(String value, String defaultPropertyValue, String defaultPropertyFile, String defaultPropertyKey, String defaultGroovyScript, String defaultGroovyClasspath, String defaultGroovyScriptFile, String defaultBindings) {
        this.value = value;
        this.defaultPropertyValue = defaultPropertyValue;
        this.defaultPropertyFile = defaultPropertyFile;
        this.defaultPropertyKey = defaultPropertyKey;
        this.defaultGroovyScript = defaultGroovyScript;
        this.defaultGroovyClasspath = defaultGroovyClasspath;
        this.defaultGroovyScriptFile = defaultGroovyScriptFile;
        this.defaultBindings = defaultBindings;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDefaultPropertyValue() {
        return defaultPropertyValue;
    }

    public void setDefaultPropertyValue(String defaultPropertyValue) {
        this.defaultPropertyValue = defaultPropertyValue;
    }

    public String getDefaultPropertyFile() {
        return defaultPropertyFile;
    }

    public void setDefaultPropertyFile(String defaultPropertyFile) {
        this.defaultPropertyFile = defaultPropertyFile;
    }

    public String getDefaultPropertyKey() {
        return defaultPropertyKey;
    }

    public void setDefaultPropertyKey(String defaultPropertyKey) {
        this.defaultPropertyKey = defaultPropertyKey;
    }

    public String getDefaultGroovyScript() {
        return defaultGroovyScript;
    }

    public void setDefaultGroovyScript(String defaultGroovyScript) {
        this.defaultGroovyScript = defaultGroovyScript;
    }

    public String getDefaultGroovyClasspath() {
        return defaultGroovyClasspath;
    }

    public void setDefaultGroovyClasspath(String defaultGroovyClasspath) {
        this.defaultGroovyClasspath = defaultGroovyClasspath;
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
}
