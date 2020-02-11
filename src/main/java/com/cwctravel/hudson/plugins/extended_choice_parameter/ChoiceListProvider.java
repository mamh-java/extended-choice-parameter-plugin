/*
 *Copyright (c) 2013 Costco, Vimil Saju
 *Copyright (c) 2013 John DiMatteo
 *See the file license.txt for copying permission.
 */

package com.cwctravel.hudson.plugins.extended_choice_parameter;

import hudson.DescriptorExtensionList;
import hudson.ExtensionPoint;
import hudson.model.*;
import jenkins.model.Jenkins;

import java.io.Serializable;
import java.util.List;

/**
 * The abstract base class of modules provides choices.
 * <p>
 * Create a new choice provider in following steps:
 * <ol>
 * <li>Define a new class derived from ChoiceListProvider</li>
 * <li>Override getChoiceList(), which returns the choices.</li>
 * <li>Define the internal public static class named DescriptorImpl, derived from Descriptor&lt;ChoiceListProvider&gt;</li>
 * <li>annotate the DescriptorImpl with Extension</li>
 * </ol>
 */
abstract public class ChoiceListProvider extends AbstractDescribableImpl<ChoiceListProvider> implements ExtensionPoint, Serializable {
    private static final long serialVersionUID = 8965389708210167871L;

    /**
     * Returns the choices.
     *
     * @return the choices list.
     */
    abstract public List<String> getChoiceList();

    /**
     * Returns the default choice value.
     * <p>
     * null indicates the first one is the default value.
     *
     * @return the default choice value.
     */
    public String getDefaultChoice() {
        return null;
    }

    /**
     * Called when a build is triggered
     * <p>
     * Implementations can override this method, and do custom behavior.
     * Default implementation do nothing at all.
     *
     * @param job   the job with which this choice provider is used.
     * @param def   the parameter definition the value specified
     * @param value the value specified.
     */
    public void onBuildTriggeredWithValue(
            AbstractProject<?, ?> job,
            ExtendedChoiceParameterDefinition def,
            String value
    ) {
        // Nothing to do.
    }

    /**
     * Called when a build is completed
     * <p>
     * Implementations can override this method, and do custom behavior.
     * Default implementation do nothing at all.
     *
     * @param build the build with which this choice provider is used.
     * @param def   the parameter definition the value specified
     * @param value the value specified.
     */
    public void onBuildCompletedWithValue(
            AbstractBuild<?, ?> build,
            ExtendedChoiceParameterDefinition def,
            String value
    ) {
        // Nothing to do.
    }

    /**
     * Returns all the ChoiceListProvider subclass whose DescriptorImpl is annotated with Extension.
     *
     * @return DescriptorExtensionList of ChoiceListProvider subclasses.
     */
    static public DescriptorExtensionList<ChoiceListProvider, Descriptor<ChoiceListProvider>> all() {
        return Jenkins.get().getDescriptorList(ChoiceListProvider.class);
    }
}
