package org.example.Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        // Client code.
        Originator originator = new Originator("Super-duper-super-puper-super.");
        Caretaker caretaker = new Caretaker(originator);

        caretaker.backup();
        originator.doSomething();

        caretaker.backup();
        originator.doSomething();

        caretaker.backup();
        originator.doSomething();

        System.out.println();
        caretaker.showHistory();

        System.out.println("\nClient: Now, let's rollback!\n");
        caretaker.undo();

        System.out.println("\n\nClient: Once more!\n");
        caretaker.undo();

        System.out.println();
    }
}