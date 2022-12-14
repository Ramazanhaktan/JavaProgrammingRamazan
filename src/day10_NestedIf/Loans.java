package day10_NestedIf;

public class Loans {

    public static void main(String[] args) {

        int salary = 70000;
        int creditScore = 600;

        String result = (salary >= 60000 && creditScore >= 650)? "Loan approved" : "Loan denied";

        System.out.println(result);



    }
}
