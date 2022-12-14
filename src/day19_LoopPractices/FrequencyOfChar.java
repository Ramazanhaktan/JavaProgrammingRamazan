package day19_LoopPractices;

public class FrequencyOfChar {

    public static void main(String[] args) {

        // str = "aabbbccccd";
        // output: a2b3c4d1

    String str = "aabcccd";
    String result = ""; // a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // 'a'
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {  // to find the frequence
                char each = str.charAt(i); // each character of str

                if (ch == each){
                    counter++;
                }
            }

            if (result.contains("" + ch)){
                continue;
            }

            result += ch;
            result += counter;

        }

        System.out.println(result);














    }
}
