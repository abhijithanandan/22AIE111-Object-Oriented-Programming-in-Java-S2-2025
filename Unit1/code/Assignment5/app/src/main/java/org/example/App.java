package org.example;

public class App {

    /* ==============
       ARITHMETIC
       ============== */
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // integer division (assuming b != 0)
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    /* ==============
       RELATIONAL
       ============== */
    public boolean greaterThan(int a, int b) {
        return a > b;
    }

    public boolean equalTo(int a, int b) {
        return a == b;
    }

    public boolean lessThanOrEqual(int a, int b) {
        return a <= b;
    }

    /* ==============
       LOGICAL
       ============== */
    public boolean logicalAnd(boolean x, boolean y) {
        return x && y;
    }

    public boolean logicalOr(boolean x, boolean y) {
        return x || y;
    }

    public boolean logicalNot(boolean x) {
        return !x;
    }

    /* ==============
       BITWISE
       ============== */
    public int bitwiseAnd(int a, int b) {
        return a & b;
    }

    public int bitwiseOr(int a, int b) {
        return a | b;
    }

    public int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    public int bitwiseNot(int a) {
        return ~a;
    }

    public int leftShift(int a, int shift) {
        return a << shift;
    }

    public int rightShift(int a, int shift) {
        return a >> shift;
    }

    public static void main(String[] args) {
        App app = new App();

        // ARITHMETIC
        System.out.println("Arithmetic Examples:");
        System.out.println("add(10, 3) = " + app.add(10, 3));           // 13
        System.out.println("subtract(10, 3) = " + app.subtract(10, 3)); // 7
        System.out.println("multiply(10, 3) = " + app.multiply(10, 3)); // 30
        System.out.println("divide(10, 3) = " + app.divide(10, 3));     // 3
        System.out.println("modulus(10, 3) = " + app.modulus(10, 3));   // 1

        // RELATIONAL
        System.out.println("\nRelational Examples:");
        System.out.println("greaterThan(10, 3) = " + app.greaterThan(10, 3));  // true
        System.out.println("equalTo(10, 10) = " + app.equalTo(10, 10));        // true
        System.out.println("lessThanOrEqual(3, 3) = " + app.lessThanOrEqual(3, 3)); // true

        // LOGICAL
        System.out.println("\nLogical Examples:");
        System.out.println("logicalAnd(true, false) = " + app.logicalAnd(true, false)); // false
        System.out.println("logicalOr(true, false) = " + app.logicalOr(true, false));   // true
        System.out.println("logicalNot(true) = " + app.logicalNot(true));               // false

        // BITWISE
        System.out.println("\nBitwise Examples:");
        System.out.println("bitwiseAnd(5, 3) = " + app.bitwiseAnd(5, 3)); // 1
        System.out.println("bitwiseOr(5, 3) = " + app.bitwiseOr(5, 3));   // 7
        System.out.println("bitwiseXor(5, 3) = " + app.bitwiseXor(5, 3)); // 6
        System.out.println("bitwiseNot(5) = " + app.bitwiseNot(5));       // -6 (in 32-bit)
        System.out.println("leftShift(5, 1) = " + app.leftShift(5, 1));   // 10
        System.out.println("rightShift(5, 1) = " + app.rightShift(5, 1)); // 2
    }
}

