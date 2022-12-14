package day08_IfStatement;

public class GradeLevelSchool {
    public static void main(String[] args) {

        int grade = 15;

        if (1<=grade && grade <= 5){
            System.out.println("Elementary school");
        } else if (6<=grade && grade <= 8) {
            System.out.println("Middle school");
        } else if (9<=grade && grade <= 12) {
            System.out.println("High school");
        } else if (13<=grade && grade <= 16) {
            System.out.println("College");
        }else {
            System.out.println("Grad school");
        }


    }
}
