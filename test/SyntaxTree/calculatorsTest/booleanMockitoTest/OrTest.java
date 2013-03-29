package SyntaxTree.calculatorsTest.booleanMockitoTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class OrTest {

    @Test
    public void orTest() {
       Constant mockConstantA = mock(Constant.class);
        when(mockConstantA.evaluate()).thenReturn(new Boolean(false));
        Constant mockConstantB = mock(Constant.class);
        when(mockConstantB.evaluate()).thenReturn(new Boolean(false));
        Node node = new BinaryOperation( mockConstantA, mockConstantB, BinaryOperator.getOR());
        Assert.assertEquals(false, node.evaluate().getValue());
    }
}
