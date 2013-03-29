package SyntaxTree.operators;

public class UnaryOperator extends Operator {

    private static final UnaryOperator NOT = new UnaryOperator("|", "not");
    private static final UnaryOperator SIN = new UnaryOperator("sin", "sin");
    private static final UnaryOperator COS = new UnaryOperator("cos", "cos");
    private static final UnaryOperator TAN = new UnaryOperator("tan", "tan");

    public static UnaryOperator getNOT() {
        return NOT;
    }

    public static UnaryOperator getSIN() {
        return SIN;
    }

    public static UnaryOperator getCOS() {
        return COS;
    }

    public static UnaryOperator getTAN() {
        return TAN;
    }

    private UnaryOperator(String symbol, String name) {
        super(symbol, name);
    }
}