package com.collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<String, Integer>();

        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        // Testing containsKey and containsValue functions
        System.out.println(hashTable.containsKey("one"));
        System.out.println(hashTable.containsValue(2));

        // Testing the size function
        System.out.println(hashTable.size());

        // Gives the entries of the hash table as a set
        System.out.println(hashTable.entrySet());

        // Testing the remove function
        hashTable.remove("two");

        System.out.println(hashTable.keySet());
        System.out.println(hashTable.values());

    }
}
