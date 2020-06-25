package model;


import model.BusinessComponents.ApplicationModules.Express_AMImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class ModuleCreator {
    private static Express_AMImpl MODULE_INSTANCE;

    private ModuleCreator() {
        ADFContext.initADFContext(null, null, null, null);
        String amDef = "model.BusinessComponents.ApplicationModules.Express_AM";
        String config = "Express_AMLocal";
        MODULE_INSTANCE =(Express_AMImpl) Configuration.createRootApplicationModule(amDef, config);
    }

    public static Express_AMImpl getAppModule() {
        if (MODULE_INSTANCE == null)
            new ModuleCreator();
        return MODULE_INSTANCE;
    }
}
