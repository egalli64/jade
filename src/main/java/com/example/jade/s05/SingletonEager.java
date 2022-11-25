/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Singleton Design Pattern - Eager implementation by static data member
 */
public class SingletonEager {
    /** The singleton */
    private static final SingletonEager instance = new SingletonEager();

    // when it is not so easy: static initializer
//    static {
//    	// ...
//    	instance = new SingletonEager();
//      // ...
//    }

    /** Singleton instance data member */
    private int life;

    /** Notice that the ctor is private */
    private SingletonEager() {
        this.life = 42;
    }

    /**
     * Unique access to the singleton
     * 
     * @return The singleton
     */
    public static SingletonEager getInstance() {
        return instance;
    }

    /**
     * An instance method
     * 
     * @return true if the singleton is alive
     */
    public boolean isAlive() {
        return life > 0;
    }

    /**
     * Another instance method, kill the singleton
     */
    public void kill() {
        life = 0;
    }
}
