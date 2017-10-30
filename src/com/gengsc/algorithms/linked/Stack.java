package com.gengsc.algorithms.linked;

import java.util.Iterator;

/**
 * @Description 链表实现栈
 * @Author shichaogeng
 * @Create 2017-10-30 11:37
 */
public class Stack<Item> implements Iterable<Item>{

    private Node first;
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

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator<>();
    }

    public class StackIterator<Item> implements Iterator {

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
