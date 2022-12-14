package day12_Scanner;

import java.util.Scanner;

public class ConvertMilesToKM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles:");

        double miles = scan.nextDouble();
        double KM = miles * 1.609;

        System.out.println(miles + " miles equal to " + KM + " kilometers");






    }
}
