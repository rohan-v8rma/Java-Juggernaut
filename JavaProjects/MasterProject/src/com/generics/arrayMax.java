package com.generics;

public class arrayMax {

    public static Integer array_max(Integer data[], int n) {
        Integer max = data[0];
        for(int index = 1; index < n; index++) {
            if(max < data[index]) {
                max = data[index];
            }
        }
        return max;
    }
    public static Double array_max(Double data[], int n) {
        Double max = data[0];

        for(int index = 1; index < n; index++) {
            if(max < data[index]) {
                max = data[index];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T array_max(T data[], int n) {
        T max = data[0];

        for(int index = 1; index < n; index++) {
            if(max.compareTo(data[index]) < 0) {
                max = data[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Float arr[] = {2.7f,3.8f,5.5f,6.7f,9.7f};
        System.out.println(array_max(arr, 5));
    }
}
