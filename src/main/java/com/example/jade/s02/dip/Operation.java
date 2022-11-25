/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s02.dip;

/**
 * An operation that could be executed by a calculator
 */
@FunctionalInterface
public interface Operation {
    /**
     * Execute the required operation
     * 
     * @param left  first operand
     * @param right second operand
     * @return the result
     */
    double operate(double left, double right);
}
