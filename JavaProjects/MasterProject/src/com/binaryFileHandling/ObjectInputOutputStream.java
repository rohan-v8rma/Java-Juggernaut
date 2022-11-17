package com.binaryFileHandling;

import java.util.*;

import java.io.*;

public class ObjectInputOutputStream {
    public static void main(String[] args) throws Exception {
//        try (
//            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("/home/rohan/txt-files/temp.dat"));
//        ) {
//            output.writeUTF("John");
//            output.writeUTF("885.5");
//            output.writeObject(new java.util.Date());
//        }
//        try (
//                ObjectInputStream input = new ObjectInputStream(new FileInputStream("/home/rohan/txt-files/temp.dat"));
//        ) {
//            System.out.println(input.readUTF());
//            System.out.println(Double.parseDouble(input.readUTF()));
//            System.out.println(input.readObject());
//        }

        try (
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        ) {
            output.writeObject(new A());
        }
        catch(NotSerializableException ex){
            System.out.println(ex.getMessage());
        }
    }
}
class A implements Serializable {
    transient B b = new B();
}

class B{
}