/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Singleton Design Pattern - Lazy implementation by synchronization
 */
public class SingletonLazy extends BaseSingleton {
    /** The singleton, notice it can't be final */
    private static SingletonLazy instance = null;

    /** Private! */
    private SingletonLazy() {
    }

    /**
     * Unique (expensive) access to the singleton
     * 
     * @return The singleton
     */
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
