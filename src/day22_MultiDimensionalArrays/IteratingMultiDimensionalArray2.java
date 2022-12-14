package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int i = arr2D.length - 1; i >= 0; i--) { //i: index number of one dimensional array starting from last index to 0
            for (int j = 0; j < arr2D[i].length; j++) { //j: index number of elements
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------");

        /*
        3 2 1
        7 6 5 4
        12 11 10 9 8
         */

        for (int i = 0; i < arr2D.length; i++) { //i: indexes of each 1D array starts from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) { //j: indexes of each element starts from last index
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();

        }









        }

        }
        /*
        8 9 10 11 12
        4 5 6 7
        1 2 3
         */













