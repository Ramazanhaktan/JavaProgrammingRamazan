package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 5; //1~7

        if (n == 1) {
            System.out.println(n + " is Monday");
        } else if (n == 2) {
            System.out.println(n + " is Tuesday");
        } else if (n == 3) {
            System.out.println(n + " is Wednesday");
        } else if (n == 4) {
            System.out.println(n + " is Thursday");
        } else if (n == 5) {
            System.out.println(n + " is Friday");
        } else if (n == 6) {
            System.out.println(n + " is Saturday");
        } else  {
            System.out.println(n + " is Sunday");
        }

        String result = (n == 1)? "Monday" :(n == 2)? "Tuesday"
                :(n == 3)? "Wednesday" :(n == 4)? "Thursday"
                :(n == 5)? "Friday" :(n == 6)? "Saturday" : "Sunday";

        System.out.println(result);




    }
}
