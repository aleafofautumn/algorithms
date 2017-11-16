package com.gengsc.algorithms.link;

/**
 * @Description 实现各链表
 * 节点的创建
 * 节点的关系维护
 * 提供api
 * @Author shichaogeng
 * @Create 2017-11-16 11:12
 */
public class Link<Item> {

    private Node<Item> root;

    public void add(Item item) {
        Node<Item> target = new Node<>(item);
        if (root == null) {//没有根节点
            root = target;
        } else {//有根节点
            add(root, target);
        }
    }

    private void add(Node current, Node target) {
        if (current.getNext() == null) {
            current.setNext(target);
        } else {
            add(current.getNext(), target);
        }
    }

    public void print() {
        print(root);
    }

    private void print(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            print(node.getNext());
        }
    }

}
