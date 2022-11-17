package com.FileHandling;

import java.io.File;


public class FileClass {


    public static void main(String[] args) {
        File object0 = new File("/home/");
        System.out.println(object0.isAbsolute());

        File object1 = new File("./");
        System.out.println(object1.isAbsolute());

        File object2 = new File("./hello.txt");
        System.out.println(object1.isAbsolute());

        System.out.println("Does object1 represent a directory? " + object1.isDirectory());
        System.out.println("Does object1 represent a file? " + object1.isFile());

        System.out.println("Does object2 represent a directory? " + object2.isDirectory());
        System.out.println("Does object2 represent a file? " + object2.isFile());

        File file = new File("image/us.gif");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
//        System.out.println("Canonical path is " + file.getCanonicalPath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));


        System.out.println(object2.getAbsolutePath());
    }
}
