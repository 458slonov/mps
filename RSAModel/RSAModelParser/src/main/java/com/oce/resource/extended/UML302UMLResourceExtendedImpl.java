package com.oce.resource.extended;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.uml2.uml.internal.resource.UML302UMLLoadImpl;
import org.eclipse.uml2.uml.internal.resource.UMLResourceImpl;
import org.eclipse.uml2.uml.resource.UML302UMLResource;

public class UML302UMLResourceExtendedImpl
        extends UMLResourceImpl
        implements UML302UMLResourceExtended

{

    public UML302UMLResourceExtendedImpl(URI uri) {
        super(uri);
    }

    @Override
    protected XMLLoad createXMLLoad() {
        return new UML302UMLLoadExtendedImpl(createXMLHelper());
    }

}
