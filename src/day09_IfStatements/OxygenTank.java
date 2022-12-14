package day09_IfStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 40;

        String result = "";

        if (number >= 0 && number <= 100){

            if (number >= 90){
            result = "Your tank is full";
            } else if (number >= 80) {
                result = "Still okay";
            } else if (number >= 70) {
                result = "Don't go too far";
            }else if (number >= 60) {
                result = "Start to head back";
            }else if (number >= 50){
                result = "Be careful now you at at 50%";
            }


        }else{
            result = "invalid";
        }

        System.out.println("result = " + result);







    }
}
