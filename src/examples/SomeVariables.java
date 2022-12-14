package examples;

import java.util.Arrays;
import java.util.Scanner;

public class SomeVariables {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalCost = 0.0;
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        int p = fullName.indexOf(" ");
        fullName = fullName.substring(0,1).toUpperCase() + fullName.substring(1, p) + " " + fullName.substring(p+1,p+2).toUpperCase() + fullName.substring(p+2);

        System.out.println("Do you have a US driver license?");
        String hasLicense = scan.next();

        if(hasLicense.equalsIgnoreCase("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        if (zipCode==20910 || zipCode==20740){
            totalCost += 60;
        }else if (zipCode==22102 || zipCode==22103){
            totalCost += 30;
        }else{
            totalCost += 50;
        }

        System.out.println("totalCost1 = " + totalCost);

        System.out.println("Is this vehicle owned, financed, or leased?");
        String ownership = scan.next();

        if (ownership.equals("owned")){
            totalCost +=10;
        }else if (ownership.equals("financed")){
            totalCost +=15;
        }else if (ownership.equals("leased")){
            totalCost +=20;
        }

        System.out.println("How is this vehicle primarily used?");
        String carUsage = scan.next();

        if(carUsage.equals("business")){
            totalCost += 50;
        }else if(carUsage.equals("pleasure")){
            totalCost += 10;
        }else if(carUsage.equals("commuting")){
            totalCost += 20;
            System.out.println("How many days do you commute?");
            int commuteDay = scan.nextInt();

            for (int i = 0; i < commuteDay; i++) {
                totalCost += 5;
            }
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age<16){
            System.out.println("You can't be driving");
            System.exit(0);
        }else if(age>=16&&age<20){
            totalCost *= 10;
        }else if(age>=20&&age<25){
            totalCost *= 6;
        }else if(age>=25){
            totalCost *= 2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String hasAccident = scan.next();
        if(hasAccident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int numAccident = scan.nextInt();

/*for (int i = 0; i < numAccident; i++) {
  totalCost += 10;
}*/
            totalCost += 10* numAccident;

        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education = scan.nextLine();
        if (education.equals("Bachelors") || education.equals("Masters")){
            totalCost = totalCost*95/100;
        }else if(education.equals("PHD")){
            totalCost = totalCost*90/100;
        }else if(education.equals("High School")){
            totalCost = totalCost*95/100;
        }

        System.out.println(fullName + ", here's your quote!");
        System.out.println("This is your start premium cost: $" + totalCost);

        String reference = (fullName.substring(0, 2) + age + fullName.substring(fullName.length()-3) + zipCode + education.replace(" ", "")).toUpperCase();

        System.out.println("This is your reference number: " + reference);


        scan.close();



    }


        }































