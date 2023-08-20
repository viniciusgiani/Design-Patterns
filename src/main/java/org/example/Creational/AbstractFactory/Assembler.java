package org.example.Creational.AbstractFactory;

public class Assembler {
    private Automobile automobile;
    public Assembler(AutomobileFactory automobileFactory) {
        automobile = automobileFactory.createVehicle();
    }
    public void nameVehicle() {
        automobile.vehicleType();
    }
}
