package com.oce.resource.extended;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.uml2.uml.internal.resource.UMLHandler;
import org.eclipse.uml2.uml.resource.UML302UMLExtendedMetaData;

import java.util.Map;

public class UML302UMLHandlerExtended
        extends UMLHandler {
    private static boolean FLAG = true;
    public UML302UMLHandlerExtended(XMLResource xmiResource, XMLHelper helper,
                            Map<?, ?> options) {
        super(xmiResource, helper, options);
    }
    @Override
    protected void setAttribValue(EObject object, String name, String value)
    {
        int index = name.indexOf(':', 0);

        // We use null here instead of "" because an attribute without a prefix is considered to have the null target namespace...
        String prefix = null;
        String localName = name;
        if (index != -1)
        {
            prefix    = name.substring(0, index);
            localName = name.substring(index + 1);
        }
        EStructuralFeature feature = getFeature(object, prefix, localName, false);
        if(name.equalsIgnoreCase("kind")&&value.equalsIgnoreCase("assembly")&&FLAG){
            feature = null;
            FLAG=false;
        }
        if (feature == null)
        {
            handleUnknownFeature(prefix, localName, false, object, value);
        }
        else
        {
            int kind = helper.getFeatureKind(feature);

            if (kind == XMLHelper.DATATYPE_SINGLE || kind == XMLHelper.DATATYPE_IS_MANY)
            {
                setFeatureValue(object, feature, value, -2);
            }
            else
            {
                setValueFromId(object, (EReference)feature, value);
            }
        }
    }
}
