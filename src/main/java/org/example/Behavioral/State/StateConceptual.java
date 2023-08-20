package org.example.Behavioral.State;

public class StateConceptual {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request1();
        context.request2();
    }
}
