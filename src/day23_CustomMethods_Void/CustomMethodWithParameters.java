package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {
        oddOrEven(5); // 5 is odd number
        oddOrEven(6); // 6 is even number
        ageOfPerson(1988);
        printNumbers(10,20);

    }

    // create a function that can check if a number is odd or even number

    public static void oddOrEven(int number){
        if (number%2==0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

// create a function that can display the age of the person

    public static void ageOfPerson (int birthYear){
        int age = 2022 - birthYear;
        System.out.println("age is: " + age);
    }

    // create a function that can print all the numbers between X and Y

    public static void printNumbers(int x, int y){

    }

}
