package org.example.Behavioral.Memento;

import java.util.concurrent.ThreadLocalRandom;

class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
        System.out.println("Originator: My initial state is: " + state);
    }

    public void doSomething() {
        System.out.println("Originator: I'm doing something important.");
        this.state = generateRandomString(30);
        System.out.println("Originator: and my state has changed to: " + state);
    }

    private String generateRandomString(int length) {
        String allowedSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        while (length > 0) {
            result.append(allowedSymbols.charAt(ThreadLocalRandom.current().nextInt(allowedSymbols.length())));
            try {
                Thread.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            length--;
        }

        return result.toString();
    }

    public IMemento save() {
        return new ConcreteMemento(state);
    }

    public void restore(IMemento memento) {
        if (!(memento instanceof ConcreteMemento)) {
            throw new RuntimeException("Unknown memento class " + memento.toString());
        }

        this.state = memento.getState();
        System.out.print("Originator: My state has changed to: " + state);
    }
}
