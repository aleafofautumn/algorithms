package com.gengsc.algorithms.linked;

import edu.princeton.cs.algs4.StdIn;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 15:13
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                System.out.println(queue.dequeue()+" ");
            }
        }
        System.out.println("("+queue.size()+" left on queue)");
    }
}
