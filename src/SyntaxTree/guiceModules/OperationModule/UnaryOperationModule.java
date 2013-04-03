package SyntaxTree.guiceModules.OperationModule;

import SyntaxTree.nodes.Constant;
import SyntaxTree.nodes.Node;
import SyntaxTree.operators.Operator;
import SyntaxTree.operators.UnaryOperator;
import com.google.inject.AbstractModule;

public class UnaryOperationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Operator.class).to(UnaryOperator.class);
        bind(Node.class).to(Constant.class);
    }
}
