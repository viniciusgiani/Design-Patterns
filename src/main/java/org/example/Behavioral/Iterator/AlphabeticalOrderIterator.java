package org.example.Behavioral.Iterator;

import java.util.List;

public class AlphabeticalOrderIterator implements Iterator<String> {
    private WordsCollection collection;
    private int position = 0;
    private boolean reverse = false;

    public AlphabeticalOrderIterator(WordsCollection collection, boolean reverse) {
        this.collection = collection;
        this.reverse = reverse;

        if (reverse) {
            this.position = collection.getCount() - 1;
        }
    }

    public void rewind() {
        this.position = this.reverse ? collection.getCount() - 1 : 0;
    }

    public String current() {
        List<String> items = collection.getItems();
        return items.get(position);
    }

    public int key() {
        return position;
    }

    public String next() {
        List<String> items = collection.getItems();
        String item = items.get(position);
        position += reverse ? -1 : 1;
        return item;
    }

    public boolean valid() {
        if (reverse) {
            return position >= 0;
        }

        return position < collection.getCount();
    }
}

