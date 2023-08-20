package org.example.Behavioral.Command;

public class Receiver {

    public void DoSomething(String a) {
        System.out.printf("Receiver sent: %s", a);
    }

    public void DoSomethingElse(String b) {
        System.out.printf("Receiver sent: %s", b);
    }

}
