package org.example.Behavioral.Command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setOnStart(new SimpleCommand("Hi\n"));
        Receiver receiver = new Receiver();
        invoker.setOnFinish(new ComplexCommand(receiver, "Send email.\n", "Save report.\n"));

        invoker.DoSomethingImportant();
    }
}
