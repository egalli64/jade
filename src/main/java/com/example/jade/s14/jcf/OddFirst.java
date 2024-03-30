/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14.jcf;

import java.util.Comparator;

/**
 * A custom comparator: odd before even, then natural order
 */
public class OddFirst implements Comparator<Integer> {
    @Override
    public int compare(Integer left, Integer right) {
        if (left % 2 == 1 && right % 2 == 0) {
            return -1;
        }
        if (left % 2 == 0 && right % 2 == 1) {
            return 1;
        }
        return left.compareTo(right);
    }
}