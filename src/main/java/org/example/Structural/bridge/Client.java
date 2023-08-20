package org.example.Structural.bridge;

import org.example.Structural.bridge.drivers.AdvancedDriver;
import org.example.Structural.bridge.drivers.BasicDriver;
import org.example.Structural.bridge.vehicles.Car;
import org.example.Structural.bridge.vehicles.Motorcycle;
import org.example.Structural.bridge.vehicles.Vehicle;

public class Client {
    public static void main(String[] args) {
        testVehicle(new Car());
        testVehicle(new Motorcycle());
    }

    private static void testVehicle(Vehicle vehicle) {
        System.out.println("Basic driver:");
        BasicDriver basicDriver = new BasicDriver(vehicle);
        basicDriver.speedUp();
        vehicle.printStatus();

        System.out.println("Advanced driver:");
        AdvancedDriver advancedDriver = new AdvancedDriver(vehicle);
        advancedDriver.boost();
        vehicle.printStatus();

    }
}
