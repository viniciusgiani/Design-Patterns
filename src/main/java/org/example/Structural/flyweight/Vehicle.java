package org.example.Structural.flyweight;

public class Vehicle {
    private int wheels;
    private int doors;

    private VehicleType vehicleType;

    public Vehicle(int wheels, int doors, VehicleType vehicleType) {
        this.wheels = wheels;
        this.doors = doors;
        this.vehicleType = vehicleType;
    }
}
