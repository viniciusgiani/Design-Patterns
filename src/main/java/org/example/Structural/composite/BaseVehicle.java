package org.example.Structural.composite;

abstract class BaseVehicle implements Vehicle {

    public int wheels;

    public int doors;

    public BaseVehicle(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

}
