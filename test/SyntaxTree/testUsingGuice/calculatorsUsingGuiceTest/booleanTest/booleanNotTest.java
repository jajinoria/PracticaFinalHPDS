package SyntaxTree.testUsingGuice.calculatorsUsingGuiceTest.booleanTest;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.guiceModules.OperationModule.UnaryOperationModule;
import SyntaxTree.nodes.Constant;
import SyntaxTree.operations.UnaryOperation;
import SyntaxTree.operators.UnaryOperator;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

public class booleanNotTest {

    public booleanNotTest() {
    }

    @Test
    public void booleanNotTest() {
        Injector injectorUnaryOperation = Guice.createInjector(new UnaryOperationModule());
        UnaryOperation unaryOperation = injectorUnaryOperation.getInstance(UnaryOperation.class);
        Constant child = injectorUnaryOperation.getInstance(Constant.class);
        Boolean booleanValue = injectorUnaryOperation.getInstance(Boolean.class);
        putInitializationValues(booleanValue, child, unaryOperation);
        Assert.assertEquals(false, unaryOperation.evaluate().getValue());

    }

    private void putInitializationValues(Boolean booleanValue, Constant child, UnaryOperation unaryOperation) {
        booleanValue.setValue(true);
        child.setValue(booleanValue);
        unaryOperation.setChild(child);
        unaryOperation.setOperator(UnaryOperator.getNOT());
    }
}
