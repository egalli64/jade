/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s07;

public class StaticFactoryMethodMain {
    public static void main(String[] args) {
        Coder coder = Coder.createHiredToday("Tom", 4200);
        System.out.println("Coder created: " + coder);
    }
}
