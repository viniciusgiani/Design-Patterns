package org.example.Structural.adapter;

public class Car {
    private int wheels;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumberOfWheels() {
        int result;
        wheels = 4;
        result = wheels;
        return result;
    }
}
