/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Singleton Design Pattern - Lazy implementation with double check
 */
public class SingletonLazyDoubleCheck extends BaseSingleton {
    /** The singleton, volatile for the double checking and so not final */
    private static volatile SingletonLazyDoubleCheck instance;

    /** Private! */
    private SingletonLazyDoubleCheck() {
    }

    /**
     * Unique access to the singleton
     * 
     * @return The singleton
     */
    public static SingletonLazyDoubleCheck getInstance() {
        if (instance == null) {
            // Synchronization payed only on creation
            synchronized (SingletonLazyDoubleCheck.class) {
                // double check to avoid double object creation!
                if (instance == null) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
