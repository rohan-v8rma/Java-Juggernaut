package com.errorHandling;

class Circle {

    private double radius;

    private static int numOfObjects = 0;

    void setRadius(double newRadius) throws userDefinedException {
        if(newRadius >= 0) {
            this.radius = newRadius;
        }
        else {
            throw new userDefinedException(newRadius);
        }
    }

    double getRadius() {
        return this.radius;
    }

    Circle() throws userDefinedException {
        this(1.0);
    }

    Circle(double newRadius) throws userDefinedException {
        setRadius(newRadius);
        Circle.numOfObjects++;
    }

}

public class testUserDefinedException {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }
    static void method() throws Exception {
        try {
            Circle c1 = new Circle(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
    }
}
