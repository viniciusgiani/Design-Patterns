package org.example.Structural.composite;

public class VehicleExpo {

    private CompoundVehicle compoundVehicle = new CompoundVehicle();

    public void expo(Vehicle... vehicles) {
        compoundVehicle.add(vehicles);
    }

}
