package com.example.jade.s16;

public class DIClient {
    private DataService ds;

    public DIClient(DataService ds) {
        this.ds = ds;
    }

    public void doSomething() {
        System.out.println(ds.getData());
    }
}
