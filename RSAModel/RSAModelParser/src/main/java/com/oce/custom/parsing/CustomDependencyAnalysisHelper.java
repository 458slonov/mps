package com.oce.custom.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.URIMapping;
import org.eclipse.papyrus.interoperability.rsa.transformation.DependencyAnalysisHelper;
import org.eclipse.papyrus.uml.extensionpoints.library.IRegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.library.RegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.profile.IRegisteredProfile;
import org.eclipse.papyrus.uml.extensionpoints.profile.RegisteredProfile;

import java.util.Iterator;

public class CustomDependencyAnalysisHelper extends DependencyAnalysisHelper {
    public CustomDependencyAnalysisHelper(Config config) {
        super(config);
    }

    public URIMapping findExistingProfileMapping(URI profileDefinitionURI, ResourceSet resourceSet) {

        String fileExtension = profileDefinitionURI.fileExtension();

        URIMapping mapping = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
        URI sourceURI = profileDefinitionURI.trimFragment().trimQuery();
        mapping.setSourceURI(sourceURI.toString());

        URI targetURI = null;

        if ("epx".equals(fileExtension)) {
            targetURI = sourceURI.trimFileExtension().appendFileExtension("profile").appendFileExtension("uml");
            try {
                Resource resource = resourceSet.getResource(targetURI, true);
                if (resource != null && !resource.getContents().isEmpty()) {
                    mapping.setTargetURI(targetURI.toString());
                    return mapping;
                }
            } catch (Exception ex) {
                // Ignore: we can't find the target resource
            }
        }

        return findExistingMapping(profileDefinitionURI, resourceSet);
    }

    protected URIMapping findExistingMapping(URI proxyURI, ResourceSet resourceSet) {
        String fileExtension = proxyURI.fileExtension();
        URIMapping mapping = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
        mapping.setSourceURI(proxyURI.trimFragment().trimQuery().toString());
        URI targetURI = null;
        if (rsaExtensions.contains(fileExtension)) {
            targetURI = proxyURI.trimFileExtension().appendFileExtension("uml");
        } else if ("epx".equals(fileExtension)) {
            targetURI = proxyURI.trimFileExtension().appendFileExtension("profile.uml");
        }

        if (targetURI != null) {
            try {
                EObject targetElement = resourceSet.getEObject(targetURI, true);
                if (targetElement != null) {
                    targetURI = EcoreUtil.getURI(targetElement);
                    mapping.setTargetURI(targetURI.trimFragment().trimQuery().toString());
                    return mapping;
                }
            } catch (Exception var14) {
                ;
            }
        }

        if (!this.isRSAModelElement(proxyURI)) {
            URI resourceURI = proxyURI.trimFragment().trimQuery();

            try {
                Resource resource = resourceSet.getResource(resourceURI, true);
                if (resource != null && !resource.getContents().isEmpty()) {
                    mapping.setTargetURI(resourceURI.toString());
                    return mapping;
                }
            } catch (Exception var13) {
                ;
            }
        }

        if (this.isPathFragment(proxyURI)) {
            return null;
        } else {
            return null;
        }
    }
}
