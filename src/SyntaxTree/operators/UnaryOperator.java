package SyntaxTree.operators;

public class UnaryOperator extends Operator {

    public static final UnaryOperator NOT = new UnaryOperator("|", "not");
    public static final UnaryOperator SIN = new UnaryOperator("sin", "sin");
    public static final UnaryOperator COS = new UnaryOperator("cos", "cos");
    public static final UnaryOperator TAN = new UnaryOperator("tan", "tan");

    private UnaryOperator(String symbol, String name) {
        super(symbol, name);
    }
}