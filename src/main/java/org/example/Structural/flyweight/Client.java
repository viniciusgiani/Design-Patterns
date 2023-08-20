package org.example.Structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        store.produceVehicle(4,4,"Ferrari");
    }
}
