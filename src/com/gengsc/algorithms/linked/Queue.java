package com.gengsc.algorithms.linked;

import java.util.Iterator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 14:50
 */
public class Queue<Item> implements Iterable{
    private Node first;
    private Node last;
    private int N;

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

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public Item dequeue() {
        Item item = null;
        if (!isEmpty()) {
            item = first.item;
            first = first.next;
            if (isEmpty()) {
                last = null;
            }
            N--;
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator<>();
    }

    public class QueueIterator<Item> implements Iterator {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = (Item) current.item;
            current = current.next;
            return item;
        }
    }
}
