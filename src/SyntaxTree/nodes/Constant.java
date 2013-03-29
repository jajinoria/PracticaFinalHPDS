package SyntaxTree.nodes;

import SyntaxTree.generic.Type;
import com.google.inject.Inject;

public class Constant extends Node {

    private Type value;

    @Inject
    public Constant(Type value) {
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }

  
}