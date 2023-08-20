package org.example.Behavioral.Mediator;

class ConcreteMediator implements IMediator {
    private Component1 component1;
    private Component2 component2;

    public ConcreteMediator(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component1.setMediator(this);
        this.component2 = component2;
        this.component2.setMediator(this);
    }

    public void notify(Object sender, String ev) {
        if (ev.equals("A")) {
            System.out.println("Mediator reacts on A and triggers following operations:");
            this.component2.doC();
        }
        if (ev.equals("D")) {
            System.out.println("Mediator reacts on D and triggers following operations:");
            this.component1.doB();
            this.component2.doC();
        }
    }
}
