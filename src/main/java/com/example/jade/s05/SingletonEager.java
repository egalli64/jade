/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Singleton Design Pattern - Eager implementation by static data member
 */
public class SingletonEager extends BaseSingleton {
    /** The singleton */
    private static final SingletonEager instance = new SingletonEager();

    // or static initializer
//    static {
//    	// ...
//    	instance = new SingletonEager();
//      // ...
//    }

    /** Private! */
    private SingletonEager() {
    }

    /**
     * Unique access to the singleton
     * 
     * @return The singleton
     */
    public static SingletonEager getInstance() {
        return instance;
    }
}
