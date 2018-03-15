import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.interoperability.rsa.internal.extended.UMLResourcesUtilExtended;
import org.eclipse.papyrusrt.umlrt.tooling.rsa.umlrt.UMLRealTimePackage;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import java.util.function.Consumer;

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

    public static void main(String[] args) {
        URI modelFileURI = URI.createFileURI("C:/Users/" + System.getProperty("user.name") + "/Desktop/PingPong.uml");
//        init();
//        Model model = loadModel(modelFileURI);

        /**
         * FIRST WAY?
         */
//
        ResourceSet resourceSet = new ResourceSetImpl();

        UMLResourcesUtilExtended.init(resourceSet);
        UMLResourcesUtilExtended.initLocalRegistries(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UML302UMLResourceFactoryStandAloneImpl());
        resourceSet.getPackageRegistry().put("http:///schemas/UMLRealTime/_3TUzoHq6Ed2hSeAAWZznoA/119", UMLRealTimePackage.eINSTANCE);

        Resource resource = resourceSet.getResource(modelFileURI, true);
        Consumer<String> test = System.out::print;
        test.accept("TEST");


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
    }

}
