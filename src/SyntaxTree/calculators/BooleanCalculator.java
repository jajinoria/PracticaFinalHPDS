package SyntaxTree.calculators;

import SyntaxTree.annotations.Operation;
import SyntaxTree.dataTypes.Boolean;

public class BooleanCalculator implements Calculator {

    public BooleanCalculator() {
    }

    @Operation("&&")
    public static Boolean and(Boolean A, Boolean B) {
        return new Boolean(A.getValue() && B.getValue());
    }

    @Operation("||")
    public static Boolean or(Boolean A, Boolean B) {
        return new Boolean(A.getValue() || B.getValue());
    }

    @Operation("!")
    public static Boolean not(Boolean A) {
        return new Boolean(!A.getValue());
    }
}
