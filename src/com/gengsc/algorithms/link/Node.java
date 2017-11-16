package com.gengsc.algorithms.link;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-16 10:57
 */
public class Node<Item> {

    private Item data;
    private Node next;

    public Node(Item data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }
}
