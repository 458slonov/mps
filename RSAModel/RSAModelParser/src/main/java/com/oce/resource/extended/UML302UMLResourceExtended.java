package com.oce.resource.extended;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.resource.UMLResource;

public interface UML302UMLResourceExtended extends UMLResource {

    public interface Factory
            extends Resource.Factory {

        public static final Factory INSTANCE = new UML302UMLResourceFactoryStandAloneImpl();
    }

    String UML_METAMODEL_NS_URI = "http://www.eclipse.org/uml2/3.0.0/UML"; //$NON-NLS-1$

    String STANDARD_PROFILE_NS_URI = "http://www.eclipse.org/uml2/schemas/Standard/1"; //$NON-NLS-1$

    String STANDARD_PROFILE_URI = PROFILES_PATHMAP + "Standard." + PROFILE_FILE_EXTENSION; //$NON-NLS-1$

}
