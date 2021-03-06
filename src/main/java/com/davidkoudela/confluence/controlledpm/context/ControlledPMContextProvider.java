package com.davidkoudela.confluence.controlledpm.context;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: Extension of {@link AbstractBlueprintContextProvider} providing context information for the ControlledPM blueprints.
 * Copyright (C) 2015 David Koudela
 *
 * @author dkoudela
 * @since 2016-03-17
 */
public class ControlledPMContextProvider extends AbstractBlueprintContextProvider {
    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext blueprintContext) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        blueprintContext.put("currentDate", "<time datetime=\"" + dateFormat.format(date) + "\" />");
        return blueprintContext;
    }
}
