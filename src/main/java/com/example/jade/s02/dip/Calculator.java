/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s02.dip;

/**
 * Base class in a classic design
 * <p>
 * NOT using Dependency Inversion Principle
 */
public abstract class Calculator {
    /**
     * Apply the operation determined by the concrete class
     * 
     * @param left  first operand
     * @param right second operand
     * @return the result
     */
    public abstract double calculate(double left, double right);
}
