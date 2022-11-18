package com.collections;

import java.util.Comparator;
import java.util.TreeMap;

class StringCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if(str1.compareTo(str2) > 0) {
            return -1;
        }
        else if(str1.compareTo(str2) < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> treeHashTable1 = new TreeMap<String, Integer>();

        treeHashTable1.put("c", 3);
        treeHashTable1.put("b", 2);
        System.out.println(treeHashTable1);
        treeHashTable1.put("d", 4);
        System.out.println(treeHashTable1);
        treeHashTable1.put("a", 1);
        System.out.println(treeHashTable1);


        System.out.println("\nCustom Comparator (reverse alphabetical order): ");
        StringCompare x = new StringCompare();

        // Passing an instance of a Comparator Class into the TreeMap constructor
        TreeMap<String, Integer> treeHashTable2 = new TreeMap<String, Integer>(x);

        treeHashTable2.put("c", 3);
        treeHashTable2.put("b", 2);
        System.out.println(treeHashTable2);
        treeHashTable2.put("d", 4);
        System.out.println(treeHashTable2);
        treeHashTable2.put("a", 1);
        System.out.println(treeHashTable2);
    }
}
