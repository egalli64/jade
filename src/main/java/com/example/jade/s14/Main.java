/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyIterableString mis = new MyIterableString("ciao");

        Iterator<Character> it = mis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Character c : mis) {
            System.out.println(c);
        }
    }
}
