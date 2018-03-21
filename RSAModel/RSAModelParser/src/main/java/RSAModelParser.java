import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.interoperability.rsa.internal.extended.UMLResourcesUtilExtended;

import java.util.function.Consumer;

public class RSAModelParser {

    public static void main(String[] args) {
//        URI modelFileURI = URI.createFileURI("C:/Users/" + System.getProperty("user.name") + "/Desktop/PingPong.emx");
        URI modelFileURI = URI.createFileURI("C:/GIT/ESW_Reuse/RG_Generic/test/.models/CollectionTest.emx");
        ResourceSet resourceSet = new ResourceSetImpl();

        UMLResourcesUtilExtended.init(resourceSet);
        UMLResourcesUtilExtended.initLocalRegistries(resourceSet);

        Resource resource = resourceSet.getResource(modelFileURI, true);
        Consumer<String> test = System.out::print;
        test.accept("TEST");
    }

}
