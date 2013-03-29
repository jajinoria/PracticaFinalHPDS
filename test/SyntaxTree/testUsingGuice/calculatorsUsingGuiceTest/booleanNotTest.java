package SyntaxTree.testUsingGuice.calculatorsUsingGuiceTest;

import SyntaxTree.modules.BinaryOperationModule;
import SyntaxTree.modules.UnaryOperationModule;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operations.UnaryOperation;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;
import junit.framework.Assert;
import static org.mockito.Mockito.*;

public class booleanNotTest {

    public booleanNotTest() {
    }

    @Test
    public void booleanNotTest() {
        Injector injector = Guice.createInjector(new UnaryOperationModule());         
        Node node = mock(Node.class);
        node = injector.getInstance(UnaryOperation.class);
        Assert.assertEquals(false, node.evaluate().getValue());

    }
}
