package org.example.Structural.adapter;

public class MotorcycleParking {

    private int width;

    public MotorcycleParking(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public boolean fits(Motorcycle motorcycle) {
        boolean result;
        result = this.getWidth() >= motorcycle.getWidth();
        return result;
    }
}
