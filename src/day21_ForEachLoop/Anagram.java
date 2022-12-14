package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        // write a program that can check if str1 & str2 are build out same characters

        char[] charsStr1 = str1.toCharArray();
        char[] charsStr2 = str2.toCharArray();

        System.out.println(Arrays.toString(charsStr1));
        System.out.println(Arrays.toString(charsStr2));

        Arrays.sort(charsStr1);
        Arrays.sort(charsStr2);
        System.out.println();

        System.out.println(Arrays.toString(charsStr1));
        System.out.println(Arrays.toString(charsStr2));

        boolean anagram = Arrays.equals(charsStr1, charsStr2);

        System.out.println("anagram = " + anagram);










    }
}
