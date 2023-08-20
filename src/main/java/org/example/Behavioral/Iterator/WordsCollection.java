package org.example.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class WordsCollection implements Aggregator {
    private List<String> items = new ArrayList<>();

    public List<String> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public Iterator<String> getIterator() {
        return new AlphabeticalOrderIterator(this, false);
    }

    public Iterator<String> getReverseIterator() {
        return new AlphabeticalOrderIterator(this, true);
    }
}

