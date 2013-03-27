package SyntaxTree.calculatorsTest.booleanTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class OrTest {

    @Test
    public void orTest() {
        Node node = new BinaryOperation(new Constant(new Boolean(true)), new Constant(new SyntaxTree.dataTypes.Boolean(false)), BinaryOperator.OR);
        Assert.assertEquals(true, node.evaluate().getValue());
    }
}
