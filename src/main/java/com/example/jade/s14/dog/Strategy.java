/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14.dog;

/**
 * Dog strategy for barking
 */
public interface Strategy {
    public static final Strategy DEFAULT = () -> System.out.println("Woof");
    public static final Strategy OFF = () -> System.out.println("<silence>");

    /**
     * How the dog barks
     */
    void bark();
}
