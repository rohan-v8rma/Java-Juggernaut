package com.collections;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>(20);

        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        Iterator<Integer> iter = numList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
