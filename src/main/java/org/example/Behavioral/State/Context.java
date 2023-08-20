package org.example.Behavioral.State;

class Context {
    private State state;

    public Context(State state) {
        transitionTo(state);
    }

    // The Context allows changing the State object at runtime.
    public void transitionTo(State state) {
        System.out.println("Context: Transition to " + state.toString());
        this.state = state;
        this.state.update(this);
    }

    // The Context delegates part of its behavior to the current State object.
    public void request1() {
        state.handle1();
    }

    public void request2() {
        state.handle2();
    }
}
