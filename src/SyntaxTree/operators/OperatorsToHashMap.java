package SyntaxTree.operators;

import SyntaxTree.annotations.Operation;
import SyntaxTree.calculators.Calculator;
import SyntaxTree.generic.Type;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class OperatorsToHashMap {

    private HashMap<String, Method> methodsIntoHashMap = new HashMap<>();

    public OperatorsToHashMap() {
        Reflections reflection = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
        addMethodsIntoHashMap(reflection.getSubTypesOf(Calculator.class));
    }

    private String getSignature(Method method) {
        String signature = method.getName();
        Class[] parameters = method.getParameterTypes();
        for (Class methodPararms : parameters) {
            signature += methodPararms.getSimpleName();
        }
        return signature;
    }

    private String getSignature(Operator operator, Object[] object) {
        String signature = operator.getName();
        for (Object obj : object) {
            signature += obj.getClass().getSimpleName();
        }
        return signature;
    }

    private void addMethodsIntoHashMap(Set<Class<? extends Calculator>> classes) {
        for (Class clase : classes) {
            addMethodsIntoHashMap(clase);
        }
    }

    private void addMethodsIntoHashMap(Class clase) {
        for (Method method : clase.getDeclaredMethods()) {
            if (!method.isAnnotationPresent(Operation.class)) {
                continue;
            }
            methodsIntoHashMap.put(getSignature(method), method);
        }
    }

    public Type getOperationResult( Type[] types,Operator operator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String signature = getSignature(operator, types);
        return (Type) methodsIntoHashMap.get(signature).invoke(null, (Object[]) types);
    }
}