package com.example.jade.s12.pizzeria.base;

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
