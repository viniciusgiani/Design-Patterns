package org.example.Behavioral.Iterator;

public interface Iterator<T> {
    // Return the current element.
    T current();

    // Return the current element and move forward to the next element.
    T next();

    // Return the key of the current element.
    int key();

    // Check if the current position is valid.
    boolean valid();

    // Rewind the Iterator to the first element.
    void rewind();
}

