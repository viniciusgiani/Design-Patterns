package org.example.Behavioral.TemplateMethod;

public class Client {
    public static void clientCode(AbstractClass clazz) {
        clazz.templateMethod();
    }

    public static void main(String[] args) {
        System.out.println("Same client code can work with different subclasses:");
        clientCode(new ConcreteClass1());
        System.out.println();

        System.out.println("Same client code can work with different subclasses:");
        clientCode(new ConcreteClass2());
    }
}
