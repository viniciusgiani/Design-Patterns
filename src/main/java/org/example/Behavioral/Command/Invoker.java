package org.example.Behavioral.Command;

public class Invoker {
    private ICommand onStart;

    private ICommand onFinish;

    public void setOnStart(ICommand onStart) {
        this.onStart = onStart;
    }

    public void setOnFinish(ICommand onFinish) {
        this.onFinish = onFinish;
    }

    public void DoSomethingImportant() {
        System.out.println("Invoker start.");
        this.onStart.execute();
        System.out.println("Invoker executing.");
        this.onFinish.execute();
        System.out.println("Invoker finished.");
    }
}
