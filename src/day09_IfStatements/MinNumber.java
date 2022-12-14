package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 100,
            n2 = 150;

        boolean first = n1 < n2;
        boolean second = n2 < n1;
        boolean equal = n1 == n2;

        if (first) {
            System.out.println(n1 + " is the minimum number");
        }

        if (second) {
            System.out.println(n2 + " is the minimum number");
        }

        if (equal) {
            System.out.println("equal");
        }










    }
}
