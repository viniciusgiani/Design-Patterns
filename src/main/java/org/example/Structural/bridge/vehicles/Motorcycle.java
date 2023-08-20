package org.example.Structural.bridge.vehicles;

public class Motorcycle implements Vehicle {

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void printStatus() {
        System.out.println("Motorcycle speed: " + getSpeed());
    }
}
