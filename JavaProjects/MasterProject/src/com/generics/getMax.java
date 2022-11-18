package com.generics;

public class getMax {
    public static int integerCompare(int int1, int int2, int int3) {
        int max = int1;
        if(int2 > max) {
            max = int2;
        }
        if(int3 > max) {
            max = int3;
        }
        return max;
    }

    public static double doubleCompare(double dble1, double dble2, double dble3) {
        double max = dble1;
//        if(dble2.compareTo(max)) { // This works for Double wrapper class
        if(dble2 > max) {
            max = dble2;
        }
        if(dble3 > max) {
            max = dble3;
        }
        return max;
    }

    public static String stringCompare(String str1, String str2, String str3) {
        String max = str1;
        if(str2.compareTo(max) > 0) {
            max = str2;
        }
        if(str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }


    // The datatype passed to this function has to extend the comparable interface of java, which means they override the compareTo function, allowing for comparison between instances of that particular datatype.
    // Any datatype passed to this function must have comparison operation defined (should extend the Comparable interface). If we try to pass a variable of a type that does not extend the Comparable interface, we will get an error.
    public static <T extends Comparable<T>> T templateCompare(T var1, T var2, T var3) {
        T max = var1;
        if(var2.compareTo(max) > 0) {
            max = var2;
        }
        if(var3.compareTo(max) > 0) {
            max = var3;
        }
        return max;
    }
}
