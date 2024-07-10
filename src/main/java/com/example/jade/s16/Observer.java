/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s16;

public interface Observer {
    public void update(String blog, String title);

    public void leave();
}