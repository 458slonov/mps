package com.oce.custom.parsing;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.interoperability.rsa.transformation.DependencyAnalysisHelper;


public class ImportResourceSetImpl extends ResourceSetImpl {
    public ImportResourceSetImpl(CustomDependencyAnalysisHelper dependencyHelper){
        super();

        if (dependencyHelper != null) {
            // Install a URI converter that maps *.epx to *.profile.uml where
            // the target actually exists
            setURIConverter(new CustomProfileMappingAwareURIConverter(this, dependencyHelper));
        }
    }
}
