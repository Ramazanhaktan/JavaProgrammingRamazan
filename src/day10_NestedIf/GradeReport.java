package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90-100: excellent
        80-89: great
        70-79: good
        60-69: passed
        0-59: failed
         */

        int score = 75;

        String result = ""; // temporary

        if (score >= 0 && score <= 100){

            if (score >=90 ) { // false: score < 90
                result = "Excellent";
            } else if (score >=80 ) {  // false: score < 80
                result = "Great";
            } else if (score >=70 ) { // false: score < 70
                result = "Good";
            } else if (score >=60 ) { // false: score < 60
                result = "Passed";
            }else {
                result = "Failed";
            }

        }else { // if the score is NOT valid
            result = "Invalid score";
        }

        System.out.println(result);

        System.out.println("-------------------------------------------");

        // solution 2 : use ternaries ONLY

        String result2 = (score >= 0 && score <= 100)? (score >= 90)? "excellent"
                :(score >= 80)? "great" :(score>= 70)? "good" :(score>=60)? "passed"
                : "failed" : "invalid score";

        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------------------");

        //solution3


        if (score >= 0 && score <= 100){

            result2 = (score >= 90)? "excellent"
                    :(score >= 80)? "great" :(score>= 70)? "good" :(score>=60)? "passed"
                    : "failed";

        }else { // if the score is NOT valid
            result2 = "Invalid score";
        }

        System.out.println(result2);




    }
}
