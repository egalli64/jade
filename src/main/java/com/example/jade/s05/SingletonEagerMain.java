/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Demo for singleton eager
 * <p>
 * Two local variables get access to the singleton and work on it
 */
public class SingletonEagerMain {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager e2 = SingletonEager.getInstance();

        if (eager.isAlive()) {
            eager.kill();
            System.out.println("Eager was alive");
        }

        if (!e2.isAlive()) {
            System.out.println("As expected, e2 is not alive");
        }
    }
}
