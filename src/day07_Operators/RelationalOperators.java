package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20>40;  // false

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; //true

        System.out.println("result2 = " + result2);
        
        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;

        System.out.println("result4 = " + result4);  //false

        // credit score of 720

        int score = 745;

        boolean isEligible = score >= 720;

        System.out.println("isEligible = " + isEligible);

        boolean result5 = 100 < 120;

        System.out.println("result5 = " + result5); //true

        boolean result6 = 200 < 180;

        System.out.println("result6 = " + result6); //false

        int score1 = 75;

        boolean hasFailed = score1 <= 59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);

        System.out.println("-------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y;
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true

        System.out.println("result10 = " + result10);

        System.out.println("----------------------------------");

        boolean result11 = 100 != 200; //true

        System.out.println("result11 = " + result11);























    }
}
