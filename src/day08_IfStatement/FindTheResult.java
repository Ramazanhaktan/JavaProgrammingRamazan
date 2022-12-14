package day08_IfStatement;

public class FindTheResult {

    public static void main(String[] args) {

        int a = 20;

        if (a%3 == 0){
            a += 20;
        } else if (a%5 == 0) {
            a += 25;
        } else if (a%15 == 0) {
            a += 50;
        }

        System.out.println(a);
    }
}
