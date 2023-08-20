package org.example.Behavioral.ChainOfResponsibility;

public class MotorcycleHandler  extends AbstractHandler {
    @Override
    public Object Handle(IHandler request) {
        if (request.toString() == "Motorcycle") {
            return String.format("Vehicle: %s", request);
        } else {
            return this.Handle(request);
        }
    }
}
