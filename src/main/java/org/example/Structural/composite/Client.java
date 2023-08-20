package org.example.Structural.composite;

public class Client {
    public static void main(String[] args) {
        VehicleExpo vehicleExpo = new VehicleExpo();

        vehicleExpo.expo(
                new Car(4,4),
                new Motorcycle(2,0)
        );
    }
}
