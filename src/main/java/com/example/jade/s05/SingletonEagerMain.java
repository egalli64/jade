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
        SingletonEager sEager = SingletonEager.getInstance();
        SingletonEager sEager2 = SingletonEager.getInstance();

        if (sEager.isAlive()) {
            sEager.kill();
            System.out.println("Was alive");
        }

        if (!sEager2.isAlive()) {
            System.out.println("Not alive anymore");
        }
    }
}
