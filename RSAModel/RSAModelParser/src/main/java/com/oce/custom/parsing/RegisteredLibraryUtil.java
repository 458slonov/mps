package com.oce.custom.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.extensionpoints.library.IRegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.library.RegisteredLibrary;
import org.eclipse.uml2.uml.resource.UMLResource;

import java.util.ArrayList;
import java.util.List;

public class RegisteredLibraryUtil {
    public static List<IRegisteredLibrary> getRegisteredLibraries() {
        List<IRegisteredLibrary> result = new ArrayList<>();
        // // Default elements : UML, Ecore, Java, XML PrimitiveTypes model library
        return result;
    }
}
