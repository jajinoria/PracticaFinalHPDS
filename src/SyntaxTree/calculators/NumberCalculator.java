package SyntaxTree.calculators;

import SyntaxTree.annotations.Operation;
import SyntaxTree.dataTypes.Double;
import SyntaxTree.dataTypes.Integer;
import SyntaxTree.exceptions.DivisionByZero;

public class NumberCalculator implements Calculator {

    public NumberCalculator() {
    }

    @Operation("+")
    public static Double add(Double A, Double B) {
        return new Double(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static Double add(Double A, Integer B) {
        return new Double(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static Double add(Integer A, Double B) {
        return new Double(A.getValue() + B.getValue());
    }

    @Operation("+")
    public static Integer add(Integer A, Integer B) {
        return new Integer(A.getValue() + B.getValue());
    }

    @Operation("-")
    public static Double sub(Double A, Double B) {
        return new Double(A.getValue() - B.getValue());
    }

    @Operation("-")
    public static Double sub(Double A, Integer B) {
        return new Double(A.getValue() - B.getValue());
    }

    @Operation("-")
    public static Double sub(Integer A, Double B) {
        return new Double(A.getValue() - B.getValue());
    }

    @Operation("-")
    public static Integer sub(Integer A, Integer B) {
        return new Integer(A.getValue() - B.getValue());
    }

    @Operation("*")
    public static Double mul(Double A, Double B) {
        return new Double(A.getValue() * B.getValue());
    }

    @Operation("*")
    public static Double mul(Double A, Integer B) {
        return new Double(A.getValue() * B.getValue());
    }

    @Operation("*")
    public static Double mul(Integer A, Double B) {
        return new Double(A.getValue() * B.getValue());
    }

    @Operation("*")
    public static Integer mul(Integer A, Integer B) {
        return new Integer(A.getValue() * B.getValue());
    }

    @Operation("/")
    public static Integer div(Integer A, Integer B) {
        if (B.getValue() != 0) {
            return new Integer(A.getValue() / B.getValue());
        }
        throw new DivisionByZero();
    }

    @Operation("/")
    public static Double div(Double A, Integer B) {
        if (B.getValue() != 0) {
            return new Double(A.getValue() / B.getValue());
        }
        throw new DivisionByZero();
    }

    @Operation("/")
    public static Double div(Double A, Double B) {
        if (B.getValue() != 0) {
            return new Double(A.getValue() / B.getValue());
        }
        throw new DivisionByZero();
    }

    @Operation("/")
    public static Double div(Integer A, Double B) {
        if (B.getValue() != 0) {
            return new Double(A.getValue() / B.getValue());
        }
        throw new DivisionByZero();
    }

    @Operation("sin")
    public static Double sin(Double A) {
        return new Double(Math.sin(Math.toRadians(A.getValue())));
    }

    @Operation("cos")
    public static Double cos(Double A) {
        return new Double(Math.cos(Math.toRadians(A.getValue())));
    }

    @Operation("tan")
    public static Double tan(Double A) {
        return new Double(Math.tan(Math.toRadians(A.getValue())));
    }
}