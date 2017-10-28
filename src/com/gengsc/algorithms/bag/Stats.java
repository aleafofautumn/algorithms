package com.gengsc.algorithms.bag;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;

/**
 * 不支持删除元素
 * 收集元素并遍历
 * 是否非空
 * 元素数量
 * *顺序不重要
 */
public class Stats {

    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();

        //添加背包
        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }

        //元素数量
        int N = numbers.size();

        //平均值
        Double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }
        Double mean = sum/N;

        sum = 0.0;
        //标准差
        for (Double number : numbers) {
            sum += (number-mean)*(number-mean);
        }
        Double std = Math.sqrt(sum / (N - 1));

        //打印结果
        System.out.println("Mean: "+mean);
        System.out.println("std: "+std);

    }

}
