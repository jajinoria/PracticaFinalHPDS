package SyntaxTree.operators;

public class BinaryOperator extends Operator {

    public static final BinaryOperator ADD = new BinaryOperator("+", "add");
    public static final BinaryOperator SUBSTRACT = new BinaryOperator("-", "sub");
    public static final BinaryOperator MULTIPLY = new BinaryOperator("*", "mul");
    public static final BinaryOperator DIVISION = new BinaryOperator("/", "div");
    public static final BinaryOperator AND = new BinaryOperator("&&", "and");
    public static final BinaryOperator OR = new BinaryOperator("||", "or");

    private BinaryOperator(String symbol, String name) {
        super(symbol, name);
    }
}