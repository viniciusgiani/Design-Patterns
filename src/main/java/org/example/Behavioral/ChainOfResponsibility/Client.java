package org.example.Behavioral.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        CarHandler carHandler = new CarHandler();
        MotorcycleHandler motorcycleHandler = new MotorcycleHandler();

        carHandler.setNext(motorcycleHandler);
    }
}
