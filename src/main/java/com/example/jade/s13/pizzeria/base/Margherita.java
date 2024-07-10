/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.pizzeria.base;

/**
 * Concrete Component
 */
public class Margherita implements Pizza {

    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
