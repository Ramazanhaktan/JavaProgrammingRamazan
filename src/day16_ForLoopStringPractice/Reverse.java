package day16_ForLoopStringPractice;

import com.sun.tools.javac.Main;

public class Reverse {

    public static void main(String[] args) {

        //write a program that can reverse a String

        String str = "Ramazan Haktan Helvacı";
        // index:     0123456.....

        String result = ""; // contain the reversed version of  str
        // noop
/*
        result += str.charAt(11); // n
        result += str.charAt(10); // o
        result += str.charAt(9); // o
        result += str.charAt(8); // p
        result += str.charAt(7); // S
        result += str.charAt(6); // ' '
        result += str.charAt(5); // n
        result += str.charAt(4); // e
        result += str.charAt(3); // d
        result += str.charAt(2); // o
        result += str.charAt(1); // o
        result += str.charAt(0); // W
*/

        for (int i = str.length()-1; i >= 0; i--) { // i: index number of str
            result += str.charAt(i); // adding each character to result
        }








        System.out.println(result);

    }
}
