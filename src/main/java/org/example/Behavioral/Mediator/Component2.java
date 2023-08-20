package org.example.Behavioral.Mediator;

class Component2 extends BaseComponent {
    public Component2(IMediator mediator) {
        super(mediator);
    }

    public void doC() {
        System.out.println("Component 2 does C.");
        this.mediator.notify(this, "C");
    }

    public void doD() {
        System.out.println("Component 2 does D.");
        this.mediator.notify(this, "D");
    }
}
