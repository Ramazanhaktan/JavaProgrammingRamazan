package day19_LoopPractices;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; // bdf



        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j);
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {  // compares the character that outer loop picked, with each character of str
                char each = str.charAt(i);

                if (ch == each) {
                    counter++;
                }

            }

            if (counter == 1){ // it means this char is unique
                result += ch;
            }
        }

        System.out.println(result);














    }
}
