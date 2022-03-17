package com.example.jade.s15;

public interface Subscriber {
    public void update(String blog, String title);

    public void leave();
}