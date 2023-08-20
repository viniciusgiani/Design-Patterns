package org.example.Creational.Prototype;

public abstract class Automobile {

    public String type;

    public Automobile() {}

    public Automobile(Automobile automobile) {
        this.type = automobile.type;
    }

    public abstract Automobile clone();

}
