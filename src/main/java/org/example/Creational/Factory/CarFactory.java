package org.example.Creational.Factory;

public class CarFactory extends AutomobileFactory {
    @Override
    public Automobile callSpecificFactory() {
        return new Car();
    }
}
