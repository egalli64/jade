/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.pizzeria.extra;

import com.example.jade.s13.pizzeria.base.Pizza;

/**
 * Concrete Decorator
 */
public class Rucola extends Decorator {
    public Rucola(Pizza pizza) {
        super(pizza, "rucola", 0.5);
    }
}
