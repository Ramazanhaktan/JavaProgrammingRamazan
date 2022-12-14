package day12_Scanner;

import java.util.Scanner;

public class ConvertCentToDollar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cent = scan.nextInt();
        int dollar = cent/100;
        int remainCent = cent%100;

        System.out.println(cent + " cents equal to: " + dollar +
                " dollars and " + remainCent + " cents");








    }
}
