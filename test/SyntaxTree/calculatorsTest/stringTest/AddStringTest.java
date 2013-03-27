package SyntaxTree.calculatorsTest.stringTest;

import junit.framework.Assert;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import SyntaxTree.nodes.Constant;
import SyntaxTree.dataTypes.String;
import org.junit.Test;
import SyntaxTree.dataTypes.Integer;
import SyntaxTree.dataTypes.Double;

public class AddStringTest {

    public AddStringTest() {
    }

    @Test
    public void stringStringTest() {
        Node node = new BinaryOperation(new Constant(new String("Jose ")), new Constant(new String("Alberto")), BinaryOperator.ADD);
        Assert.assertEquals("Jose Alberto", node.evaluate().getValue());
    }
    
     public void stringIntegerTest() {
        Node node = new BinaryOperation(new Constant(new String("Jose ")), new Constant(new Integer(1)), BinaryOperator.ADD);
        Assert.assertEquals("Jose 1", node.evaluate().getValue());
    }

      public void stringDoubleTest() {
        Node node = new BinaryOperation(new Constant(new String("Jose ")), new Constant(new Double(1.0)), BinaryOperator.ADD);
        Assert.assertEquals("Jose1.0", node.evaluate().getValue());
    }
      
       public void doubleStringTest() {
        Node node = new BinaryOperation(new Constant(new Double(1.0)), new Constant(new String(" Jose")), BinaryOperator.ADD);
        Assert.assertEquals("1.0 Jose", node.evaluate().getValue());
    }
       
        public void integerStringTest() {
        Node node = new BinaryOperation(new Constant(new Integer(1)), new Constant(new String(" Jose")), BinaryOperator.ADD);
        Assert.assertEquals("1 Jose", node.evaluate().getValue());
    }
}