package SyntaxTree.calculatorsTest.numberTest;

import SyntaxTree.dataTypes.Double;
import SyntaxTree.dataTypes.Integer;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import junit.framework.Assert;
import org.junit.Test;

public class AddTest {

    public AddTest() {
    }

    @Test
    public void integerIntegerAddTest() {
        Node node = new BinaryOperation(new Constant(new Integer(5)), new Constant(new Integer(10)), BinaryOperator.ADD);
        Assert.assertEquals(15, node.evaluate().getValue());
    }

    @Test
    public void integerDoubleAddTest() {
        Node node = new BinaryOperation(new Constant(new Integer(6)), new Constant(new Double(4.0)), BinaryOperator.ADD);
        Assert.assertEquals(10.0, node.evaluate().getValue());
    }

    @Test
    public void doubleDoubleAddTest() {
        Node node = new BinaryOperation(new Constant(new Double(5.0)), new Constant(new Double(5.0)), BinaryOperator.ADD);
        Assert.assertEquals(10.0, node.evaluate().getValue());
    }

    @Test
    public void doubleIntegerAddTest() {
        Node node = new BinaryOperation(new Constant(new Double(5.0)), new Constant(new Integer(5)), BinaryOperator.ADD);
        Assert.assertEquals(10.0, node.evaluate().getValue());
    }
}