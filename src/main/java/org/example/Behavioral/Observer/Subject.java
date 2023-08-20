package org.example.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private String message;

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public void createMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void someBusinessLogic() {
        this.message = "changed message";
        notifyObservers();
        System.out.println("I'm about to do something important.");
    }
}
