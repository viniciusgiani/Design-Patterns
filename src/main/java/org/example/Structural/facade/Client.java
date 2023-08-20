package org.example.Structural.facade;

public class Client {
    public static void main(String[] args) {
        AllocationFacade facade = new AllocationFacade();
        facade.allocateProduction("Car");
    }
}
