package org.example.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructCar(carBuilder);
        Car car = carBuilder.getResult();

        System.out.println("Car created: " + car.getType());
    }
}
