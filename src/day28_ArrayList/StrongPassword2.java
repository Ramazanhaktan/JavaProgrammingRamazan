package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cYdeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSpecialChar = 0;
        int countDigit = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (!Character.isLetterOrDigit(each)) {
                countSpecialChar++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            }

        }

        boolean isStrongPassword = countUpperCase>0 && countLowerCase>0 && countSpecialChar>0 && countDigit>0 && password.length() >= 8 && !password.contains(" ");

        System.out.println("isStrongPassword = " + isStrongPassword);



    }

}
