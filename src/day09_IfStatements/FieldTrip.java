package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
        /*
        grade - 1
location -  Apple orchard
number of groups - 3
teacher in charge - Ms. Smith
grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee
grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson
grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes
grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela
grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
         */

        int grade = 3;

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                System.out.println("location -  Apple orchard\n" +
                        "number of groups - 3\n" +
                        "teacher in charge - Ms. Smith");
            } else if (grade == 2) {
                System.out.println("location - Zoo\n" +
                        "number of groups - 7\n" +
                        "teacher in charge - Mr. Lee");
            } else if (grade == 3) {
                System.out.println("location - Aquarium\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Wilson");
            } else if (grade == 4) {
                System.out.println("location - Movie theater\n" +
                        "number of groups - 2\n" +
                        "teacher in charge - Ms. Reyes");
            } else if (grade == 5) {
                System.out.println("location - Museum\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela");
            } else {
                System.out.println("location - Six Flags\n" +
                        "number of groups - 8\n" +
                        "teacher in charge - Mr. Watt\n");
            }

        }else {
            System.out.println("invalid");
        }

    }
}
