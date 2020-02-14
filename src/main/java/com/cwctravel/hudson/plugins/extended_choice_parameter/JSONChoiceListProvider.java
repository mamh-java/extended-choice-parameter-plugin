package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.Extension;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

import javax.annotation.Nonnull;
import java.util.List;

import static com.cwctravel.hudson.plugins.extended_choice_parameter.ExtendedChoiceParameterDefinition.PARAMETER_TYPE_JSON;

public class JSONChoiceListProvider extends ChoiceListProvider {
    private String type;
    private String groovyScript;
    private String bindings;
    private String groovyClasspath;
    private String groovyScriptFile;

    private String javascript;
    private String javascriptFile;

    private boolean saveJSONParameterToFile;

    private JavascriptSource jsonParameterConfigJavascriptSource;
    private GroovyscriptSource jsonParameterConfigSource;

    @DataBoundConstructor
    public JSONChoiceListProvider(GroovyscriptSource jsonParameterConfigSource, JavascriptSource jsonParameterConfigJavascriptSource, boolean saveJSONParameterToFile) {
        this.jsonParameterConfigSource = jsonParameterConfigSource;

        this.jsonParameterConfigJavascriptSource = jsonParameterConfigJavascriptSource;

        this.setType(PARAMETER_TYPE_JSON);

        this.setGroovyScriptFile(jsonParameterConfigSource.getGroovyScriptFile());
        this.setGroovyScript(jsonParameterConfigSource.getGroovyScript());
        this.setBindings(jsonParameterConfigSource.getBindings());
        this.setGroovyClasspath(jsonParameterConfigSource.getGroovyClasspath());

        this.setJavascript(jsonParameterConfigJavascriptSource.getJavascript());
        this.setJavascriptFile(jsonParameterConfigJavascriptSource.getJavascriptFile());

        this.saveJSONParameterToFile = saveJSONParameterToFile;
    }

    public JavascriptSource getJsonParameterConfigJavascriptSource() {
        return jsonParameterConfigJavascriptSource;
    }

    public void setJsonParameterConfigJavascriptSource(JavascriptSource jsonParameterConfigJavascriptSource) {
        this.jsonParameterConfigJavascriptSource = jsonParameterConfigJavascriptSource;
    }

    public GroovyscriptSource getJsonParameterConfigSource() {
        return jsonParameterConfigSource;
    }

    public void setJsonParameterConfigSource(GroovyscriptSource jsonParameterConfigSource) {
        this.jsonParameterConfigSource = jsonParameterConfigSource;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
