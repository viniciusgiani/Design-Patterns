package org.example.Creational.AbstractFactory;

import java.util.Scanner;

public class Client {
    private static Assembler configuration() {
        Assembler assembler;
        AutomobileFactory automobileFactory = null;
        String type = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name vehicle:");
        type = scanner.next();
        if (type.equals("car")) {
            automobileFactory = new CarFactory();
        }
        assembler = new Assembler(automobileFactory);
        return assembler;
    }

    public static void main(String[] args) {
        Assembler assembler = configuration();
        assembler.nameVehicle();
    }
}
