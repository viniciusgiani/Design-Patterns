package org.example.Structural.facade;

public class AllocationFacade {
    public Type allocateProduction(String type) {
        Type destinationType;
        if (type.equals("Car")) {
            destinationType = new Car();
        } else {
            destinationType = new Motorcycle();
        }
        return destinationType;
    }
}
