package SyntaxTree.calculatorsTest.booleanMockitoTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.UnaryOperation;
import SyntaxTree.operators.UnaryOperator;
import junit.framework.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class NotTest {

    public NotTest() {
    }

    @Test
    public void doubleDoubleAddTest() {
        Constant mockConstantA = mock(Constant.class);
        when(mockConstantA.evaluate()).thenReturn(new Boolean(true));
        Node notNode = new UnaryOperation(mockConstantA, UnaryOperator.getNOT());
        Assert.assertEquals(false, notNode.evaluate().getValue());
    }

  
}