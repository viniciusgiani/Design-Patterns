package org.example.Behavioral.ChainOfResponsibility;

abstract class AbstractHandler implements IHandler{
    private IHandler nextHandler;

    @Override
    public IHandler setNext(IHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public Object Handle(IHandler request) {
        if (this.nextHandler != null) {
            return this.nextHandler.Handle(request);
        } else {
            return null;
        }
    }
}
