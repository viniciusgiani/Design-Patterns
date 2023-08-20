package org.example.Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        // The client code.
        Component1 component1 = new Component1(null);
        Component2 component2 = new Component2(null);
        ConcreteMediator mediator = new ConcreteMediator(component1, component2);

        System.out.println("Client triggers operation A.");
        component1.doA();

        System.out.println();

        System.out.println("Client triggers operation D.");
        component2.doD();
    }
}
