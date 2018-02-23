import com.ibm.xtools.umlnotation.UmlnotationPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.papyrus.interoperability.rsa.default_.DefaultPackage;
import org.eclipse.papyrusrt.umlrt.tooling.rsa.umlrt.UMLRealTimePackage;
import org.eclipse.papyrusrt.umlrt.tooling.rsa.umlrt.util.UMLRealTimeResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.internal.resource.UML302UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.papyrus.interoperability.rsa.transformation.MigrationResourceSet;
import org.eclipse.papyrus.interoperability.rsa.transformation.MigrationResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.PlatformContentHandlerImpl;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.core.runtime.Platform;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

public class RSAModelParser {

//    /** Resource set containing the model and refered resources. */
//    private static ResourceSet resourceSet;
//    /**
//     * Initializes the code generator:
//     *
//     * <ol>
//     * <li>Creates a resource set.
//     * <li>Initializes the registries for the specified resource set to work with UML2 resources.
//     * <li>Searches for the plugins that contain:
//     * <ul>
//     * <li>The UML-RT profile
//     * <li>The RTCppProperties set profile.
//     * <li>The Ansi C Library.
//     * <li>The UML-RT RTS model library.
//     * </ul>
//     * <li>Registers the UML-RT profile.
//     * <li>Loads and registers the other profiles and libraries:
//     * </ol>
//     */
//    private static void init() {
//        resourceSet = new ResourceSetImpl();
//    }
//    /**
//     * Loads a UML Model given its URI.
//     *
//     * @param fullURI
//     *            - The {@link URI} of the resource containing the model.
//     * @return The {@link org.eclipse.uml2.uml.Model}.
//     */
//    private static Model loadModel(URI fullURI) {
//        return (Model) loadPackage(fullURI);
//    }
//    /**
//     * Loads a UML Package given its URI.
//     *
//     * @param fullURI
//     *            - The {@link URI} of the resource containing the package.
//     * @return The {@link org.eclipse.uml2.uml.Package}.
//     */
//    private static org.eclipse.uml2.uml.Package loadPackage(URI fullURI) {
//        Resource resource = resourceSet.getResource(fullURI, true);
//        EList<EObject> contents = resource.getContents();
//        org.eclipse.uml2.uml.Package pkg = (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType(contents, UMLPackage.Literals.PACKAGE);
//        // displayAllStereotypes( mdl, 0 );
//        return pkg;
//    }
//

    public static void main(String[] args){
        URI modelFileURI = URI.createFileURI("C:/Users/"+System.getProperty("user.name")+"/Desktop/PingPong.emx");
//        init();
//        Model model = loadModel(modelFileURI);

        /**
         * FIRST WAY?
         */
//
            ResourceSet resourceSet = new ResourceSetImpl();
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emx", new UML302UMLResourceFactoryStandAloneImpl());
            UMLUtil.init(resourceSet);
            EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/3.0.0/UML", UMLPackage.eINSTANCE);
            resourceSet.getPackageRegistry().put("http://www.ibm.com/xtools/1.5.3/Umlnotation", UmlnotationPackage.eINSTANCE);
            resourceSet.getPackageRegistry().put("http:///schemas/Default/_fNm3AAqoEd6-N_NOT9vsCA/2", DefaultPackage.eINSTANCE);
            resourceSet.getPackageRegistry().put("http:///schemas/UMLRealTime/_3TUzoHq6Ed2hSeAAWZznoA/119", UMLRealTimePackage.eINSTANCE);
            Resource resource = resourceSet.getResource(modelFileURI, true);



//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "uml", UMLResource.Factory.INSTANCE);
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "uml", UMLResource.Factory.INSTANCE);
//
//
//        resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/3.0.0/UML", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
//





//        Resource resource = resourceSet.getResource(modelFileURI, true);
//        Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
//        ConfigurationManagerNoUI configMan = new ConfigurationManagerNoUI();
//        configMan.loadConfig(config);
//        configMan.saveConfig(config);
//        Config config = new ExtendedUIConfigImpl();
//        config.setMaxThreads(2);
//        config.setConvertOpaqueExpressionToLiteralString(true);
        /**
         * Papyrus-RT way of reading file
         */
//
//        Platform.getContentTypeManager();
//        ContentHandler.Registry.INSTANCE.put(2000,new PlatformContentHandlerImpl());
//        List<ContentHandler> contentHandlerList = ContentHandler.Registry.INSTANCE.contentHandlers();
//        MigrationResourceSet resourceSet = new MigrationResourceSetImpl(null);
//        synchronized (UMLUtil.class) {
//            UMLUtil.init(resourceSet);
//        }
//        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
//        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
//        resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
//        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);
//        try {
//            resourceSet.getResource(modelFileURI, true);
//        } catch (Exception ex) {
//            ex.printStackTrace(System.out);
//        }
        String test = "dfsfdf";
    }

}
