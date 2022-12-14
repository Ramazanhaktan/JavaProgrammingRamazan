package day11_Switch_Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType = "EU";
        String result = "";
        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU"){
            switch (batchType){
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7- 10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
            }


        }else {
            result = "Invalid Batch";
        }
        System.out.println(result);


    }
}
