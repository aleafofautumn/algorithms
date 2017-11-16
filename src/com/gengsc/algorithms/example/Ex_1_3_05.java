package com.gengsc.algorithms.example;

import com.gengsc.algorithms.linked.Stack;

/**
 * @Description 使用栈把十进制转为二进制
 * @Author shichaogeng
 * @Create 2017-11-02 13:15
 */
public class Ex_1_3_05 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int N = 25;
        while (N > 0) {
            stack.push(N%2);
            N /= 2;
        }
        for (Integer i : stack) {
            System.out.print(i);

        }
    }

}
