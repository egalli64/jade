/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s08;

/**
 * StringBuilder is a builder for strings
 */
public class StringBuilderExample {
    /**
     * Build a string for the close interval passed (could be increasing or
     * decreasing)
     * 
     * @param begin first element of the sequence (included)
     * @param end   last element of the sequence (included!)
     * @return a string with the sequence in it
     */
    private static String counting(int begin, int end) {
        boolean up = begin <= end ? true : false;
        StringBuilder builder = new StringBuilder("Counting from ");

        builder.append(begin).append(up ? " up " : " down ").append("to ").append(end).append(": ");

        while (begin != end) {
            builder.append(begin).append(", ");
            begin += up ? 1 : -1;
        }
        builder.append(end).append('\n');

        return builder.toString();
    }

    /**
     * A little smoke test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String s = counting(3, 6);
        System.out.println(s);
    }
}
