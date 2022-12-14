package day12_Scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How mant total shares do you have?");
        int share = scan.nextInt();

        if (share>0){
            System.out.println("How much their total value?");
            double value = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the name of company");
            String company = scan.nextLine();

            System.out.println("Your total stock market holding is $" + value+
                    " which is made up of "+ share+ " shares. "+company+
                    " is your company holdings");


        }







    }
}
