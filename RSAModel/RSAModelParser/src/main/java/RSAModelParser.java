import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.interoperability.rsa.transformation.MigrationResourceSet;
import org.eclipse.papyrus.interoperability.rsa.transformation.MigrationResourceSetImpl;
import org.eclipse.uml2.uml.util.UMLUtil;

public class RSAModelParser {
    public static void main(String[] args){
        URI modelFileURI = URI.createFileURI("C:/Users/dnikeshk/Desktop/SimpleCapsuleModel.emx");
//        ResourceSet resourceSet = new ResourceSetImpl();
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "uml", UMLResource.Factory.INSTANCE);
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//        EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/3.0.0/UML", UMLPackage.eINSTANCE);
//        resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/3.0.0/UML", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
//        resourceSet.getPackageRegistry().put("http://www.ibm.com/xtools/1.5.3/Umlnotation", UmlnotationPackage.eINSTANCE);
//        resourceSet.getPackageRegistry().put("http:///schemas/Default/_fNm3AAqoEd6-N_NOT9vsCA/2", DefaultPackage.eINSTANCE);
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emx", new XMIResourceFactoryImpl());
//        Resource resource = resourceSet.getResource(modelFileURI, true);
//        Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
//        ConfigurationManagerNoUI configMan = new ConfigurationManagerNoUI();
//        configMan.loadConfig(config);
//        configMan.saveConfig(config);
//        Config config = new ExtendedUIConfigImpl();
//        config.setMaxThreads(2);
//        config.setConvertOpaqueExpressionToLiteralString(true);
        MigrationResourceSet resourceSet = new MigrationResourceSetImpl(null);
        synchronized (UMLUtil.class) {
            UMLUtil.init(resourceSet);
        }
        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);
        try {
            resourceSet.getResource(modelFileURI, true);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        String test = "dfsfdf";
    }
}
