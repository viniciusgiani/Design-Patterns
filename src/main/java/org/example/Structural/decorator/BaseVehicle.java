package org.example.Structural.decorator;

public class BaseVehicle implements Vehicle {
    private String name;

    public BaseVehicle(String name) {
        this.name = name;
    }

    @Override
    public void upgrade(String upgrade) {
    }

    @Override
    public String readData() {
        return name;
    }
}
