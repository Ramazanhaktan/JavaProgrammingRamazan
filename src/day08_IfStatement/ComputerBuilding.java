package day08_IfStatement;

import java.util.Scanner;

public class ComputerBuilding {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double total = 0;

        System.out.println("Select screen size");
        double screeenSize = scan.nextDouble();

        if (screeenSize == 13.3){
            total += 200;
        } else if (screeenSize== 15.0) {
            total += 300;
        } else if (screeenSize==17.3) {
            total+= 400;
        }

        System.out.println("Select CPU type");
        String cpu = scan.next();

        if (cpu.equals("i3")){
            total+=150;
        } else if (cpu.equals("i5")) {
            total+= 250;
        } else if (cpu.equals("i7")) {
            total+=350;
        }

        System.out.println("Select RAM size");
        int ram = scan.nextInt();

        if (ram%4==0){
            total+=(ram/4)*50;
        }

        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();

        if (storageType.equals("HDD")){
            total+= (storageSize/500)*50;
        } else if (storageType.equals("SSD")) {
            total+= (storageSize/500)*100;
        }

        System.out.println("Select screen solution");
        String solution = scan.next();

        if (solution.equals("FULLHD")){
            total+= 100;
        } else if (solution.equals("4K")) {
            total+= 200;
        }

        System.out.println("Laptop price is: $" + total);

    }
}
