package org.example.Behavioral.ChainOfResponsibility;

public class CarHandler extends AbstractHandler {
    @Override
    public Object Handle(IHandler request) {
        if (request.toString() == "Car") {
            return String.format("Vehicle: %s", request);
        } else {
            return this.Handle(request);
        }
    }
}
