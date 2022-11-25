/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s02.dip;

/**
 * Provide the multiply functionality by override
 * <p>
 * NOT using Dependency Inversion Principle
 */
public class CalculatorMult extends Calculator {
    @Override
    public double calculate(double left, double right) {
        return left * right;
    }
}
