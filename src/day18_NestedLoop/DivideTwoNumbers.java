package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {
       // write a program that can divide two positive numbers without using / and * and %

        /*
        a=20
        b=6

        a-=b;  // a=14
        a-=b;  // a=8
        a-=b;  // a=2
         */

        int a = 100;
        int b = 6;
        int counter = 0;

        while (a>=b){
         a -= b;
         counter++;
        }
        System.out.println( counter + " with a reminder of " + a);















    }
}
