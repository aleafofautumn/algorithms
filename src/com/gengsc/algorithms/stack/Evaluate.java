package com.gengsc.algorithms.stack;

import edu.princeton.cs.algs4.StdIn;

import java.util.Stack;

/**
 * 双栈算数表达式：使用连两个栈来计算一个算数表达式的字符串
 */
public class Evaluate {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            for (int i = 0; i < str.length() ; i++) {
                String s = str.charAt(i)+"";
                if ("(".equals(s)) {
                    //什么也不做
                } else if ("+".equals(s)) {
                    ops.push(s);
                } else if ("-".equals(s)) {
                    ops.push(s);
                } else if ("*".equals(s)) {
                    ops.push(s);
                } else if ("/".equals(s)) {
                    ops.push(s);
                } else if ("s".equals(s)) {
                    ops.push(s);
                } else if (")".equals(s)) {
                    Double val = vals.pop();
                    String op = ops.pop();
                    if ("+".equals(op)) {
                        val = vals.pop()+val;
                    } else if ("-".equals(op)) {
                        val = vals.pop()-val;
                    } else if ("*".equals(op)) {
                        val = vals.pop()*val;
                    } else if ("/".equals(op)) {
                        val = vals.pop()/val;
                    } else if ("s".equals(op)) {
                        val = Math.sqrt(val);
                    }
                    vals.push(val);
                } else {
                    vals.push(Double.parseDouble(s));
                }
            }
        }

        System.out.println(vals.pop());
    }
}
