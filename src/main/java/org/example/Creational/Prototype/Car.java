package org.example.Creational.Prototype;

public class Car extends Automobile {

    public String type;

    public Car(){}

    public Car(Car car) {
        super(car);
        this.type = car.type;
    }

    @Override
    public Automobile clone() {
        return new Car(this);
    }

}
