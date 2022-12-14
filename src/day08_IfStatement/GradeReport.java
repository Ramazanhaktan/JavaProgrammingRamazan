package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
/*
score:
    90~100 ==> Excellent
    80~89 ==> Great
    70~79 ==> Good
    60~69 ==> Passed
    0~59 ==> Failed
 */
        int score = 85;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        // boolean b = score >= 80 && !a
        boolean c = score >= 70 && score <= 79;
        // boolean c = score >= 70 && !b && !a
        boolean d = score >= 60 && score <= 69;
        boolean e = score >= 0 && score <= 59;
        // boolean e = !a && !b && !c && !d

        if (a) {
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }
        if (e) {
            System.out.println("Failed");
        }







    }
}
