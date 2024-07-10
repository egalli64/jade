/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s10;

public class AdapterMain {
    public static void main(String[] args) {
        CoffeeMachineLegacy cml = new CoffeeMachineLegacy();
        CoffeeMachineAdapter cma = new CoffeeMachineAdapter(cml);

        System.out.println("Selecting the first one");
        cma.select1();

        System.out.println("Selecting the second one");
        cma.select2();
    }
}
