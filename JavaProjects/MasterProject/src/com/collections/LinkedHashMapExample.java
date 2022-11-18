package com.collections;

import java.util.LinkedHashMap;


public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> insertionOrder = new LinkedHashMap<String, Integer>();
        insertionOrder.put("one", 1);
        insertionOrder.put("two", 2);
        insertionOrder.put("three", 3);
        insertionOrder.put("four", 4);

        System.out.println("Insertion order:");
        System.out.println(insertionOrder.get("one"));
        System.out.println(insertionOrder);

        LinkedHashMap<String, Integer> accessOrder = new LinkedHashMap<String, Integer>(16, 0.6f, true);
        accessOrder.put("one", 1);
        accessOrder.put("two", 2);
        accessOrder.put("three", 3);
        accessOrder.put("four", 4);

        System.out.println("\nAccess order:");
        System.out.println(accessOrder);
        System.out.println(accessOrder.get("one"));
        System.out.println("After one is accessed: ");
        System.out.println(accessOrder);
    }
}
