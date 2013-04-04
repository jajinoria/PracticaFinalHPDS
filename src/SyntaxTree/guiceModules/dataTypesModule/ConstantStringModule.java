package SyntaxTree.guiceModules.dataTypesModule;

import SyntaxTree.dataTypes.String;
import SyntaxTree.generic.Type;
import com.google.inject.AbstractModule;

public class ConstantStringModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Type.class).to(String.class);
    }
}
