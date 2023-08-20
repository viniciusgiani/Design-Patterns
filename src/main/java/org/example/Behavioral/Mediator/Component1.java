package org.example.Behavioral.Mediator;

class Component1 extends BaseComponent {
    public Component1(IMediator mediator) {
        super(mediator);
    }

    public void doA() {
        System.out.println("Component 1 does A.");
        this.mediator.notify(this, "A");
    }

    public void doB() {
        System.out.println("Component 1 does B.");
        this.mediator.notify(this, "B");
    }
}
