package SyntaxTree.calculatorsTest.booleanWhitMockitoTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.UnaryOperation;
import SyntaxTree.operators.Operator;
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
        UnaryOperator mockUnaryOperator = mock(UnaryOperator.class);
        when (mockUnaryOperator.getName()).thenReturn("not");
        when (mockUnaryOperator.getSymbol()).thenReturn("!");
        String name = mockUnaryOperator.getName();
        String symbol = mockUnaryOperator.getSymbol();
        Node notNode = new UnaryOperation(mockConstantA, new Operator(symbol, name));
        Assert.assertEquals(false, notNode.evaluate().getValue());
    }

  
}