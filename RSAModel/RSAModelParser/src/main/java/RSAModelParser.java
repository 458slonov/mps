import com.oce.custom.parsing.CustomDependencyAnalysisHelper;
import com.oce.custom.parsing.ImportResourceSetImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.impl.ConfigImpl;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UML302UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import java.util.function.Consumer;


public class RSAModelParser {

    public static void main(String[] args) {
        URI modelFileURI = URI.createFileURI("C:/Users/" + System.getProperty("user.name") + "/Desktop/PingPong.emx");
        //URI modelFileURI = URI.createFileURI("C:/Users/" + System.getProperty("user.name") + "/Desktop/PingPong_Cut.uml");
        ResourceSet resourceSet = new ImportResourceSetImpl(null);
        UMLResourcesUtil.init(resourceSet);
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emx", new UML302UMLResourceFactoryImpl());
        Resource resource = resourceSet.getResource(modelFileURI, true);
        Consumer<String> test = System.out::print;
        test.accept("TEST");
    }

}
