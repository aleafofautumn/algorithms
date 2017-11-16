package com.gengsc.algorithms.link;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-16 11:43
 */
public class RealLink<Item> {

    private Node root;
    private int count;
    private int index;
    private Item[] array;

    private class Node {

        private Item data;
        private Node next;

        public Node(Item data) {
            this.data = data;
        }
    }

    public void add(Item item) {
        if (item == null) return;
        Node node = new Node(item);
        if (root == null) {
            root = node;
        } else {
            add(root, node);
        }
        this.count++;
    }

    private void add(Node current, Node newNode) {
        if (current.next == null) {
            current.next = newNode;
        } else {
            add(current.next, newNode);
        }

    }

    public void print() {
        print(root);
    }

    private void print(Node node) {
        if (node != null) {
            System.out.println(node.data);
            print(node.next);
        }
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(Item data) {
        if (data == null) {
            return false;
        }

        return contains(root, data);
    }

    private boolean contains(Node node, Item data) {
        if (node == null) return false;
        if (data.equals(node.data)) {
            return true;
        } else {
            return  contains(node.next, data);
        }
    }

    public Item get(int index) {
        if (index > (this.count - 1) || index < 0) {
            return null;
        }
        //索引从0开始
        this.index = 0;
        return get(this.root, index);
    }

    private Item get(Node node, int index) {
        if (index == this.index++) {
            return node.data;
        } else if (node.next != null) {
            return get(node.next, index);
        }
        return null;
    }

    public void set(int index, Item data) {
        if (index > (this.count - 1) || index < 0) {
            return;
        }
        this.index = 0;
        set(this.root, index, data);
    }

    private void set(Node node, int index, Item data) {
        if (index == this.index++) {
            node.data = data;
        } else if (node.next != null) {
            set(node.next, index, data);
        }
    }

    /**
     * 删除节点分为两种情况
     * 1.删除的节点为根节点，需要root = root.next
     * 2.删除的节点不在根节点，需要preNode.next = currNode.next;
     * @param data
     */
    public void remove(Item data) {
        if (!contains(data)) return;
        //分两种情况，1.在根节点中2.不在根节点中
        if (data.equals(this.root.data)) {
            this.root = this.root.next;
        } else {
            remove(this.root, this.root.next, data);
        }
        this.count--;
    }

    private void remove(Node pre, Node current, Item data) {
        if (data.equals(current.data)) {
            pre.next = current.next;
        } else {
            remove(current, current.next, data);
        }

    }

    public Item[] toArray() {
        if (isEmpty()) return null;
        this.index = 0;
        this.array = (Item[]) new Object[this.count];
        toArray(this.root);
        return this.array;
    }

    private void toArray(Node node) {
        if (node == null) return;
        array[index++] = node.data;
        toArray(node.next);
    }

    /**
     * 分为两种情况
     * 1. 只有一个节点，在根节点中，直接删除根节点root = null
     * 2. 两个及以上节点，递归找到currNode.next == null,删除当前节点preNode.next = null
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
        this.count--;
    }

    private void removeLast(Node preNode, Node currNode) {
        if (currNode.next == null) {
            preNode.next = null;
        } else {
            removeLast(currNode, currNode.next);
        }
    }

    public void remove(int index) {
        //根节点和不在根节点两种情况
        if (index > (this.count - 1) || index < 0) {
            return;
        }
        if (isEmpty()) {
            return;
        }

        this.index = 0;
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

    public boolean find(RealLink<Item> link, Item key) {
        return contains(key);
    }

}
