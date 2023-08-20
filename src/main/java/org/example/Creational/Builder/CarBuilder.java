package org.example.Creational.Builder;

public class CarBuilder implements Builder {
    private String type;
    @Override
    public void setType(String type) {
        this.type = type;
    }
    public Car getResult() {
        return new Car(type);
    }
}
