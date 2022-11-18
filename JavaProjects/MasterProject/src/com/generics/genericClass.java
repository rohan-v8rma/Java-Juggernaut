package com.generics;


public class genericClass<T> {

    T obj; // An object of type T is declared

    genericClass(T obj) { // Parameterized Constructor
        this.obj = obj;
    }

    public T getObject() { // get method
        return this.obj;
    }

    public static void main(String[] args) {
        genericClass<Integer> instance = new genericClass<Integer>(2);
    }
}
