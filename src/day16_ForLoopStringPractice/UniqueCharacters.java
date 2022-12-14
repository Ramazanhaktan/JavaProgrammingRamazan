package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        /*
        input: AABCCD
        output: BD
         */

        String str = "aaabcccdddef";

        String result = "";



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //ch: each characters of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }

        System.out.println("result = " + result);





    }
}
