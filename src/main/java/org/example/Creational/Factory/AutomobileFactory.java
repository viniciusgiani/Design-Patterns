package org.example.Creational.Factory;

public abstract class AutomobileFactory {
    public void createVehicle() {
        Automobile automobile = callSpecificFactory();
        automobile.vehicleName();
    }
    public abstract Automobile callSpecificFactory();
}
