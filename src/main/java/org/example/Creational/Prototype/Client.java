package org.example.Creational.Prototype;

public class Client {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.type = "Ferrari";

        Car car2 = (Car) car1.clone();

        System.out.printf("Car 1: %s, Car 2: %s", car1.type, car2.type);
    }
}
