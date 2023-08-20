package org.example.Structural.proxy;

import java.util.HashMap;

public class VehicleStore {
    private VehicleLib vehicleLib;

    public VehicleStore(VehicleLib vehicleLib) {
        this.vehicleLib = vehicleLib;
    }

    public void renderVehiclePage(String vehicleId) {
        Vehicle vehicle = vehicleLib.getVehicle(vehicleId);
        System.out.println("ID: " + vehicle.id);
        System.out.println("Title: " + vehicle.title);
    }

    public void renderPopularVehicles() {
        HashMap<String, Vehicle> list = vehicleLib.Vehicles();
        for (Vehicle vehicle : list.values()) {
            System.out.println("ID: " + vehicle.id + " / Title: " + vehicle.title);
        }
    }
}
