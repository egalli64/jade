package com.example.jade.s02.ioc;

public interface Client {
    void send(String recipient, String message);

    void callback(String sender, String message);
}
