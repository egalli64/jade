/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s02.dip;

import java.util.function.ToDoubleBiFunction;

/**
 * Using Dependency Inversion Principle
 * <p>
 * No hierarchy needed, the operation is dynamically injected at runtime
 */
public class FunCalculator {
    /** Standard functional interface (reference based) */
    private ToDoubleBiFunction<Double, Double> operation;

    /**
     * The user inject in the data member the required operation
     * 
     * @param operation the function to be executed by calculate
     */
    public FunCalculator(ToDoubleBiFunction<Double, Double> operation) {
        this.operation = operation;
    }

    /**
     * Apply an operation determined at runtime
     * 
     * @param left  first operand
     * @param right second operand
     * @return the result
     */
    public double calculate(double left, double right) {
        return operation.applyAsDouble(left, right);
    }
}
