/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s08.vehicle;

/**
 * Helper to build a vehicle
 */
public class VehicleBuilder {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;
    // ... etc

    /**
     * Constructor - we could stress the importance of defining some field
     * 
     * @param engine the vehicle engine
     */
    public VehicleBuilder(Engine engine) {
        this.engine = engine;
    }

    public VehicleBuilder seats(int x) {
        seats = x;
        return this;
    }

    public VehicleBuilder tripComputer(boolean x) {
        tripComputer = x;
        return this;
    }

    public VehicleBuilder gps(boolean x) {
        gps = x;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(seats, engine, tripComputer, gps);
    }

    @Override
    public String toString() {
        return "VehicleBuilder [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps="
                + gps + "]";
    }
}
