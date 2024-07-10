/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s16;

public interface Observee {
    void register(Observer observer);

    void remove(Observer observer);
}