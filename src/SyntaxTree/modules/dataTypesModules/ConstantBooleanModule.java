package SyntaxTree.modules.dataTypesModules;

import SyntaxTree.dataTypes.Boolean;
import SyntaxTree.generic.Type;
import com.google.inject.AbstractModule;

public class ConstantBooleanModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Type.class).to(Boolean.class);
       
    }
}
