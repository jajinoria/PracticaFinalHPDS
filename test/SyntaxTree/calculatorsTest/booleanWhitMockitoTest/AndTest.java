package SyntaxTree.calculatorsTest.booleanWhitMockitoTest;

import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;
import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.operators.Operator;
import static org.mockito.Mockito.*;

public class AndTest {

    public AndTest() {
    }

    @Test
    public void andTest() {
        Constant mockConstantA = mock(Constant.class);
        when(mockConstantA.evaluate()).thenReturn(new Boolean(false));
        Constant mockConstantB = mock(Constant.class);
        when(mockConstantB.evaluate()).thenReturn(new Boolean(false));
        BinaryOperator mockBinaryOperator = mock(BinaryOperator.class);
        when (mockBinaryOperator.getName()).thenReturn("and");
        when (mockBinaryOperator.getSymbol()).thenReturn("&&");
        String name = mockBinaryOperator.getName();
        String symbol = mockBinaryOperator.getSymbol();
        Node node = new BinaryOperation( mockConstantA, mockConstantB, new Operator(symbol,name));
        Assert.assertEquals(false, node.evaluate().getValue());
    }    
  

}