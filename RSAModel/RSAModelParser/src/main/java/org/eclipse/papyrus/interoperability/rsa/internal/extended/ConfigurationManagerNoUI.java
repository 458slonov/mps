package org.eclipse.papyrus.interoperability.rsa.internal.extended;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;

import java.io.IOException;

public class ConfigurationManagerNoUI {
    private ResourceSet rset = new ResourceSetImpl();
    private Resource configResource;
    private Config config;

    public ConfigurationManagerNoUI() {
        super();

        // Load or create the configuration resource in the workspace metadata
        URI configURI = URI.createFileURI("/").appendSegment("config.xmi");
        try {
            configResource = rset.getResource(configURI, true);
        } catch (Exception e) {
            // Doesn't exist. Fine. We insist
            configResource = rset.getResource(configURI, false);
        }

        // Get or create the configuration in the configuration resource
        EList<EObject> contents = configResource.getContents();
        if (!contents.isEmpty() && (contents.get(0) instanceof Config)) {
            config = (Config) contents.get(0);
        } else {
            config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
            contents.clear();
            contents.add(config);
        }
    }

    public void dispose() {
        config = null;
        configResource = null;
        EMFHelper.unload(rset);
    }

    public void loadConfig(Config config) {
        EcoreUtil.Copier copier = new EcoreUtil.Copier() {
            private static final long serialVersionUID = 1L;

            @Override
            protected EObject createCopy(EObject eObject) {
                return (eObject == ConfigurationManagerNoUI.this.config)
                        ? config
                        : super.createCopy(eObject);
            }
        };

        copier.copy(this.config);
    }

    public void saveConfig(Config newConfig) {
//        try {
//            if (newConfig == null) {
//                // Delete the saved configuration
//                configResource.delete(null);
//            } else if (!EcoreUtil.equals(config, newConfig)) {
//                EcoreUtil.replace(config, EcoreUtil.copy(newConfig));
//                configResource.save(null);
//            }
//        } catch (IOException e) {
//        }
    }
}
