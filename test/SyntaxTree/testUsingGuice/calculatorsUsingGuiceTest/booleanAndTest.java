package SyntaxTree.testUsingGuice.calculatorsUsingGuiceTest;

import SyntaxTree.modules.BinaryOperationModule;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;
import junit.framework.Assert;
import static org.mockito.Mockito.*;
public class booleanAndTest {

    public booleanAndTest() {
    }

    @Test
    public void booleanTest() {
        Injector injector = Guice.createInjector(new BinaryOperationModule());         
        Node node = mock(Node.class);
        node = injector.getInstance(BinaryOperation.class);
        Assert.assertEquals(true, node.evaluate().getValue());

    }
}
