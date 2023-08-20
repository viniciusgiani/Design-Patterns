package org.example.Behavioral.State;

class ConcreteStateB extends BaseState {
    public void handle1() {
        System.out.println("ConcreteStateB handles request1.\n");
    }

    public void handle2() {
        System.out.println("ConcreteStateB handles request2.");
        System.out.println("ConcreteStateB wants to change the state of the context.\n");
        context.transitionTo(new ConcreteStateA());
    }
}
