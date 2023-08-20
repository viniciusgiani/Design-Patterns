package org.example.Structural.decorator;

public class BreaksDecorator extends EngineDecorator {
    private String breaks = "ABS";

    public BreaksDecorator(Vehicle source) {
        super(source);
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    @Override
    public void upgrade(String breaks) {
        super.upgrade(breaks);
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
