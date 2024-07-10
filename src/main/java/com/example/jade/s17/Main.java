/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s17;

public class Main {
    public static void main(String[] args) {
        System.out.print("Classic client: ");
        new ClassicClient().doSomething();

        System.out.print("DI client: ");
        Injector.createClient().doSomething();
    }
}
