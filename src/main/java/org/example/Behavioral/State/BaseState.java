package org.example.Behavioral.State;

class BaseState implements State {
    protected Context context;

    public void update(Context context) {
        this.context = context;
    }

    public void handle1() {
    }

    public void handle2() {
    }
}
