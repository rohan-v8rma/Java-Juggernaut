package com.generics;

import java.util.*;

public class comparableClass implements Comparable<comparableClass> {
    String name;
    int age;

    comparableClass(String _name, int _age) {
        name = _name;
        age = _age;
    }

    // compareTo method for this class, as it implements the Comparable interface
    public int compareTo(comparableClass compareObj) {
        if(compareObj.age == this.age) {
            return 0;
        }
        else if(compareObj.age < this.age) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return (name + " " + Integer.toString(age));
    }

    public static void main(String[] args) {
        ArrayList<comparableClass> listOfComparables = new ArrayList<comparableClass>();
        listOfComparables.add(new comparableClass("one-one", 11));
        listOfComparables.add(new comparableClass("one-two", 12));
        listOfComparables.add(new comparableClass("three", 3));

        System.out.println(Arrays.toString(listOfComparables.toArray()));

        Collections.sort(listOfComparables);

        System.out.println(Arrays.toString(listOfComparables.toArray()));
    }
}
