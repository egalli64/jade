/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Just to keep DRY the examples. Data and methods for the singleton.
 */
public abstract class BaseSingleton {
    /** Singleton instance data member */
    private AtomicInteger life;

    /** Notice that the ctor is private */
    protected BaseSingleton() {
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
