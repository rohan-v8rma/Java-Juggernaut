package com.FileHandling;

import java.util.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class PrintWriterClass {
    public static void main(String[] args) throws FileNotFoundException { // We have to wr
        File fileObject = new File("/home/rohan/txt-files/hello.txt");

        PrintWriter outputStream = new PrintWriter(fileObject);
        outputStream.print("hello");
        outputStream.print(" world.");
        outputStream.print(" now");
        outputStream.println(" bye");

        outputStream.close();

        Scanner inputStream = new Scanner(fileObject);

        while(inputStream.hasNext()) {
            System.out.print(inputStream.next());
        }

        inputStream.close();
    }
}
