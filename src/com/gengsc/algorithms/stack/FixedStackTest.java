package com.gengsc.algorithms.stack;

import edu.princeton.cs.algs4.StdIn;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-28 15:52
 */
public class FixedStackTest {
    public static void main(String[] args) {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.println(stack.pop(item + " "));
            }
        }
        System.out.println("("+stack.size()+" left on stack )");
    }
}
