package SyntaxTree.nodes;

import SyntaxTree.generic.Type;

public class Constant extends Node {

    private final Type value;

    public Constant(Type value) {
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }
}