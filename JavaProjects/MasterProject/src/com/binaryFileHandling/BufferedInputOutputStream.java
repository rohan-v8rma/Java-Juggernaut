package com.binaryFileHandling;

import java.io.*;

import java.io.BufferedInputStream;

public class BufferedInputOutputStream {
    public static void main(String[] args) throws Exception {
        try (
//            BufferedOutputStream output = new BufferedOutputStream(new DataOutputStream(new FileOutputStream("/home/rohan/txt-files/temp.dat")));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("/home/rohan/txt-files/temp.dat"));
        ) {
            output.write(2);
        }

    }
}
