package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("invalid answer, please re-enter:");
            answer = scan.next().toLowerCase();
        }

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else if (answer.equalsIgnoreCase("no")){
            System.out.println("Goodbye");
        }






        }








    }

