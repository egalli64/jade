package com.example.jade.s15;

public interface Observer {
    public void update(String blog, String title);

    public void leave();
}