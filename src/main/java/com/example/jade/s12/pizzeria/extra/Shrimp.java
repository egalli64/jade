package com.example.jade.s12.pizzeria.extra;

import com.example.jade.s12.pizzeria.base.Pizza;

/**
 * Concrete Decorator
 */
public class Shrimp extends Decorator {
    public Shrimp(Pizza pizza) {
        super(pizza, "shrimp", 2.5);
    }
}
