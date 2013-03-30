package SyntaxTree.calculatorsTest.numberTest;

import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.UnaryOperation;
import SyntaxTree.operators.UnaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class TanTest {

    public TanTest() {
    }

    @Test
    public void tanTest() {
        Node node = new UnaryOperation(new Constant(new SyntaxTree.dataTypes.Double(30.0)), UnaryOperator.getTAN());
        Assert.assertEquals(0.577, (double) node.evaluate().getValue(), 0.001);
    }
}
