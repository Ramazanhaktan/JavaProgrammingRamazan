package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scan.next();
        System.out.println("Enter last name:");
        String lastName = scan.next();

        firstName = firstName.substring(0,1).toUpperCase() // ==> ( ""+ firstName.charAt(0) )
                + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase()
                + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);












    }
}
