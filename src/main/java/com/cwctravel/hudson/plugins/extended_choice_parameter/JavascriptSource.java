package com.cwctravel.hudson.plugins.extended_choice_parameter;

import org.kohsuke.stapler.DataBoundConstructor;

public class JavascriptSource  {

    public String value;
    public String javascript;
    public String javascriptFile;

    @DataBoundConstructor
    public JavascriptSource(String value, String javascript, String javascriptFile) {
        this.value = value;
        this.javascript = javascript;
        this.javascriptFile = javascriptFile;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}
