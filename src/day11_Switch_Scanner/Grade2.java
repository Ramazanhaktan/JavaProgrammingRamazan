package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        /*
        if grade is A or B or C or D ==>   "passed"
        otherwise ==> "failed"
         */

        char ch = 'B';
        //  || ==> boolean,   it is not accepted by switch
        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("passed");
                break;

            case 'F':
                System.out.println("failed");
                break;

            default:
                System.out.println("invalid");


        }


    }
}
