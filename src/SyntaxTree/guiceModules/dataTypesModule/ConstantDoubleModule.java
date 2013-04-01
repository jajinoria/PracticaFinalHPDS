package SyntaxTree.guiceModules.dataTypesModule;

import SyntaxTree.dataTypes.Double;
import SyntaxTree.generic.Type;
import com.google.inject.AbstractModule;

public class ConstantDoubleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Type.class).to(Double.class);
       
    }
}
