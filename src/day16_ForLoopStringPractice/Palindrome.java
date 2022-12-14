package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

    /*
    Anna ==> annA
    Level ==> leveL
    Racecar ==> racecaR
    Dad
    Mom
    .....
     */

        String word = "Level";

        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = reversed.equalsIgnoreCase(word);
        System.out.println(isPalindrome);
        }








    }


