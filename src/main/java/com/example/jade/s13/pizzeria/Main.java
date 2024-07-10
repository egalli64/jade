/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.pizzeria;

import com.example.jade.s13.pizzeria.base.Margherita;
import com.example.jade.s13.pizzeria.base.Pizza;
import com.example.jade.s13.pizzeria.extra.Rucola;
import com.example.jade.s13.pizzeria.extra.Shrimp;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Margherita();
        System.out.printf("Your order is %s: %.2f%n", p1.getName(), p1.getPrice());

        Pizza p1a = new Rucola(p1);
        System.out.printf("Your order is %s: %.2f%n", p1a.getName(), p1a.getPrice());

        Pizza p1b = new Shrimp(new Rucola(new Margherita()));
        System.out.printf("Your order is %s: %.2f%n", p1b.getName(), p1b.getPrice());
    }
}
