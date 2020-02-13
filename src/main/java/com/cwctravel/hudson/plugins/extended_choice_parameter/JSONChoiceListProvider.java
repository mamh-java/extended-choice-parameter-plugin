package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.List;

public class JSONChoiceListProvider extends ChoiceListProvider  {

    private String groovyScript;
    private String bindings;
    private String groovyClasspath;
    private String groovyScriptFile;

    private String javascript;
    private String javascriptFile;

    private boolean saveJSONParameterToFile;



    @DataBoundConstructor
    public JSONChoiceListProvider(String groovyScript, String bindings, String groovyClasspath, String groovyScriptFile, String javascript, String javascriptFile, boolean saveJSONParameterToFile) {
        this.groovyScript = groovyScript;
        this.bindings = bindings;
        this.groovyClasspath = groovyClasspath;
        this.groovyScriptFile = groovyScriptFile;
        this.javascript = javascript;
        this.javascriptFile = javascriptFile;
        this.saveJSONParameterToFile = saveJSONParameterToFile;
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


    public String getGroovyScript() {
        return groovyScript;
    }

    public void setGroovyScript(String groovyScript) {
        this.groovyScript = groovyScript;
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

    public String getGroovyScriptFile() {
        return groovyScriptFile;
    }

    public void setGroovyScriptFile(String groovyScriptFile) {
        this.groovyScriptFile = groovyScriptFile;
    }

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    public String getJavascriptFile() {
        return javascriptFile;
    }

    public void setJavascriptFile(String javascriptFile) {
        this.javascriptFile = javascriptFile;
    }

    public boolean isSaveJSONParameterToFile() {
        return saveJSONParameterToFile;
    }

    public void setSaveJSONParameterToFile(boolean saveJSONParameterToFile) {
        this.saveJSONParameterToFile = saveJSONParameterToFile;
    }
}
