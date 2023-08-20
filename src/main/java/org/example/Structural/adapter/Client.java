package org.example.Structural.adapter;

public class Client {
    public static void main(String[] args) {
        MotorcycleParking parking = new MotorcycleParking(2);
        Motorcycle motorcycle = new Motorcycle(2);

        if (parking.fits(motorcycle)) {
            System.out.println("Motorcycle Entered.");
        }

        Car car = new Car(4);
        CarAdapter carAdapter = new CarAdapter(car);

        if (parking.fits(carAdapter)) {
            System.out.println("Adapted car Entered.");
        }
    }
}
