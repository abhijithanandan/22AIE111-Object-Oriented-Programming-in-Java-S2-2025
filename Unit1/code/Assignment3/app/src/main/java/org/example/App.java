package org.example;

public class App {

    /**
     * Returns a multi-line string with size (in bits) and default values
     * for each primitive data type in Java.
     */
    public String getDataTypesInfo() {
        // Note: default values apply to instance variables.
        return "byte: " + Byte.SIZE + " bits, default = 0\n"
             + "short: " + Short.SIZE + " bits, default = 0\n"
             + "int: " + Integer.SIZE + " bits, default = 0\n"
             + "long: " + Long.SIZE + " bits, default = 0L\n"
             + "float: " + Float.SIZE + " bits, default = 0.0f\n"
             + "double: " + Double.SIZE + " bits, default = 0.0d\n"
             + "char: " + Character.SIZE + " bits, default = '\\u0000'\n"
             + "boolean: 1 bit (technically JVM-dependent), default = false\n";
    }

    public static void main(String[] args) {
        App app = new App();
        // Print the data types info
        System.out.println(app.getDataTypesInfo());
    }
}

