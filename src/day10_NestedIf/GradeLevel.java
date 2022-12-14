package day10_NestedIf;

public class GradeLevel {

    public static void main(String[] args) {

        int grade = 19;

        String result = "";

        if (grade >= 1 && grade <= 18){

            if (grade <= 5){
                result = "Elementary school";
            } else if (grade <= 8) {
                result = "Middle school";
            } else if (grade <= 12) {
                result = "High school";
            }else if (grade <= 16) {
                result = "College";
            }else  {
                result = "Grad school";
            }

        }else {
            result = "Invalid grade level given";
        }
        System.out.println(result);



    }
}
