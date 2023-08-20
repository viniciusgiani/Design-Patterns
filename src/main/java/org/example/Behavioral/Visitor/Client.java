package org.example.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void clientCode(List<Component> components, Visitor visitor) {
        for (Component component : components) {
            component.accept(visitor);
        }
    }

    public static void main(String[] args) {
        List<Component> components = new ArrayList<>();
        components.add(new ConcreteComponentA());
        components.add(new ConcreteComponentB());

        System.out.println("The client code works with all visitors via the base Visitor interface:");
        Visitor visitor1 = new ConcreteVisitor1();
        clientCode(components, visitor1);

        System.out.println("It allows the same client code to work with different types of visitors:");
        Visitor visitor2 = new ConcreteVisitor2();
        clientCode(components, visitor2);
    }
}
