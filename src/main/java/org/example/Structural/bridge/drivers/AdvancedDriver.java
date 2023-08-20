package org.example.Structural.bridge.drivers;

import org.example.Structural.bridge.vehicles.Vehicle;

public class AdvancedDriver extends BasicDriver {

    public AdvancedDriver(Vehicle vehicle) {
        super.vehicle = vehicle;
    }

    public void boost() {
        vehicle.setSpeed(300);
    }
}
