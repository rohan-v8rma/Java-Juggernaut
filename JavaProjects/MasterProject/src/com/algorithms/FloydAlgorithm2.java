package com.algorithms;

public class FloydAlgorithm2 {
    
    public static void main(String[] args) {
        // Value of 1 at i, j means there lies a path from i to j
        double inf = Double.POSITIVE_INFINITY;
//        int[][] matrix = {
//                {1, 1, 0, 1},
//                {0, 1, 1, 0},
//                {0, 0, 1, 1},
//                {0, 0, 0, 1}
//        };

        double[][] matrix = {
                {inf, inf, inf, 1},
                {inf, inf, 1, 1},
                {inf, 1, 1, inf},
                {1, 1, inf, 1}
        };

        for(int origin = 0; origin < matrix.length; origin++) {
            for(int destination = 0; destination < (matrix[origin]).length; destination++) {
                for(int intermediary = 0; intermediary < matrix.length; intermediary++) {
                    if(matrix[destination][intermediary] + matrix[origin][destination]< matrix[origin][intermediary]) {
                        matrix[origin][intermediary] = matrix[origin][destination] + matrix[destination][intermediary];
                    }
                }
            }
        }
        

        // Output
       printMatrix(matrix);

    }
//    static void warshallAlgorithm(int[][] arr)

    static void printMatrix(double[][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
