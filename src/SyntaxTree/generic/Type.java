package SyntaxTree.generic;

public class Type<T> {

    private T value;

    public Type(T value) {
        this.value = value;
    }

    public Type() {
        this.value = (T) new Type<T>();
    }

    public T getValue() {
        return value;
    }
}