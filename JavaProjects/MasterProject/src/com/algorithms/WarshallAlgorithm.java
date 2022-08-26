package com.algorithms;

import java.util.Arrays;

//! This algorithm doesn't work properly because if suppose there is a path from 0 to 3, from 3 to 1, from 1 to 2, then the algo isn't able to figure out that there is a path from 0 to 2

public class WarshallAlgorithm {
    public static void main(String[] args) {
        // Value of 1 at i, j means there lies a path from i to j

//        int[][] matrix = {
//                {1, 1, 0, 1},
//                {0, 1, 1, 0},
//                {0, 0, 1, 1},
//                {0, 0, 0, 1}
//        };

        int[][] matrix = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 1}
        };

        for(int origin = 0; origin < matrix.length; origin++) {
            for(int destination = 0; destination < (matrix[origin]).length; destination++) {
                if(matrix[origin][destination] == 1) {
                    for(int intermediary = 0; intermediary < matrix.length; intermediary++) {
                        if(matrix[destination][intermediary] == 1) {
                            matrix[origin][intermediary] = 1;
                        }
                    }
                }
            }
        }

        // Output
        printMatrix(matrix);
    }

//    static void warshallAlgorithm(int[][] arr)

    static void printMatrix(int[][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
