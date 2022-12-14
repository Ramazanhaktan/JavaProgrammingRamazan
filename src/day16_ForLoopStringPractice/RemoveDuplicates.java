package day16_ForLoopStringPractice;

import java.nio.channels.AsynchronousByteChannel;

public class RemoveDuplicates {

    public static void main(String[] args) {

        /*
        input: AABBBCCBC
                output:ABC
                        */

        String str = "aabbccccAabc..";

        String result = ""; //

        for (int i = 0; i < str.length(); i++) { // i: represent the all index numbers of str

            String ch = "" + str.charAt(i); // represent each character of str

            if (!result.contains(ch)) { // if the character is not contained in the result
                result += ch; // the character will be added to the result
            }

        }

        System.out.println(result);

    }
}