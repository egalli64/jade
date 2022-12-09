/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

/**
 * Demo for singleton eager by Enum
 * <p>
 * Two local variables get access to the singleton and work on it
 */
public class SingletonEnumMain {
    public static void main(String[] args) {
        SingletonEnum sEagerEnum = SingletonEnum.INSTANCE;
        SingletonEnum sEagerEnum2 = SingletonEnum.INSTANCE;

        if (sEagerEnum.isAlive()) {
            sEagerEnum.kill();
            System.out.println("Was alive");
        }

        if (!sEagerEnum2.isAlive()) {
            System.out.println("Not alive");
        }
    }
}