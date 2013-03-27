package SyntaxTree.calculators;

import SyntaxTree.annotations.Operation;
import SyntaxTree.dataTypes.Double;
import SyntaxTree.dataTypes.Integer;
import SyntaxTree.dataTypes.String;

public class StringCalculator implements Calculator {

    public StringCalculator() {
    }

    @Operation("+")
    public static String add(String A, String B) {
        return new String(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static String add(String A, Double B) {
        return new String(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static String add(Double A, String B) {
        return new String(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static String add(String A, Integer B) {
        return new String(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static String add(Integer A, String B) {
        return new String(A.getValue() + B.getValue());
    }
}
