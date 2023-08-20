package org.example.Creational.AbstractFactory;

public class CarFactory implements AutomobileFactory {
    @Override
    public Automobile createVehicle() {
        return new Car();
    }
}
