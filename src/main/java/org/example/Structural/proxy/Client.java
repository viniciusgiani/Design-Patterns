package org.example.Structural.proxy;

public class Client {
    public static void main(String[] args) {
        VehicleStore carStore = new VehicleStore(new Car());
        VehicleStore motorcycleStore = new VehicleStore(new Motorcycle());

        carStore.renderPopularVehicles();
        carStore.renderVehiclePage("1");

        motorcycleStore.renderPopularVehicles();
        motorcycleStore.renderVehiclePage("1");
    }
}
