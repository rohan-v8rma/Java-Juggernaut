package com.binaryFileHandling;

import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;

public class DataInputOutputStream {
    public static void main(String[]args) throws Exception {
//        try (
//                DataOutputStream output = new DataOutputStream(new FileOutputStream("/home/rohan/txt-files/temp.dat"));
//        ) {
//            output.writeChar('A');
//        }
//
//        try (
//                DataInputStream input = new DataInputStream(new FileInputStream("/home/rohan/txt-files/temp.dat"));
//        ) {
////            System.out.println(input.readDouble());
//            System.out.println(input.readChar());
//        }
        try {
            try ( // Create an output stream for file temp.dat
                  DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
            ) {
                // Write student test scores to the file
                output.writeUTF("John");
                output.writeDouble(85.5);
                output.writeUTF("Jim");
                output.writeDouble(185.5);
                output.writeUTF("George");
                output.writeDouble(105.25);
            }

            try ( // Create an input stream for file temp.dat
                  DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
            ) {
                // Read student test scores from the file
                while(input.available() != 0) {
                    System.out.println(input.readUTF() + " " + input.readDouble());
                }
                System.out.println();
            }

            try ( // Create an input stream for file temp.dat
                  DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
            ) {
                while(true) {
                    System.out.println(input.readUTF() + " " + input.readDouble());
                }
            }

        }
        catch (EOFException ex) {
            System.out.println("All data was read.");
        }
    }
}
