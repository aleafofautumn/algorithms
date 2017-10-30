package com.gengsc.algorithms.linked;

import java.util.Iterator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 15:22
 */
public class Bag<Item> implements Iterable<Item> {

    private Node first;
    private int N;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>();
    }

    public class ListIterator<Item> implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = (Item) current.item;
            current = first.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

}

