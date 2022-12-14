package day08_IfStatement;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

    public static void main(String arr[]) {

     String str = "abcd";
     char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));
       /*### Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:











** At the end display the total price of the custom computer**
>

Main topics: conditional statements, primitive variables, operators, Scanner
**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price
```*/

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("Select screen size");
        double screenSize = scan.nextDouble();


        if (screenSize==13.3){
            totalPrice += 200;
        } else if (screenSize==15.0) {
            totalPrice += 300;
        } else if (screenSize==17.3) {
            totalPrice +=400;
        }

/***Then ask the user about the CPU**
 > Select CPU type:
 > - For a CPU of `i3`, add `$150` to the total price
 > - For a CPU of `i5`, add `$250` to the total price
 > - For a CPU of `i7`, add `$350` to the total price*/

        System.out.println("Select CPU type");
        String cpu = scan.next();

        if (cpu.equals("i3")){
            totalPrice += 150;
        } else if (cpu.equals("i5")) {
            totalPrice+= 250;
        } else if (cpu.equals("i7")) {
            totalPrice+= 350;
        }
        /***Then ask the user about the RAM size**
         > Select RAM size:
         > - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4*/

        System.out.println("Select RAM size");
        int ram = scan.nextInt();

        if (ram%4==0){
            totalPrice += (ram/4)*50;
        }
/***Then ask the user about the storage type and amount**
 > Select storage type:

 > Select storage size:

 > - For `HDD`, add `$50` to the total price for every 500GB
 > - For `SSD`, add `$100` to the total price for every 500GB*/

        System.out.println("Select storage type");
        String storageType = scan.next();

        System.out.println("Select storage size");
        int storageSize = scan.nextInt();

        if (storageType.equals("HDD")){
            totalPrice += (storageSize/500)*50;
        } else if (storageType.equals("SSD")) {
            totalPrice += (storageSize/500)*100;
        }



        /***Then ask the user about the screen resolution**
         > Select screen resolution:
         > - For `FULLHD`, add `$100` to the total price
         > - For `4K`, add `$200` to the total price*/

        System.out.println("Select screen resolution");
        String screenResolution = scan.next();

        switch (screenResolution){
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
        }

        System.out.println("Laptop price is: $" + totalPrice);


    }
}
