package com.algorithms;

import java.util.Arrays;


//! This is a brute-force implementation since the function is being recursively called until no new paths are being added in the array.

public class WarshallAlgorithm {

    public static void main(String[] args) {
        // Value of 1 at (i, j) means there lies a path from i to j

//        int matrix[][] = {
//                {1, 1, 0, 1},
//                {0, 1, 1, 0},
//                {0, 0, 1, 1},
//                {0, 0, 0, 1}
//        };

        int matrix[][] = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 1}
        };
        
        warshallAlgorithm(matrix, countOnes(matrix));

        // Output
        printMatrix(matrix);
    }

   static void warshallAlgorithm(int[][] resultMatrix, int originalOneCount) {
        for(int origin = 0; origin < resultMatrix.length; origin++) {
            for(int destination = 0; destination < (resultMatrix[origin]).length; destination++) {
                if(resultMatrix[origin][destination] == 1) {
                    for(int intermediary = 0; intermediary < resultMatrix.length; intermediary++) {
                        if(resultMatrix[destination][intermediary] == 1) {
                            resultMatrix[origin][intermediary] = 1;
                        }
                    }
                }
            }
        }

        if(countOnes(resultMatrix) == originalOneCount) {
            return;
        }
        else {
            warshallAlgorithm(resultMatrix, countOnes(resultMatrix)); // passing the result matrix into the original argument for the next call, as a copy to ensure it doesn't get modified.
        }
   }

   // Function which counts the 1s, to see whether any new paths were added upon running the loops once more.
   static int countOnes(int[][] matrix) {
        int ct = 0;
       for(int row = 0; row < matrix.length; row++) {
           for (int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] == 1) {
                    ct++;
                }
           }
       }
       return ct;
   }

   // Function for printing the matrix
    static void printMatrix(int[][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
