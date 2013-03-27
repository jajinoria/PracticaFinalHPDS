package SyntaxTree.calculatorsTest.booleanTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.UnaryOperation;
import SyntaxTree.operators.UnaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class NotTest {

    public NotTest() {
    }

    @Test
    public void doubleDoubleAddTest() {
        Node notNode = new UnaryOperation(new Constant(new Boolean(true)), UnaryOperator.NOT);
        Assert.assertEquals(false, notNode.evaluate().getValue());
    }

  
}