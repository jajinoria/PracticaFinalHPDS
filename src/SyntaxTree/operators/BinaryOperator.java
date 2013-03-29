package SyntaxTree.operators;

public class BinaryOperator extends Operator {

    private static final BinaryOperator ADD = new BinaryOperator("+", "add");
    private static final BinaryOperator SUBSTRACT = new BinaryOperator("-", "sub");
    private static final BinaryOperator MULTIPLY = new BinaryOperator("*", "mul");
    private static final BinaryOperator DIVISION = new BinaryOperator("/", "div");
    private static final BinaryOperator AND = new BinaryOperator("&&", "and");
    private static final BinaryOperator OR = new BinaryOperator("||", "or");

   
    public static BinaryOperator getADD() {
        return ADD;
    }

    
    public static BinaryOperator getSUBSTRACT() {
        return SUBSTRACT;
    }

  
    public static BinaryOperator getMULTIPLY() {
        return MULTIPLY;
    }

   
    public static BinaryOperator getDIVISION() {
        return DIVISION;
    }

   
    public static BinaryOperator getAND() {
        return AND;
    }

    
    public static BinaryOperator getOR() {
        return OR;
    }

    private BinaryOperator(String symbol, String name) {
        super(symbol, name);
    }
}