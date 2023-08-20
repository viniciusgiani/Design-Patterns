package org.example.Creational.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("1");
        Singleton singleton2 = Singleton.getInstance("2");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }
}
