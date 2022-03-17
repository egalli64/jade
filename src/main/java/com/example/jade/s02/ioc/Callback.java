package com.example.jade.s02.ioc;

@FunctionalInterface
public interface Callback {
    void callback(String sender, String message);
}
