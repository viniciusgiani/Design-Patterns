package org.example.Behavioral.Command;

public class ComplexCommand implements ICommand {

    private Receiver receiver;

    private String a;

    private String b;

    public ComplexCommand(Receiver receiver, String a, String b) {
        this.receiver = receiver;
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        System.out.println("Complex command.");
        this.receiver.DoSomething(this.a);
        this.receiver.DoSomethingElse(this.b);
    }
}
