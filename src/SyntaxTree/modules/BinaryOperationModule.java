package SyntaxTree.modules;

import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operators.BinaryOperator;
import SyntaxTree.operators.Operator;
import com.google.inject.AbstractModule;

public class BinaryOperationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Operator.class).to(BinaryOperator.class);       
        bind(Node.class).to(Constant.class);
    }
}
