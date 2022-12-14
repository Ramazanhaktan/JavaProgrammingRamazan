package day20_Arrays;

public class UniqueElement {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "Python", "Python", "C#"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j]; // "Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) { // finds the frequency of element
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
               if (frequency == 1)
                System.out.println(element);
        }












    }
}
