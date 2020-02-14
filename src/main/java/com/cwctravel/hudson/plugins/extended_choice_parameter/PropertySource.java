package com.cwctravel.hudson.plugins.extended_choice_parameter;

import org.kohsuke.stapler.DataBoundConstructor;

public class PropertySource {
    private String value;
    private String propertyValue;
    private String propertyFile;
    private String propertyKey;
    private String groovyScript;
    private String groovyClasspath;
    private String groovyScriptFile;
    private String bindings;

    @DataBoundConstructor
    public PropertySource(String value, String propertyValue, String propertyFile, String propertyKey, String groovyScript, String groovyClasspath, String groovyScriptFile, String bindings) {
        this.value = value;
        this.propertyValue = propertyValue;
        this.propertyFile = propertyFile;
        this.propertyKey = propertyKey;
        this.groovyScript = groovyScript;
        this.groovyClasspath = groovyClasspath;
        this.groovyScriptFile = groovyScriptFile;
        this.bindings = bindings;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyFile() {
        return propertyFile;
    }

    public void setPropertyFile(String propertyFile) {
        this.propertyFile = propertyFile;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getGroovyScript() {
        return groovyScript;
    }

    public void setGroovyScript(String groovyScript) {
        this.groovyScript = groovyScript;
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

    public String getBindings() {
        return bindings;
    }

    public void setBindings(String bindings) {
        this.bindings = bindings;
    }
}
