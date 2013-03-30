package SyntaxTree.operators;

public class Operator {

    private String symbol = null;
    private String name = null;

    public Operator(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public Operator() {
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}