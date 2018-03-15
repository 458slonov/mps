package org.eclipse.papyrus.interoperability.rsa.internal.extended;

import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLContentHandlerImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.*;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dnikeshk on 3/15/2018.
 */
public class UMLResourcesUtilExtended extends UMLResourcesUtil {

    private static final ContentHandler XMI_CONTENT_HANDLER = new XMLContentHandlerImpl.XMI();

    private static final ContentHandler UML2_1_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            UML22UMLResource.UML2_CONTENT_TYPE_IDENTIFIER,
            new String[]{UML22UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            UML22UMLResource.UML2_METAMODEL_NS_URI, null);

    private static final ContentHandler UML2_2_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            UMLResource.UML_2_0_0_CONTENT_TYPE_IDENTIFIER,
            new String[]{UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND, UML2_UML_PACKAGE_2_0_NS_URI, null);

    private static final ContentHandler UML2_2_1_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER,
            new String[]{UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            UML212UMLResource.UML_METAMODEL_NS_URI, null);

    private static final ContentHandler UML2_3_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER,
            new String[]{UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            UML302UMLResource.UML_METAMODEL_NS_URI, null);

    private static final ContentHandler UML2_4_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            UMLResource.UML_4_0_0_CONTENT_TYPE_IDENTIFIER,
            new String[]{UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            UML402UMLResource.UML_METAMODEL_NS_URI, null);

    private static final ContentHandler UML2_5_0_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            UMLResource.UML_5_0_0_CONTENT_TYPE_IDENTIFIER,
            new String[]{UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND, UMLPackage.eNS_URI, null);

    private static final ContentHandler OMG_2_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            XMI2UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER,
            new String[]{XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            XMI2UMLResource.UML_METAMODEL_2_1_NS_URI, null);

    private static final ContentHandler OMG_2_1_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            XMI2UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER,
            new String[]{XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI, null);

    private static final ContentHandler OMG_2_2_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            XMI2UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER,
            new String[]{XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            XMI2UMLResource.UML_METAMODEL_2_2_NS_URI, null);

    private static final ContentHandler OMG_2_4_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER,
            new String[]{XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            XMI2UMLResource.UML_METAMODEL_2_4_NS_URI, null);

    private static final ContentHandler OMG_2_4_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            XMI2UMLResource.UML_2_4_1_CONTENT_TYPE_IDENTIFIER,
            new String[]{XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            XMI2UMLResource.UML_METAMODEL_2_4_1_NS_URI, null);

    private static final ContentHandler OMG_2_5_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            XMI2UMLResource.UML_2_5_CONTENT_TYPE_IDENTIFIER,
            new String[]{XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            XMI2UMLResource.UML_METAMODEL_2_5_NS_URI, null);

    private static final ContentHandler CMOF_2_0_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            CMOF2UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER, new String[]{
            CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            CMOF2UMLResource.CMOF_2_0_METAMODEL_NS_URI, null);

    private static final ContentHandler CMOF_2_4_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            CMOF2UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER, new String[]{
            CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            CMOF2UMLResource.CMOF_2_4_METAMODEL_NS_URI, null);

    private static final ContentHandler CMOF_2_4_1_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            CMOF2UMLResource.CMOF_2_4_1_CONTENT_TYPE_IDENTIFIER, new String[]{
            CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            CMOF2UMLResource.CMOF_2_4_1_METAMODEL_NS_URI, null);

    private static final ContentHandler CMOF_2_5_CONTENT_HANDLER = new RootXMLContentHandlerImpl(
            CMOF2UMLResource.CMOF_2_5_CONTENT_TYPE_IDENTIFIER, new String[]{
            CMOF2UMLResource.FILE_EXTENSION, XMI2UMLResource.FILE_EXTENSION},
            RootXMLContentHandlerImpl.XMI_KIND,
            CMOF2UMLResource.CMOF_2_5_METAMODEL_NS_URI, null);


    private static final ContentHandler UML2_2_0_0_CONTENT_HANDLER_RSA = new RootXMLContentHandlerImpl(
            UMLResourceExtended.UML_2_0_0_RSA_CONTENT_TYPE_IDENTIFIER,
            UMLResourceExtended.FILE_EXTENSIONS_RSA,
            RootXMLContentHandlerImpl.XMI_KIND,
            UML2_UML_PACKAGE_2_0_NS_URI, null);
    private static final ContentHandler UML2_2_1_0_CONTENT_HANDLER_RSA = new RootXMLContentHandlerImpl(
            UMLResourceExtended.UML_2_1_0_RSA_CONTENT_TYPE_IDENTIFIER,
            UMLResourceExtended.FILE_EXTENSIONS_RSA,
            RootXMLContentHandlerImpl.XMI_KIND,
            UML212UMLResource.UML_METAMODEL_NS_URI, null);
    private static final ContentHandler UML2_3_0_0_CONTENT_HANDLER_RSA = new RootXMLContentHandlerImpl(
            UMLResourceExtended.UML_3_0_0_RSA_CONTENT_TYPE_IDENTIFIER,
            UMLResourceExtended.FILE_EXTENSIONS_RSA,
            RootXMLContentHandlerImpl.XMI_KIND,
            UML302UMLResource.UML_METAMODEL_NS_URI, null);
    private static final ContentHandler UML2_4_0_0_CONTENT_HANDLER_RSA = new RootXMLContentHandlerImpl(
            UMLResourceExtended.UML_4_0_0_RSA_CONTENT_TYPE_IDENTIFIER,
            UMLResourceExtended.FILE_EXTENSIONS_RSA,
            RootXMLContentHandlerImpl.XMI_KIND,
            UML402UMLResource.UML_METAMODEL_NS_URI, null);
    private static final ContentHandler UML2_5_0_0_CONTENT_HANDLER_RSA = new RootXMLContentHandlerImpl(
            UMLResourceExtended.UML_5_0_0_RSA_CONTENT_TYPE_IDENTIFIER,
            UMLResourceExtended.FILE_EXTENSIONS_RSA,
            RootXMLContentHandlerImpl.XMI_KIND,
            UMLPackage.eNS_URI, null);

    public static org.eclipse.emf.ecore.resource.ContentHandler.Registry initContentHandlerRegistry(org.eclipse.emf.ecore.resource.ContentHandler.Registry contentHandlerRegistry) {
        List<ContentHandler> contentHandlers = contentHandlerRegistry
                .get(ContentHandler.Registry.LOW_PRIORITY);

        if (contentHandlers == null
                || !contentHandlers.contains(XMI_CONTENT_HANDLER)) {

            contentHandlerRegistry.put(ContentHandler.Registry.LOW_PRIORITY,
                    XMI_CONTENT_HANDLER);
        }

        contentHandlers = contentHandlerRegistry
                .get(ContentHandler.Registry.NORMAL_PRIORITY);

        if (contentHandlers == null) {
            contentHandlerRegistry.put(ContentHandler.Registry.NORMAL_PRIORITY,
                    contentHandlers = new ArrayList<ContentHandler>());
        }

        if (!contentHandlers.contains(UML2_2_0_0_CONTENT_HANDLER_RSA)) {
            contentHandlers.add(UML2_2_0_0_CONTENT_HANDLER_RSA);
        }

        if (!contentHandlers.contains(UML2_2_1_0_CONTENT_HANDLER_RSA)) {
            contentHandlers.add(UML2_2_1_0_CONTENT_HANDLER_RSA);
        }

        if (!contentHandlers.contains(UML2_3_0_0_CONTENT_HANDLER_RSA)) {
            contentHandlers.add(UML2_3_0_0_CONTENT_HANDLER_RSA);
        }

        if (!contentHandlers.contains(UML2_4_0_0_CONTENT_HANDLER_RSA)) {
            contentHandlers.add(UML2_4_0_0_CONTENT_HANDLER_RSA);
        }

        if (!contentHandlers.contains(UML2_5_0_0_CONTENT_HANDLER_RSA)) {
            contentHandlers.add(UML2_5_0_0_CONTENT_HANDLER_RSA);
        }

        if (!contentHandlers.contains(UML2_5_0_0_CONTENT_HANDLER)) {
            contentHandlers.add(UML2_5_0_0_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(UML2_4_0_0_CONTENT_HANDLER)) {
            contentHandlers.add(UML2_4_0_0_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(UML2_3_0_0_CONTENT_HANDLER)) {
            contentHandlers.add(UML2_3_0_0_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(UML2_2_1_0_CONTENT_HANDLER)) {
            contentHandlers.add(UML2_2_1_0_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(UML2_2_0_0_CONTENT_HANDLER)) {
            contentHandlers.add(UML2_2_0_0_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(UML2_1_0_0_CONTENT_HANDLER)) {
            contentHandlers.add(UML2_1_0_0_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(OMG_2_5_CONTENT_HANDLER)) {
            contentHandlers.add(OMG_2_5_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(OMG_2_4_1_CONTENT_HANDLER)) {
            contentHandlers.add(OMG_2_4_1_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(OMG_2_4_CONTENT_HANDLER)) {
            contentHandlers.add(OMG_2_4_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(OMG_2_2_CONTENT_HANDLER)) {
            contentHandlers.add(OMG_2_2_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(OMG_2_1_1_CONTENT_HANDLER)) {
            contentHandlers.add(OMG_2_1_1_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(OMG_2_1_CONTENT_HANDLER)) {
            contentHandlers.add(OMG_2_1_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(CMOF_2_5_CONTENT_HANDLER)) {
            contentHandlers.add(CMOF_2_5_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(CMOF_2_4_1_CONTENT_HANDLER)) {
            contentHandlers.add(CMOF_2_4_1_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(CMOF_2_4_CONTENT_HANDLER)) {
            contentHandlers.add(CMOF_2_4_CONTENT_HANDLER);
        }

        if (!contentHandlers.contains(CMOF_2_0_CONTENT_HANDLER)) {
            contentHandlers.add(CMOF_2_0_CONTENT_HANDLER);
        }

        return contentHandlerRegistry;
    }
}
