package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {

    public static void main(String[] args) {

        String str = "Cydeo12345School! )@#$%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoWoodenSpoon
        String specialChar = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                if (ch != ' ') {
                    specialChar += ch;
                }

            }

            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);
            System.out.println("specialChar = " + specialChar);


        }
    }
}
