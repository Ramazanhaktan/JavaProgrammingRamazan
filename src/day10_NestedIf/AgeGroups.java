package day10_NestedIf;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 0;
        String result = "";

        if (age >= 0 && age <= 150){

            if (age < 21){
                result = "teenager";
            } else if (age < 55) {
                result = "adult";
            }else {
                result = "senior";
            }


        }else {
            result = "invalid";
        }

        System.out.println(result);



    }
}
