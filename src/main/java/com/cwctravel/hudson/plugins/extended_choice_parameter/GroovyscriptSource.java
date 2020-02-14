package com.cwctravel.hudson.plugins.extended_choice_parameter;

import org.kohsuke.stapler.DataBoundConstructor;

public class GroovyscriptSource {

    public String value;  //radioBlock 对应的value,  0 或者 1
    public String groovyScript;
    public String groovyScriptFile;

    public String bindings;

    public String groovyClasspath;

    @DataBoundConstructor
    public GroovyscriptSource(String value, String groovyScript, String groovyScriptFile, String bindings, String groovyClasspath) {
        this.value = value;
        this.groovyScript = groovyScript;
        this.groovyScriptFile = groovyScriptFile;
        this.bindings = bindings;
        this.groovyClasspath = groovyClasspath;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}
