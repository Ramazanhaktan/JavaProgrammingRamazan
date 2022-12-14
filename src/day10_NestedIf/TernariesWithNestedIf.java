package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        /*
         int score = 400;

        if (score >= 0 && score <= 100){ // if the score is valid
            if (score >= 60) { // if student passed exam
                System.out.println("Passed");
            }else { // otherwise, if the student failed exam
                System.out.println("Failed");
            }
        }else { // if the score is NOT valid
            System.out.println("Invalid score");
        }
         */

        int s = 85;
        /*
        if (s>=0 && s<=100){

            if (s>=60){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }

        }else{
            System.out.println("invalid score");
        }
        */

        String result = (s>=0 && s<=100)? (s>=60)? "passed" : "failed" : "invalid score";

        System.out.println(result);


    }
}
