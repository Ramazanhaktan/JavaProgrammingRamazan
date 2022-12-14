package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();  // 5

        if (length<=0){
            System.err.println("invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; //[0, 0, 0, 0, 0]

        for (int i = 0; i < length; i++) {
            System.out.println("enter a number");
            numbers[i] = scan.nextInt(); // 5
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();








    }
}
