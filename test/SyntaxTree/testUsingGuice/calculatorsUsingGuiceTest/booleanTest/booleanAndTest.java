package SyntaxTree.testUsingGuice.calculatorsUsingGuiceTest.booleanTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.modules.OperationModules.BinaryOperationModule;
import SyntaxTree.nodes.Constant;
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
        putInitializationvalues(typeOfLeft, typeOfRight, rightChild, leftChild, binaryOperator);
        Assert.assertEquals(false, binaryOperator.evaluate().getValue());

    }

    private void putInitializationvalues(Boolean typeOfLeft, Boolean typeOfRight, Constant rightChild, Constant leftChild, BinaryOperation bin) {
        typeOfLeft.setValue(false);
        typeOfRight.setValue(true);
        rightChild.setValue(typeOfRight);
        leftChild.setValue(typeOfLeft);
        bin.setLeftChild(leftChild);
        bin.setRightChild(rightChild);
        bin.setOperator(BinaryOperator.getAND()); 
    }
}
