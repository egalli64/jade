/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s15.dog;

/**
 * Dog strategy for barking
 */
public interface Strategy {
    /** The default barking strategy for a common dog */
    public static final Strategy DEFAULT = () -> System.out.println("Woof");
    /** The no-barking strategy */
    public static final Strategy OFF = () -> System.out.println("<silence>");

    /**
     * The barking algorithm
     */
    void bark();
}
