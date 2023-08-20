package org.example.Structural.decorator;

public class EngineDecorator implements Vehicle {

    private Vehicle engine;

    public EngineDecorator(Vehicle source) {
        this.engine = source;
    }

    @Override
    public void upgrade(String upgrade) {
        engine.upgrade("V8");
    }

    @Override
    public String readData() {
        return engine.readData();
    }
}
