package com.gengsc.algorithms.link;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-16 11:00
 */
public class Demo {
    public static void main(String[] args) {
        //数据节点
        Node root = new Node("火车头");
        Node n1 = new Node("车厢1");
        Node n2 = new Node("车厢2");
        Node n3 = new Node("车厢3");

        //节点关系
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(null);

        //遍历节点
        Node current = root;
        /*while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }*/

        print(current);
    }

    /**
     *
     * 递归遍历下一个节点
     * @param node
     */
    public static void print(Node node) {
        if (node == null) return;
        System.out.println(node.getData());
        print(node.getNext());
    }
}
