package org.example.Structural.bridge.drivers;

import org.example.Structural.bridge.vehicles.Vehicle;

public class BasicDriver implements Driver {
    protected Vehicle vehicle;

    public BasicDriver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BasicDriver() {
    }

    @Override
    public void speedUp() {
        vehicle.setSpeed(200);
    }

}
