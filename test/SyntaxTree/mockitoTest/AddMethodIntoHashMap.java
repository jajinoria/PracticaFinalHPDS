
package SyntaxTree.mockitoTest;

import SyntaxTree.calculators.NumberCalculator;
import SyntaxTree.dataTypes.Double;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.junit.Test;
import static org.mockito.Mockito.*;
        


public class AddMethodIntoHashMap {
    
    public AddMethodIntoHashMap() {
    }
    
   @Test
   public void addMethodIntoHashMap() throws NoSuchMethodException
   {
    HashMap <String, Method> mockMethodsIntoHashMap = mock (HashMap.class);
    String nameMethod = "add";
    Class [] parameters = {Double.class, Double.class};
    Method method = NumberCalculator.class.getMethod(nameMethod, parameters);
    mockMethodsIntoHashMap.put("signature", method);
    verify(mockMethodsIntoHashMap).put("signature", method);
    mockMethodsIntoHashMap.clear();       
   }

  
}
