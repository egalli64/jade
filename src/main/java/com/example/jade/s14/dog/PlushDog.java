package com.example.jade.s14.dog;

public class PlushDog extends Dog {
    public PlushDog() {
        super(() -> System.out.println("I won't bark"));
    }
}
