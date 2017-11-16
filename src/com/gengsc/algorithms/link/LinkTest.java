package com.gengsc.algorithms.link;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-16 11:13
 */
public class LinkTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("火车头");
        link.add("车厢1");
        link.add("车厢2");
        link.add("车厢3");

        link.print();
    }
}
