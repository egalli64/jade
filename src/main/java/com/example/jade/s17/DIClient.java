/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s17;

public class DIClient {
    private DataService ds;

    public DIClient(DataService ds) {
        this.ds = ds;
    }

    public void doSomething() {
        System.out.println(ds.getData());
    }
}
