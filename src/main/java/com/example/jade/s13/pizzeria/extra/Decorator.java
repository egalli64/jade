/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.pizzeria.extra;

import com.example.jade.s13.pizzeria.base.Pizza;

/**
 * Decorator
 */
public abstract class Decorator implements Pizza {
    private Pizza pizza;
    private String name;
    private double price;

    public Decorator(Pizza pizza, String name, double price) {
        this.pizza = pizza;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return pizza.getName() + " " + name;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + price;
    }
}
