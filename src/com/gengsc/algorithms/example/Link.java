package com.gengsc.algorithms.example;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-16 16:32
 */
public class Link<Item>{

    private Node root;
    private int count;
    private int index;

    private class Node {

        private Item data;
        private Node next;

        public Node(Item data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return this.count;
    }

    /**
     * 算法4 164页 练习1.3.19
     */
    public void removeLast() {
        if (this.isEmpty()) {
            return;
        }

        if (this.root.next == null) {
            this.root = null;
        } else {
            removeLast(this.root, this.root.next);
        }
    }

    private void removeLast(Node preNode, Node currNode) {
        if (currNode.next == null) {
            preNode.next = null;
        } else {
            removeLast(currNode, currNode.next);
        }
    }

    /**
     * 算法4 164页 练习1.3.20
     */
    public void delete(int k) {
        remove(k - 1);
    }

    public void remove(int index) {
        //根节点和不在根节点两种情况
        if (index > (this.count - 1) || index < 0) {
            return;
        }
        if (isEmpty()) {
            return;
        }

        this.index = (0);
        if (index == this.index++) {
            this.root = this.root.next;
        } else {
            remove(root, root.next, index);
        }

        this.count--;
    }

    private void remove(Node preNode, Node currNode, int index) {
        if (index == this.index++) {
            preNode.next = currNode.next;
        } else {
            remove(currNode, currNode.next, index);
        }
    }

    /**
     * 算法4 164页 练习1.3.21
     */
    public boolean find(Link<Item> link, Item key) {
        return contains(key);
    }

    public boolean contains(Item data) {
        if (data == null) return false;
        return contains(this.root, data);
    }

    private boolean contains(Node node, Item data) {
        if (node == null) return false;
        if (data.equals(node.data)) {
            return true;
        } else {
            return contains(node.next, data);
        }

    }

    public void deleteNode(Node node) {
        if (node == null) return;
        findDeleteNode(this.root, node);
    }

    private void findDeleteNode(Node currNode, Node node) {

        if (node.equals(currNode)) {
            deleteNode(currNode.next, node);
        } else if (currNode.next != null){
            findDeleteNode(currNode.next, node);
        }
    }

    private void deleteNode(Node currNode, Node node) {

    }


}
