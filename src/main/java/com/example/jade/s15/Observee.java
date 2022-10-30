package com.example.jade.s15;

public interface Observee {
    void register(Observer observer);

    void remove(Observer observer);
}