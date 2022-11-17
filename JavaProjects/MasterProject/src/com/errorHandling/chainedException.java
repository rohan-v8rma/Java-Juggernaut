package com.errorHandling;

public class chainedException {

    public static void method2() throws Exception {
        throw new Exception("New info from method2.");
    }

    public static void method1() throws Exception {
        try {
            method2();
        }
        catch (Exception ex) {
            throw new Exception("New info from method1.", ex);
        }
    }
    
    public static void main(String[] args) {
        try {
            method1();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause()); // This returns the Throwable which caused the current exception
            System.out.println(ex.getCause().getMessage()); // The message of the cause Throwable
            ex.printStackTrace();
        }
    }    
}
