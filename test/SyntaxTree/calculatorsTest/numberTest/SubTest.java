package SyntaxTree.calculatorsTest.numberTest;

import SyntaxTree.dataTypes.Double;
import SyntaxTree.dataTypes.Integer;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class SubTest {

    public SubTest() {
    }

    @Test
    public void integerIntegerSubTest() {
        Node node = new BinaryOperation(new Constant(new Integer(5)), new Constant(new Integer(10)), BinaryOperator.SUBSTRACT);
        Assert.assertEquals(-5, node.evaluate().getValue());
    }

    @Test
    public void integerDoubleSubTest() {
        Node node = new BinaryOperation(new Constant(new Integer(6)), new Constant(new Double(4.0)), BinaryOperator.SUBSTRACT);
        Assert.assertEquals(2.0, node.evaluate().getValue());
    }

    @Test
    public void doubleDoubleAddSub() {
        Node node = new BinaryOperation(new Constant(new Double(5.0)), new Constant(new Double(5.0)), BinaryOperator.SUBSTRACT);
        Assert.assertEquals(0.0, node.evaluate().getValue());
    }

    @Test
    public void doubleIntegerAddSub() {
        Node node = new BinaryOperation(new Constant(new Double(5.0)), new Constant(new Integer(4)), BinaryOperator.SUBSTRACT);
        Assert.assertEquals(1.0, node.evaluate().getValue());
    }
}