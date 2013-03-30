package SyntaxTree.operations;

import SyntaxTree.generic.Type;
import SyntaxTree.nodes.Node;
import SyntaxTree.nodes.Operation;
import SyntaxTree.operators.Operator;
import SyntaxTree.operators.OperatorsToHashMap;
import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnaryOperation extends Operation {

    private Node child;
    private Operator operator;
    private OperatorsToHashMap operatorsIntoHashMap = new OperatorsToHashMap();

    public void setChild(Node child) {
        this.child = child;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Node getChild() {
        return child;
    }

    @Inject
    public UnaryOperation(Node node, Operator operator) {
        this.child = node;
        this.operator = operator;
    }

    @Override
    public Type evaluate() {
        try {
            return operatorsIntoHashMap.getOperationResult(new Type[]{child.evaluate()}, operator);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(UnaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}