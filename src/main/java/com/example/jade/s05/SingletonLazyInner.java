/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Singleton Design Pattern - Lazy implementation delegating check to JVM
 */
public class SingletonLazyInner extends BaseSingleton {
    /** Private! */
    private SingletonLazyInner() {
    }

    private static class Helper {
        /** The singleton */
        private static final SingletonLazyInner instance = new SingletonLazyInner();
    }

    /**
     * Unique access to the singleton
     * 
     * @return The singleton
     */
    public static SingletonLazyInner getInstance() {
        return Helper.instance;
    }
}
