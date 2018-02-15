import com.ibm.xtools.umlnotation.UmlnotationPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.interoperability.rsa.blackbox.RTMappings;
import org.eclipse.papyrus.interoperability.rsa.default_.DefaultPackage;
import org.eclipse.papyrus.interoperability.rsa.internal.ConfigurationManager;
import org.eclipse.papyrus.interoperability.rsa.internal.extended.ConfigurationManagerNoUI;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UML212UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

public class RSAModelParser {
    public static void main(String[] args){
        URI modelFileURI = URI.createFileURI("C:/Users/qdni/Desktop/SimpleCapsuleModel.emx");
        ResourceSet resourceSet = new ResourceSetImpl();
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put( "uml", UMLResource.Factory.INSTANCE);
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//        EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/3.0.0/UML", UMLPackage.eINSTANCE);
//        resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/3.0.0/UML", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
//        resourceSet.getPackageRegistry().put("http://www.ibm.com/xtools/1.5.3/Umlnotation", UmlnotationPackage.eINSTANCE);
//        resourceSet.getPackageRegistry().put("http:///schemas/Default/_fNm3AAqoEd6-N_NOT9vsCA/2", DefaultPackage.eINSTANCE);
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emx", new XMIResourceFactoryImpl());
//        Resource resource = resourceSet.getResource(modelFileURI, true);
//        Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
        ConfigurationManagerNoUI configMan = new ConfigurationManagerNoUI();
//        configMan.loadConfig(config);
//        configMan.saveConfig(config);
    }
}
