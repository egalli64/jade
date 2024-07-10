/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s10;

public class CoffeeMachineAdapter implements CoffeeMachine {
    private CoffeeMachineLegacy ocm;

    public CoffeeMachineAdapter(CoffeeMachineLegacy ocm) {
        this.ocm = ocm;
    }

    @Override
    public void select1() {
        ocm.selectA();
    }

    @Override
    public void select2() {
        ocm.selectB();
    }

}
