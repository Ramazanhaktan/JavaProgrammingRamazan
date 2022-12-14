package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        boolean result1 = (number%2) == 0;
        boolean result2 = (number%3) == 0;
        boolean result3 = (number%5) == 0;

        System.out.println(number + " is divisible by 2: " + result1);
        System.out.println(number + " is divisible by 3: " + result2);
        System.out.println(number + " is divisible by 5: " + result3);

        System.out.println("------------------------------------------------");

        int year = 2000;

        boolean isLeapYear = year%4 == 0;

        System.out.println(year+ " is leap year: " + isLeapYear);







    }
}
