/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

public class SingletonLazyInnerMain {
    public static void main(String[] args) {
        SingletonLazyInner sLazyInner = SingletonLazyInner.getInstance();
        SingletonLazyInner sLazyInner2 = SingletonLazyInner.getInstance();

        if (sLazyInner.isAlive()) {
            sLazyInner.kill();
            System.out.println("Was alive");
        }

        if (!sLazyInner2.isAlive()) {
            System.out.println("Not alive");
        }
    }
}
