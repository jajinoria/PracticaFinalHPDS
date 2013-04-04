package SyntaxTree.generic;

public class Type<T> {

    private T value;

    public Type(T value) {
        this.value = value;
    }

    public Type() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}