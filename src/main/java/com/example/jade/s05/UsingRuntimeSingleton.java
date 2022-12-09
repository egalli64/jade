/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s05;

public class UsingRuntimeSingleton {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        System.out.println("Free memory in the JVM: " + rt.freeMemory());
    }
}
