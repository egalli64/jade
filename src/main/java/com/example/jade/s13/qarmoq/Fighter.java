/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.qarmoq;

public interface Fighter {
    /**
     * Fight again another actor
     * 
     * @param other the enemy
     * @return true if win 
     */
    boolean fight(Actor other);
}
