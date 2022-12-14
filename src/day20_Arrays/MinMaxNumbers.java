package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            nums[i] = scan.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max)
                max= nums[i];

            if (nums[i]<min)
                min= nums[i];
        }





        System.out.println(Arrays.toString(nums));
        System.out.println(max);
        System.out.println(min);











    }
}
