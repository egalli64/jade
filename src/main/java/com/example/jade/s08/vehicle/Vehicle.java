/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s08.vehicle;

/**
 * A class requiring a complex creation phase
 */
public class Vehicle {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;
    // ... etc

    /**
     * Canonical constructor
     * 
     * @param seats
     * @param engine
     * @param tripComputer
     * @param gps
     */
    public Vehicle(int seats, Engine engine, boolean tripComputer, boolean gps) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Vehicle [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps
                + "]";
    }
}
