package org.example.Structural.adapter;

public class CarAdapter extends Motorcycle {
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public int getWidth() {
        int result;
        result = car.getNumberOfWheels()/2;
        return result;
    }
}
