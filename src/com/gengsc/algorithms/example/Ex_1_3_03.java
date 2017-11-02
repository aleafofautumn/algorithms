package com.gengsc.algorithms.example;

import com.gengsc.algorithms.linked.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Ex_1_3_03 {
    public static void main(String[] args) {
        String[] a = StdIn.readAll().split("\\s+");
        int[] v = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            v[i] = Integer.parseInt(a[i]);
        }
        checkSequence(v);
    }

    private static void checkSequence(int[] v) {
        Stack<Integer> stack = new Stack<>();

        int n = v.length;
        int i = 0;
        int j = 0;
        while (i < n && j <= n) {
            if (!stack.isEmpty() && stack.peek() == v[i]) {
                stack.pop();
                i++;
            } else if (j < n){
                stack.push(j);
                j++;
            }
        }

        System.out.println(stack);
    }
}