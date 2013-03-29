package SyntaxTree.calculatorsTest.numberTest;

import SyntaxTree.dataTypes.Double;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.UnaryOperation;
import SyntaxTree.operators.UnaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class CostTest {

    public CostTest() {
    }

    @Test
    public void cosTest() {
        Node node = new UnaryOperation(new Constant(new Double(30.0)), UnaryOperator.COS);
        Assert.assertEquals(0.866, (double) node.evaluate().getValue(), 0.001);
    }
}
