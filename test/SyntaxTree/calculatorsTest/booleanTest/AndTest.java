package SyntaxTree.calculatorsTest.booleanTest;

import SyntaxTree.dataTypes.Integer;
import SyntaxTree.dataTypes.String;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;
import SyntaxTree.dataTypes.Boolean;

public class AndTest {

    public AndTest() {
    }

    @Test
    public void andTest() {
        Node node = new BinaryOperation(new Constant(new Boolean(true)), new Constant(new Boolean(false)), BinaryOperator.AND);
        Assert.assertEquals(false, node.evaluate().getValue());
    }    
  

}