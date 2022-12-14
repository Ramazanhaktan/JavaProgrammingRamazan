package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        //username: "Cydeo"
        //password: "Cydeo123"


        // while(invalid && has attempts)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scan.next();
        System.out.println("Enter password:");
        String password = scan.next();

        if (username.equals("Cydeo")  && password.equals("Cydeo123")){
            System.out.println("logged in");
        }else {
            int attempts = 3;


            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {
                System.out.println("incorrect data, please re-try:");
                System.out.println("Enter username:");
                username = scan.next();
                System.out.println("Enter password:");
                password = scan.next();
                attempts--;
            }

            if (username.equals("Cydeo")  && password.equals("Cydeo123")){
                System.out.println("logged in");
            }else {
                System.out.println("your account is locked");
            }

        }

scan.close();





    }
}
