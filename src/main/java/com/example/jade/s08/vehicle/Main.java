/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s08.vehicle;

public class Main {
    public static void main(String[] args) {
        // creating a vehicle in the "normal" way
        Vehicle plain = new Vehicle(4, Engine.BEV, false, false);
        System.out.println("Plain: " + plain);

        // going through the vehicle builder
        Vehicle vehicle = new VehicleBuilder(Engine.BEV).gps(false).tripComputer(false).seats(4).build();
        System.out.println("By builder: " + vehicle);
    }
}
