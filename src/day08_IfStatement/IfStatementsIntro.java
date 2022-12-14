package day08_IfStatement;

public class IfStatementsIntro {
    public static void main(String[] args) {

        /*
        if statements:
            single if: can be used creating condition for 1 possible outcomes

            if & else:

            multi-branch if:

            nested if:


         */

        int number = 101;
/*
        System.out.println("Odd Number");

        System.out.println("Even Number");
*/
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = number%2 != 0; // !evenNumber

        if (evenNumber) {
            System.out.println(number+ " is even number");
        }

        if (oddNumber){
            System.out.println(number+ " is odd number");
        }

        System.out.println("-------------------------------------");

        int n = -20;

        // positive
        if (n>0) {
            System.out.println(n+ " is positive");
        }
        // negative
        if (n<0) {
            System.out.println(n+ " is negative");
        }
        // zero
        if (n==0) {
            System.out.println(n+ " is zero");
        }














    }
}
