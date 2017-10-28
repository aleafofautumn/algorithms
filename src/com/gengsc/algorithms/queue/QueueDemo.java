package com.gengsc.algorithms.queue;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

import java.util.Arrays;

public class QueueDemo {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(readInts("E:/temp/algs4-data/tinyT.txt")));
    }

    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> q = new Queue<>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }

        int N = q.size();
        int[] ret = new  int[N];
        for (int i = 0; i < ret.length ; i++) {
            ret[i] = q.dequeue();
        }
        return  ret;
    }

}
