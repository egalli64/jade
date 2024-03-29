/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Singleton Design Pattern - Eager implementation by enumerator
 */
public enum SingletonEnum {
    /** The singleton */
    INSTANCE;

    /** Singleton instance data member */
    private final AtomicInteger life;

    /** Private! */
    private SingletonEnum() {
        this.life = new AtomicInteger(42);
    }

    /**
     * An instance method
     * 
     * @return true if the singleton is alive
     */
    public boolean isAlive() {
        return life.get() > 0;
    }

    /**
     * Another instance method, kill the singleton
     */
    public void kill() {
        life.set(0);
    }
}
