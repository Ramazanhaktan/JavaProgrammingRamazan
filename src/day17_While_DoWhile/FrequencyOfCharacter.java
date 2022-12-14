package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        /*
        input: AAABBBC
        ch: 'A'
        output:  3
         */

        String str = "AAABBBC";
        char ch = 'C';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {  // i: index of str
            char eachChar = str.charAt(i); // eachChar: each character of str
            if (ch == eachChar){
                frequency += 1;
            }

        }

        System.out.println("frequency = " + frequency);








    }
}
