package SyntaxTree.hashMapMockitoTest;

import SyntaxTree.calculators.NumberCalculator;
import SyntaxTree.dataTypes.Double;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class GetMethodFromHashMap {

    public GetMethodFromHashMap() {
    }

    @Test
    public void getMethodFromHashMap() throws NoSuchMethodException {
        HashMap<String, Method> mockMethodsIntoHashMap = mock(HashMap.class);
        String nameMethod = "add";
        Class[] parameters = {Double.class, Double.class};
        NumberCalculator numberCalculator = mock(NumberCalculator.class);
        Method method = numberCalculator.getClass().getMethod(nameMethod, parameters);
        when(mockMethodsIntoHashMap.get("signature")).thenReturn(method);
        Assert.assertEquals(mockMethodsIntoHashMap.get("signature"), method);
        mockMethodsIntoHashMap.clear();
    }
}
