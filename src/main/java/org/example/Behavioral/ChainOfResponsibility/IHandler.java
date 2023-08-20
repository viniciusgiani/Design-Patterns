package org.example.Behavioral.ChainOfResponsibility;

public interface IHandler {
    IHandler setNext(IHandler handler);
    Object Handle(IHandler request);
}
