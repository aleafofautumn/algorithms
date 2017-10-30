package com.gengsc.algorithms.linked;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-28 18:52
 */
public class Demo {
    public static void main(String[] args) {
        Node<String> first = new Node<>();
        Node<String> second = new Node<>();
        Node<String> third = new Node<>();

        first.item = "to";
        second.item = "be";
        first.next = second;
        third.item = "or";
        second.next = third;

        //表头插入节点
        Node<String> oldFirst = first;
        first = new Node<>();
        first.item = "not";
        first.next = oldFirst;

        //在表头删除节点
        first = first.next;

        //在表尾插入节点
        Node<String> oldLast = third;
        third = new Node<>();
        third.item = "not";
        oldFirst.next = third;

    }

}

class Node<Item> {
    Item item;
    Node next;
}
