package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 7;
        /*
        if (number == 1){
            System.out.println("Monday");
        }
        .....
        */

        // <= >= .....  you can NOT use switch statements

        switch (number){ //1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;


            default:  // only gets executed if none of the case blocks are matching
                System.out.println("invalid");
                break;


                /*
                Case value MUST match with switch' data type
                           MUST be UNIQUE
                // long number = 9L;
                // float number = 9F;
                // double number = 9D;
                // boolean number = true;
                    NOT ACCEPTED
                break: used for exiting the switch.
                    If we don't give the break statement, switch statement continue to execute the next blocks
                    until the break statements or } of the switch
                default block gets executed if none of the case blocks matched.
                    There can only be ONE default block.
                or logic (||) ==> we can use it in switch by declaring case blocks back to back

                 */

        }


    }
}
