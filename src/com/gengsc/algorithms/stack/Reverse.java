package com.gengsc.algorithms.stack;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Reverse {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }
        for (Integer integer : stack) {
            System.out.println(integer);

        }
    }
}
