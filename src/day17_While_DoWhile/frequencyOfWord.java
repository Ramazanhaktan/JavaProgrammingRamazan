package day17_While_DoWhile;

public class frequencyOfWord {

    public static void main(String[] args) {

        /*
        sentence = "JavaJavaJava"
        output: 3
         */

    String sentence = "JavaJavaJava";
    int frequency = 0;


        for (int i = 0; i <= sentence.length()-4; i++) {
            String eachSubstring = sentence.substring(i, i+4);

            if (eachSubstring.equals("Java")){
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);

    }
}
