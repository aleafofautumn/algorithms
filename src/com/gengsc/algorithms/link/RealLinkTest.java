package com.gengsc.algorithms.link;

import java.util.Arrays;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-16 12:41
 */
public class RealLinkTest {

    public static void main(String[] args) {
        RealLink link = new RealLink<String>();
        System.out.println(link.isEmpty());

        link.add("火车头");
        link.add("车厢1");
        link.add("车厢2");
        link.add("车厢3");

        System.out.println(Arrays.toString(link.toArray()));

        System.out.println(link.find(link,"火车头"));
        System.out.println(link.find(link,"车厢3"));
        System.out.println(link.find(link,"火车尾"));

        /*link.print();
        System.out.println(link.size());
        System.out.println(link.isEmpty());

        System.out.println("===================");
        System.out.println(link.contains("A"));
        System.out.println(link.contains("车厢1"));
        System.out.println(link.contains("火车头"));

        System.out.println("===================");
        System.out.println(link.get(2));
        System.out.println(link.get(0));
        System.out.println(link.get(-1));

        System.out.println("===================");
        link.set(2, "餐车");
        link.print();

        System.out.println("===================");
        link.remove("餐车");
        link.print();

        System.out.println("===================");
        System.out.println(Arrays.toString(link.toArray()));

        System.out.println("===================");
        link.removeLast();
        link.print();
        System.out.println("===================");
        link.removeLast();
        link.print();
        System.out.println("===================");
        link.removeLast();
        link.print();
        System.out.println(link.size());*/

        /*System.out.println("+++++++++++++++++++");
        link.remove(0);
        System.out.println(Arrays.toString(link.toArray()));
        link.remove(2);
        System.out.println(Arrays.toString(link.toArray()));*/
    }

}
