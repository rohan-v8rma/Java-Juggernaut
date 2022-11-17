package com.errorHandling;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.lang.reflect.Executable;

public class userDefinedException extends Exception {
    private double radius;

    public userDefinedException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public userDefinedException(double radius, Throwable cause) {
        super("Invalid radius " + radius, cause);
    }

    public static void main(String[] args) {
        try {
            try {
                Exception cause = new Exception("YO wsssup, this is XCEPTTION.");
                throw cause;
            }
            catch (Exception cause) {
                throw new userDefinedException(-10, cause);
            }
        }
        catch (userDefinedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
