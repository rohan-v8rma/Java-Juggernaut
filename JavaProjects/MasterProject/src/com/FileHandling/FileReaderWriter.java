package com.FileHandling;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws Exception {
        File fileObj = new File("/home/rohan/txt-files/hello.txt");
        FileReader inputStream = new FileReader(fileObj);

        int readCharacter = inputStream.read();
        while(readCharacter != -1) {
            System.out.println((char)readCharacter);
            readCharacter = inputStream.read();
        }

        inputStream.close();
    }

}
