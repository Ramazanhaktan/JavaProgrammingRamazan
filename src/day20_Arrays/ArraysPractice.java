package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store the elements: 10, 20, 50, 70

        int[] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------------------");

        //create a variable that can contain 5 scores

        int[] scores = new int[5]; //
        scores[1] = 85;
        scores[scores.length -1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;


        System.out.println(Arrays.toString(scores)); // [0, 85,

        System.out.println("------------------------------------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(month[0]); // January
        System.out.println(month[1]); // February
        System.out.println(month[2]); //
        System.out.println(month[3]); //
        System.out.println(month[4]); //
        System.out.println(month[5]); //
        System.out.println(month[6]); //

        System.out.println(Arrays.toString(month));

        for (int i = 0; i < month.length; i++) { // i represents the index numbers of array
            System.out.println(month[i]);
        }

        System.out.println("------------------------------------------------------------");

        for (int i = month.length -1; i >= 0; i--) {
            System.out.println(month[i]);
        }












    }
}
