package org.example.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

class Caretaker {
    private List<IMemento> mementos = new ArrayList<>();
    private Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void backup() {
        System.out.println("\nCaretaker: Saving Originator's state...");
        mementos.add(originator.save());
    }

    public void undo() {
        if (mementos.isEmpty()) {
            return;
        }

        IMemento memento = mementos.get(mementos.size() - 1);
        mementos.remove(memento);

        System.out.println("Caretaker: Restoring state to: " + memento.getName());

        try {
            originator.restore(memento);
        } catch (RuntimeException e) {
            undo();
        }
    }

    public void showHistory() {
        System.out.println("Caretaker: Here's the list of mementos:");
        for (IMemento memento : mementos) {
            System.out.println(memento.getName());
        }
    }
}
