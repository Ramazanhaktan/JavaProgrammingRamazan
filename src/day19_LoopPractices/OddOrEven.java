package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }

            System.out.println("Would you like to enter another number? Yes/no");
            String answer = scan.next().toLowerCase();

            if ( ! ( answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid entry!");
                System.exit(0);
            }

            if (answer.equals("no"))
                System.out.println("thank you!");
                break;

        }











    }
}
