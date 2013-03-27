package SyntaxTree.nodes;



public class Constant extends Node {

    private final Double value;

    public Constant(Double value) {
        this.value = value;
    }

    @Override
    public Double evaluate() {
        return value;
    }
}