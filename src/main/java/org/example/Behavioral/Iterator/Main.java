package org.example.Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        WordsCollection collection = new WordsCollection();
        collection.addItem("First");
        collection.addItem("Second");
        collection.addItem("Third");

        Iterator<String> iterator = collection.getIterator();

        System.out.println("Straight traversal:");
        while (iterator.valid()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Reverse traversal:");
        Iterator<String> reverseIterator = collection.getReverseIterator();
        while (reverseIterator.valid()) {
            System.out.println(reverseIterator.next());
        }
    }
}

