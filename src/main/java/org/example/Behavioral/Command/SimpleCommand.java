package org.example.Behavioral.Command;

public class SimpleCommand implements ICommand {

    private String payload = "";

    public SimpleCommand(String payload) {
        this.payload = payload;
    }

    @Override
    public void execute() {
        System.out.printf("Simple command: %s", payload);
    }
}
