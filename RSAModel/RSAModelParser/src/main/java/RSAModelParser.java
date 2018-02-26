import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;

import java.util.function.Consumer;


public class RSAModelParser {

    public static void main(String[] args){
        URI modelFileURI = URI.createFileURI("C:/Users/"+System.getProperty("user.name")+"/Desktop/PingPong.emx");
            ResourceSet resourceSet = new ResourceSetImpl();
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emx", new UMLResourceFactoryImpl());
            Resource resource = resourceSet.getResource(modelFileURI, true);
        Consumer<String> test = System.out::print;
        test.accept("TEST");
    }

}
