/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s02.dip;

/**
 * A comparison among
 * 
 * <li>Classic hierarchy of calculators
 * <li>Dependency Inversion Calculator using custom functional interface
 * <li>Dependency Inversion Calculator using standard functional interface
 */
public class Main {
    public static void main(String[] args) {
        double x = 42.3;
        double y = 12.5;

        System.out.println("Classic calculator");

        Calculator adder = new CalculatorAdd();
        System.out.println("Adder: " + adder.calculate(x, y));

        Calculator multiplier = new CalculatorMult();
        System.out.println("Multiplier: " + multiplier.calculate(x, y));

        System.out.println("\nDIP custom functional calculator");

        DipCalculator dipAdder = new DipCalculator(Double::sum);
        System.out.println("DIP Adder: " + dipAdder.calculate(x, y));

        DipCalculator dipMultiplier = new DipCalculator((a, b) -> a * b);
        System.out.println("DIP Multiplier: " + dipMultiplier.calculate(x, y));

        System.out.println("\nDIP standard functional calculator");

        FunCalculator funAdder = new FunCalculator(Double::sum);
        System.out.println("DIP Adder: " + funAdder.calculate(x, y));

        FunCalculator funMultiplier = new FunCalculator((a, b) -> a * b);
        System.out.println("DIP Multiplier: " + funMultiplier.calculate(x, y));
    }
}
