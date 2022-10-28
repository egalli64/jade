package com.example.jade.s12.pizzeria.extra;

import com.example.jade.s12.pizzeria.base.Pizza;

/**
 * Concrete Decorator
 */
public class Rucola extends Decorator {
    public Rucola(Pizza pizza) {
        super(pizza, "rucola", 0.5);
    }
}
