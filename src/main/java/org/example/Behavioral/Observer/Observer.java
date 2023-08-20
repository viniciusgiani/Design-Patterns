package org.example.Behavioral.Observer;

class Observer implements IObserver {
    private static int staticNumber = 0;
    private int number;
    private String messageFromSubject;
    private Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Hi, I'm Observer \"" + (++staticNumber) + "\".");
        this.number = staticNumber;
    }

    @Override
    public void update(String messageFromSubject) {
        this.messageFromSubject = messageFromSubject;
        printInfo();
    }

    public void removeMeFromList() {
        subject.detach(this);
        System.out.println("Observer \"" + number + "\" removed from the list.");
    }

    public void printInfo() {
        System.out.println("Observer \"" + number + "\": a new message is available --> " + messageFromSubject);
    }
}
