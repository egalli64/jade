/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14.dog;

/**
 * Each dog has a bark strategy
 */
public class Dog {
    /** the current bark strategy */
    private Strategy strategy;

    /**
     * Dog with own bark strategy
     * 
     * @param strategy a bark strategy
     */
    public Dog(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Plain dog
     */
    public Dog() {
        this(Strategy.DEFAULT);
    }

    /**
     * Change the current bark strategy
     * 
     * @param strategy the new bark strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Use the current bark strategy
     */
    void bark() {
        strategy.bark();
    }
}
