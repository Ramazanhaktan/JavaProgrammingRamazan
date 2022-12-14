package day11_Switch_Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {
/*
        String result;
                String size = "grande";

        if (size == "tall" || size == "grande" || size == "venti"){
            if (size == "tall"){
                result = "price is $3.69\n" +
                        "90 calories";
            } else if (size == "grande") {
                result =  "price is $3.99;\n" +
                        "120 calories";
            }else {
                result = "price is $4.29\n" +
                        "150 calories";
            }


        }else {
            result = "Invalid size";
        }

        System.out.println(result);
*/

        String result;
        String size = "venti";

        if (size == "tall" || size == "grande" || size == "venti"){
            switch (size) {
                case "tall":
                    result = "price is $3.69\n" +
                            "90 calories";
                    break;
                case "grande":
                    result = "price is $3.99;\n" +
                            "120 calories";
                    break;
                default:
                    result = "price is $4.29\n" +
                            "150 calories";
                    break;

            }

        }else {
            result = "Invalid size";
        }

        System.out.println(result);
    }
}
