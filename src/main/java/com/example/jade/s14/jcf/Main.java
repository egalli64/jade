/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s14.jcf;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Strategy, as implemented by List sort()
 */
public class Main {
    /**
     * Pass a custom comparator reference
     * 
     * @param data the list to be sorted
     */
    private static void classic(List<Integer> data) {
        data.sort(new OddFirst());
        System.out.println("odd first (comparator object): " + data);
    }

    /**
     * Pass a Comparator lambda
     * 
     * @param data the list to be sorted
     */
    private static void modern(List<Integer> data) {
        data.sort((left, right) -> {
            if (left % 2 == 0 && right % 2 == 1) {
                return -1;
            }
            if (left % 2 == 1 && right % 2 == 0) {
                return 1;
            }
            return left.compareTo(right);
        });
        System.out.println("even first (lambda): " + data);
    }

    /**
     * Explicit Comparator from a lambda - code squeezed (ab)using ternary operator
     * 
     * @param data the list to be sorted
     */
    private static void modern2(List<Integer> data) {
        //
        Comparator<Integer> c = (left, right) -> left % 2 == 1 && right % 2 == 0 ? -1 : //
                left % 2 == 0 && right % 2 == 1 ? 1 : left.compareTo(right);
        data.sort(c);
        System.out.println("odd first (lambda as explicit comparator): " + data);
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(42, 7, 5, 12);
        System.out.println("input: " + data);

        classic(data);
        modern(data);
        modern2(data);
    }
}
