package com.gengsc.algorithms.stack;

/**
 * 设定容量固定的字符串栈
 */
public class FixedCapacityStackOfString<Item> {

    private Item[] a;

    private int N;

    public FixedCapacityStackOfString(int cap) {
        this.a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public Item pop(Item s) {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4) {
            resize(a.length/2);
        }
        return item;
    }

    public void push(Item val) {
        if (N == a.length) {
            resize(2*a.length);
        }
        a[N++] = val;
    }

    /**
     * 调整stack容量
     * @param max
     */
    public void resize(int max) {
        Item[] items = (Item[]) new Object[max];
        for (int i = 0; i < a.length; i++) {
            items[i] = a[i];
        }
        a = items;
    }
}
