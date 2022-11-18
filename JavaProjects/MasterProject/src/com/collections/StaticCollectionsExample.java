package com.collections;

import java.util.*;

public class StaticCollectionsExample {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("yellow", "green", "red");
//
//        System.out.println(Arrays.toString(list.toArray()));
//
//        Collections.shuffle(list);
//
//        System.out.println(Arrays.toString(list.toArray()));
//
//        System.out.println(Arrays.toString(list.toArray()));

        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list1, new Random(20));
        Collections.shuffle(list2, new Random(20));
        System.out.println(list1);
        System.out.println(list2);
    }
}
