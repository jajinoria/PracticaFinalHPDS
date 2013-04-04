package SyntaxTree.guiceModules.dataTypesModule;

import SyntaxTree.dataTypes.Integer;
import SyntaxTree.generic.Type;
import com.google.inject.AbstractModule;

public class ConstantIntegerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Type.class).to(Integer.class);
    }
}
