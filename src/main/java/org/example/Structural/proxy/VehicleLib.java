package org.example.Structural.proxy;

import java.util.HashMap;

public interface VehicleLib {
    HashMap<String, Vehicle> Vehicles();

    Vehicle getVehicle(String vehicleId);
}
