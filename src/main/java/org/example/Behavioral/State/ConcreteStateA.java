package org.example.Behavioral.State;

class ConcreteStateA extends BaseState {
    public void handle1() {
        System.out.println("ConcreteStateA handles request1.");
        System.out.println("ConcreteStateA wants to change the state of the context.\n");
        context.transitionTo(new ConcreteStateB());
    }

    public void handle2() {
        System.out.println("ConcreteStateA handles request2.\n");
    }
}
