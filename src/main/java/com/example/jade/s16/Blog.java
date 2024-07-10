/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s16;

import java.util.HashSet;
import java.util.Set;

public class Blog implements Observee {
    private Set<Observer> observers;
    private String name;
    private String currentPostTitle;

    public Blog(String name) {
        this.name = name;
        this.observers = new HashSet<>();
        this.currentPostTitle = "none";
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void addPost(String title) {
        this.currentPostTitle = title;

        for (Observer observer : observers) {
            observer.update(name, currentPostTitle);
        }
    }
}