package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        

        //assigment: =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";

        System.out.println("word = " + word); //Java Programming
        
        word = "Wooden Spoon";

        System.out.println("word = " + word); //Wooden Spoon
        
        word = "Cydeo";

        System.out.println("word = " + word); //Cydeo

        System.out.println("------------------------------------------");

        //Addition Assignment:
            int x = 100;

        System.out.println("x = " + x);
        
        x += 200;

        System.out.println("x = " + x);
        
        String str = "Wooden";
        
        str += " Spoon";

        System.out.println("str = " + str); // Wooden Spoon

        double num1 = 2.5;

        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5; //addition assignment

        System.out.println("num1 = " + num1); //8.0

        double availableBalance = 1000.50;

        // deposit 300$

        availableBalance += 300;  // availableBalance = 1000.50 + 300

        System.out.println("availableBalance = " + availableBalance); //1300.50

        System.out.println("-------------------------------------------------------");

        // withdrawing 500$

        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance); // 800.50
        
        //withdrawing 200$, then depositing 400$
        
        availableBalance -= 200; //subtraction assignment
        availableBalance += 400; ////addition assignment

        System.out.println("availableBalance = " + availableBalance);//1000.50

        System.out.println("----------------------------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2;

        System.out.println("salary = " + salary);

        double doge = 0.00000001;

        doge *= 1000000;

        System.out.println("dodge = " + doge);

        System.out.println("-----------------------------------------");

        double num2 = 25000;

        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------------");

        double num3 = 100;

        // %=

        num3 %= 3; //1

        System.out.println("num3 = " + num3);

        System.out.println("------------------------------------");

        int amount = 127; //cent

        int quarters = amount/25;
        int cents = amount%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("-----------------------------------------------");

        int balance = 3500;

        //insurance fee: 153$

        balance %= 153;

        System.out.println("balance = " + balance);

        System.out.println("--------------------------------------------");










    }


}
