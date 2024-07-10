/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s17;

public class ClassicClient {
    private DataService ds;

    public ClassicClient() {
        this.ds = new DataServiceOne();
    }

    public void doSomething() {
        System.out.println(ds.getData());
    }
}
