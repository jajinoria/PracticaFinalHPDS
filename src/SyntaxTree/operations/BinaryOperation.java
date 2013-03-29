package SyntaxTree.operations;

import SyntaxTree.nodes.Operation;
import SyntaxTree.generic.Type;
import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operators.Operator;
import SyntaxTree.operators.OperatorsToHashMap;
import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import SyntaxTree.dataTypes.Boolean;

public class BinaryOperation extends Operation {

    private Node leftChild;
    private Node rightChild;
    private Operator operator;
    private OperatorsToHashMap operatorsIntoHashMap = new OperatorsToHashMap();

   
    public BinaryOperation(Node LeftChild, Node RightChild, Operator operator) {
        this.leftChild = LeftChild;
        this.rightChild = RightChild;
        this.operator = operator;
    }
   @Inject
    public BinaryOperation() {
        this.leftChild = new Constant(new Boolean(true));
        this.rightChild = new Constant(new Boolean(true));
        this.operator = new Operator("&&", "and");
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
            return operatorsIntoHashMap.getOperationResult(new Type[]{leftChild.evaluate(), rightChild.evaluate()},operator);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


}