package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"John", "Joes", "James"};
        String[] group2 = {"John", "Joes", "James"};
        String[] group3 = {"John", "Joes", "James"};

  String[][] groups = new String[3][]; // index: 0,1,2
    groups[0] = group1;
    groups[1] = group2;
    groups[2] = group3;

        System.out.println(Arrays.toString(groups)); // toString() is for single dimensional array

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------------------------------");

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
        */

        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
        //       index:     0          1            2

        // {4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1])); // {4,5,6,7}

        // 11
        System.out.println(arr2D[2][3]); // 11











       /*
        String[] group1 = {"John", "Joes", "James"};
        String[] group2 = {"John", "Joes", "James"};
        String[] group3 = {"John", "Joes", "James"};
*/












    }
}
