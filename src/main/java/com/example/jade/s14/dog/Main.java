/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14.dog;

/**
 * Smoke test for dogs with barking strategies
 */
public class Main {
    /**
     * Create a couple of dogs with their standard barking strategy, then change
     * them. See the change in their behavior.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        Dog plush = new PlushDog();
        plush.bark();

        dog.setStrategy(() -> System.out.println("Growl ..."));
        plush.setStrategy(() -> System.out.println("Yap!"));

        System.out.println("Careful! The dogs have changed their barking strategies!");
        dog.bark();
        plush.bark();
    }
}
