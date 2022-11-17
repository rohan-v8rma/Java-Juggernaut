package com.algorithms;

import java.util.Arrays;


//! This is a brute-force implementation since the function is being recursively called until no new paths are being added in the array.

public class WarshallAlgorithm2 {

    public static void main(String[] args) {
        // Value of 1 at (i, j) means there lies a path from i to j

//        int[][] matrix = {
//                {1, 1, 0, 1},
//                {0, 1, 1, 0},
//                {0, 0, 1, 1},
//                {0, 0, 0, 1}
//        };

//        int graph[][] = {
//                {0, 0, 0, 1},
//                {0, 0, 1, 1},
//                {0, 1, 1, 0},
//                {1, 1, 0, 1}
//        };
        int graph[][] = {
                {1, 1, 0, 1},
                {0, 1, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}
        };
        for (int k = 0; k < graph.length; k++) {
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {
                    if (graph[i][k] == 1 && graph[k][j] == 1) {
                        graph[i][j] = 1;
                    }
                }
            }
        }
        printMatrix(graph);
    }


   static int[][] copy2dMatrix(int[][] originalArr) {

        int[][] copyArr = new int[originalArr.length][originalArr[0].length];
        for(int row = 0; row < copyArr.length; row++) {
            for(int column = 0; column < copyArr[row].length; column++) {
                copyArr[row][column] = originalArr[row][column];
            }
        }
        return copyArr;
   }

   // We need to do this because if we use Arrays.equals(), although in the case of integer arrays, the arrays being different objects won't matter. In the case of 2d arrays, the nested array elements will be compared using equals(), returning false since they are two different objects.
   // TODO : Understand more in-depth
   static boolean compare2dMatrix(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for(int index = 0; index < arr1.length; index++) {
            if( !(Arrays.equals(arr1[index], arr2[index])) ) {
                return false;
            }
        }

        return true;
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
