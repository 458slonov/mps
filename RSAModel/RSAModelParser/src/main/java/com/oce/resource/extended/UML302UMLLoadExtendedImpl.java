package com.oce.resource.extended;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.uml2.uml.internal.resource.UML302UMLHandler;
import org.eclipse.uml2.uml.internal.resource.UMLLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

public class UML302UMLLoadExtendedImpl
        extends UMLLoadImpl {

    public UML302UMLLoadExtendedImpl(XMLHelper helper) {
        super(helper);
    }

    @Override
    protected DefaultHandler makeDefaultHandler() {
        return new UML302UMLHandlerExtended(resource, helper, options);
    }

}
