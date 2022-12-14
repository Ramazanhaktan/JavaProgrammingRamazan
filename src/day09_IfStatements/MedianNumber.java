package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 1,
                b = 10,
                c = 3;

        boolean a1 = (a>b && a<c) || (a>c && a<b);
        boolean b1 = (b>a && b<c) || (b>c && b<a);
        boolean c1 = (c>b && c<a) || (c>a && c<b);

        if (a1) {
            System.out.println(a + " is median Number");
        }

        if (b1) {
            System.out.println(b + " is median Number");
        }

        if (c1) {
            System.out.println(c + " is median Number");
        }












    }
}
