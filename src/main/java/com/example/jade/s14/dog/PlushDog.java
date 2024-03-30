/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14.dog;

/**
 * These dogs have a specific initial barking strategy
 */
public class PlushDog extends Dog {
    /**
     * Not-barking dog
     */
    public PlushDog() {
        super(Strategy.OFF);
    }
}
