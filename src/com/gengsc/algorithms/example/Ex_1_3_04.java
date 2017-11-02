package com.gengsc.algorithms.example;

import com.gengsc.algorithms.linked.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * @Description
 *
 * [()]{}{[()()]()}
 * true
 *
 * [(])
 * false
 *
 * @Author shichaogeng
 * @Create 2017-11-02 12:44
 */
public class Ex_1_3_04 {
    public static void main(String[] args) {
        System.out.println(isBalanced());
    }

    private static boolean isBalanced() {
        Stack<String> stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if ("(".equals(s) || "[".equals(s) || "{".equals(s)) {
                stack.push(s);
            } else {
                if (")".equals(s) && (s.isEmpty() || !"(".equals(stack.pop()))) {
                    return false;
                } if ("]".equals(s) && (s.isEmpty() || !"[".equals(stack.pop()))) {
                    return false;
                } if ("}".equals(s) && (s.isEmpty() || !"{".equals(stack.pop()))) {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}
