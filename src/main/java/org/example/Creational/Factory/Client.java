package org.example.Creational.Factory;

import java.util.Scanner;

public class Client {
    private static AutomobileFactory factory;
    private static Scanner scanner = new Scanner(System.in);
    private static String type;

    public static void main(String[] args) {
        System.out.println("Specify vehicle to be created:");
        type = scanner.next();
        configure(type);
        deliver();
    }

    private static void configure(String type) {
        if (type.equals("car")) {
            factory = new CarFactory();
        }
    }

    private static void deliver() {
        factory.createVehicle();
    }

}