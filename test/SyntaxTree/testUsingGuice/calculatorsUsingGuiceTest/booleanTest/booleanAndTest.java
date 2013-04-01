package SyntaxTree.testUsingGuice.calculatorsUsingGuiceTest.booleanTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.generic.Type;
import SyntaxTree.modules.OperationModules.BinaryOperationModule;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operations.BinaryOperation;
import SyntaxTree.operators.BinaryOperator;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;
import org.junit.Test; 

public class booleanAndTest {
   
    public booleanAndTest() {
    }

    @Test
    public void booleanTest() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Injector injectorBinaryOperation = Guice.createInjector(new BinaryOperationModule());
        BinaryOperation binaryOperator = injectorBinaryOperation.getInstance(BinaryOperation.class);
        Constant rightChild = injectorBinaryOperation.getInstance(Constant.class);
        Constant leftChild = injectorBinaryOperation.getInstance(Constant.class);
        Boolean typeOfRight = injectorBinaryOperation.getInstance(Boolean.class);
        Boolean typeOfLeft = injectorBinaryOperation.getInstance(Boolean.class);
        initializationTypes(typeOfLeft, typeOfRight);
        initializationNodes(rightChild,leftChild,typeOfLeft,typeOfRight);
        initializationBinaryOperation(binaryOperator,leftChild, rightChild);
        Assert.assertEquals(false, binaryOperator.evaluate().getValue());

    }

    private void initializationBinaryOperation(BinaryOperation bin, Node leftChild, Node rightChild) {        
        bin.setLeftChild(leftChild);
        bin.setRightChild(rightChild);
        bin.setOperator(BinaryOperator.getAND()); 
    }

    private void initializationTypes(Boolean typeOfLeft, Boolean typeOfRight) {
        typeOfLeft.setValue(false);
        typeOfRight.setValue(true);
    }

    private void initializationNodes(Constant rightChild, Constant leftChild, Type typeOfRight, Type typeOfLeft) {
        rightChild.setValue(typeOfRight);
        leftChild.setValue(typeOfLeft);
    }
}
