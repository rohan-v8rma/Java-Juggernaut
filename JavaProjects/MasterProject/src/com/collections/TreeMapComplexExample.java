package com.collections;

import java.util.*;

class A implements Comparable<A> {
    int age;
    int height;

    @Override public int compareTo(A obj) {
        return (Integer.compare(this.age, obj.age));
    }

    @Override public String toString() {
        return("((age: " + age + "; height: " + height + "))");
    }

    A(int _age, int _height) {
        age = _age;
        height = _height;
    }
}

class AComparator implements Comparator<A> {

    @Override public int compare(A obj1, A obj2) {
        return (Integer.compare(obj1.height, obj2.height));
    }
}

public class TreeMapComplexExample {
    public static void main(String[] args) {
        TreeMap<A, Integer> treeHashTable1 = new TreeMap<>();

        treeHashTable1.put(new A(2, 3), 15);
        treeHashTable1.put(new A(3, 2), 10);

        System.out.println(treeHashTable1);

        AComparator x = new AComparator();

        TreeMap<A, Integer> treeHashTable2 = new TreeMap<>(x);

        treeHashTable2.put(new A(2, 3), 15);
        treeHashTable2.put(new A(3, 2), 15);

        System.out.println(treeHashTable2);
    }
}
