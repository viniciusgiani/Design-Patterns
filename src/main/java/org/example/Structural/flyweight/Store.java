package org.example.Structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void produceVehicle(int wheels, int doors, String name) {
        VehicleType type = VehicleFactory.getVehicleType(name);
        Vehicle vehicle = new Vehicle(wheels, doors, type);
        vehicles.add(vehicle);
    }
}
