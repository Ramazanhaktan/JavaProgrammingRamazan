package day08_IfStatement;

public class MaxNumber2 {
    public static void main(String[] args) {
        int n1 = 200,
                n2 = 200;

        if (n1 > n2){
            System.out.println(n1 + " is maximum number");
        } else if (n2 > n1) {
            System.out.println(n2 + " is maximum number");
        } else if (n1 == n2) {
            System.out.println("equal");
        }


    }
}
