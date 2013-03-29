package SyntaxTree.calculatorsTest.numberTest;

import SyntaxTree.dataTypes.Double;
import SyntaxTree.dataTypes.Integer;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class MulTest {

    public MulTest() {
    }

    @Test
    public void integerIntegerMulTest() {
        Node node = new BinaryOperation(new Constant(new Integer(5)), new Constant(new Integer(1)), BinaryOperator.getMULTIPLY());
        Assert.assertEquals(5, node.evaluate().getValue());
    }

    @Test
    public void integerDoubleMulTest() {
        Node node = new BinaryOperation(new Constant(new Integer(6)), new Constant(new Double(3.0)), BinaryOperator.getMULTIPLY());
        Assert.assertEquals(18.0, node.evaluate().getValue());
    }

    @Test
    public void doubleDoubleMulTest() {
        Node node = new BinaryOperation(new Constant(new Double(5.0)), new Constant(new Double(5.0)), BinaryOperator.getMULTIPLY());
        Assert.assertEquals(25.0, node.evaluate().getValue());
    }

    @Test
    public void doubleIntegerMulTest() {
        Node node = new BinaryOperation(new Constant(new Double(5.0)), new Constant(new Integer(5)), BinaryOperator.getMULTIPLY());
        Assert.assertEquals(25.0, node.evaluate().getValue());
    }
}