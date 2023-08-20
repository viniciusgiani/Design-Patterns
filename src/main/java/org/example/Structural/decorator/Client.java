package org.example.Structural.decorator;

public class Client {
    public static void main(String[] args) {

        EngineDecorator engineDecorator = new BreaksDecorator(new BaseVehicle("Uno"));
        System.out.println(engineDecorator.readData());
    }
}
