package SyntaxTree.operations;

import SyntaxTree.nodes.Operation;
import SyntaxTree.generic.Type;
import SyntaxTree.nodes.Node;
import SyntaxTree.operators.Operator;
import SyntaxTree.operators.OperatorsToHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryOperation extends Operation {

    private final Node leftChild;
    private final Node rightChild;
    private final Operator operator;
    private OperatorsToHashMap operatorsIntoHashMap = new OperatorsToHashMap();

    public BinaryOperation(Node LeftChild, Node RightChild, Operator operator) {
        this.leftChild = LeftChild;
        this.rightChild = RightChild;
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public Type evaluate() {
        try {
            return operatorsIntoHashMap.getOperationResult(operator, new Type[]{leftChild.evaluate(), rightChild.evaluate()});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}