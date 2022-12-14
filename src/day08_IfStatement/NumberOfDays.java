package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 5;

        boolean has28days = number == 2;
        boolean has30days = number == 4 || number == 6 || number == 9 ||number == 11;
        boolean has31days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8
                || number == 10 || number == 12;

        if (has28days) {  // if the month has 28 days
            System.out.println("28 days");
        }

        if (has30days) {
            System.out.println("30 days");
        }

        if (has31days){
            System.out.println("31 days");
        }





    }
}
