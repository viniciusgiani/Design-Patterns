package org.example.Behavioral.Memento;

import java.util.Date;

class ConcreteMemento implements IMemento {
    private String state;
    private Date date;

    public ConcreteMemento(String state) {
        this.state = state;
        this.date = new Date();
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return date.toString() + " / (" + state.substring(0, Math.min(9, state.length())) + ")...";
    }

    public Date getDate() {
        return date;
    }
}
