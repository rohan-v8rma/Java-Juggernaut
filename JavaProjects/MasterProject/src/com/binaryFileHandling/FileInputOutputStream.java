package com.binaryFileHandling;

import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInputOutputStream {
    public static void main(String[] args) throws Exception {
        try (
                FileInputStream fis = new FileInputStream("test.dat"); ) {
//            fis.read();
        }
//        try {
//            System.out.println("hello");
//        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }



//        try (
//                FileOutputStream output = new FileOutputStream("/home/rohan/txt-files/hello.txt");
//        ) {
//            String s = "abcd";
//            int a = 12;
//
//            output.write(s.getBytes());
//            output.write(Integer.toString(a).getBytes());
//        }
//        try (
//                FileInputStream input = new FileInputStream("/home/rohan/txt-files/hello.txt");
//        ) {
//
//
//            int value = input.read();
//
//            while(value != -1) {
//                System.out.println(value);
//                value = input.read();
//
//            }
//            input.reset();
//            System.out.println(input.read());
//            input.close();
//        }

//        try (
//                FileOutputStream output = new FileOutputStream("/home/rohan/txt-files/temp.dat");
//        ) {
//            for(int index = 1; index <= 10; index++) {
//                output.write(100000000+index);
//            }
//
//            output.write("hello".getBytes(), 9, 5);
//        }
//
//        try (
//                FileInputStream input = new FileInputStream("/home/rohan/txt-files/temp.dat");
//        ) {
//            int value;
//            while((value = input.read()) != -1) {
//                System.out.println(value + " ");
//            }
//            input.read();
//        }

//        try (
//                PrintWriter output = new PrintWriter(new FileOutputStream("/home/rohan/txt-files/temp.dat"));
//        ) {
//            output.println("Hlllo");
//            output.println("wirdk");
//        }
//
//        try (
//                Scanner input = new Scanner(new FileInputStream("/home/rohan/txt-files/temp.dat"));
//        ) {
//            System.out.println(input.nextLine());
//            System.out.println(input.nextLine());
//        }

    }
}
