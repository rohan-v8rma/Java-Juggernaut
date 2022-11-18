package com.collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // farzi linked list. index bhi chal hi raha hai

        LinkedList<Integer> adj = new LinkedList<Integer>();
        adj.addFirst(2);
        adj.addLast(3);
        adj.add(1, 4);

        System.out.println(Arrays.toString(adj.toArray()));

        System.out.println(adj.getFirst());
        System.out.println(adj.get(1));
        System.out.println(adj.getLast());

        ListIterator<Integer> iter = adj.listIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        // testing subList feature
        System.out.println(Arrays.toString(adj.subList(0, 2).toArray()));
    }
}
