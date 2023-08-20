package org.example.Behavioral.Mediator;

class BaseComponent {
    protected IMediator mediator;

    public BaseComponent(IMediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
}