/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s16;

public class Follower implements Observer {
    private String name;
    private Observee publisher;

    public Follower(String name, Observee publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public void update(String blog, String title) {
        System.out.println(String.format("%s: Blog '%s' has a new post titled '%s'", name, blog, title));
    }

    @Override
    public void leave() {
        publisher.remove(this);
    }
}