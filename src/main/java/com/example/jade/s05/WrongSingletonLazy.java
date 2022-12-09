/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * WRONG Singleton Design Pattern - Lazy
 */
public class WrongSingletonLazy extends BaseSingleton {
    // !!! being volatile here is not enough !!!
    private static volatile WrongSingletonLazy instance = null;

    private WrongSingletonLazy() {
    }

    /**
     * !!! NO SYNCHRONIZATION !!!
     * 
     * @return the instance (or "an" instance!)
     */
    public static WrongSingletonLazy getInstance() {
        if (instance == null) {
            // !!! more than one thread could get here !!!
            instance = new WrongSingletonLazy();
        }
        return instance;
    }
}
