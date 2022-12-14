package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //Java Programming

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next(); //7925AEnter

        input.nextLine(); //Enter

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.next();

        System.out.println("Enter your zipcode: ");
        String zip = input.next();

        input.nextLine(); // Enter

        System.out.println("Enter your country name: ");
        String country = input.nextLine();


        input.close();



                /*
                1. Enter your full name ( nextLine )
                2. Enter your building number ( next() )
                3. Enter your street name (nextLine)
                4. Enter your city name (nextLine)
                5. Enter your state (nextLine )
                6. Enter your zipcode ( next() )

                display the shipping address

                John Smith
                7925 Jones Branch Dr
                McLean, VA 22012
                 */
    }
}
