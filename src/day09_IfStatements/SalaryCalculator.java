package day09_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 100000;
        double salaryAfterTax = 888;
        boolean married = true;

        if (salary >= 130000&& married){
            salaryAfterTax =  (salary - (salary*0.30));
        } else if (salary >= 130000&& !married) {
            salaryAfterTax = (salary - (salary*0.35));
        } else if (salary >= 100000 & salary < 130000 & married) {
            salaryAfterTax = (salary - (salary*0.25));
        } else if (salary >= 100000 & salary < 130000 & !married) {
            salaryAfterTax = (salary - (salary*0.30));
        } else if (salary >= 80000 & salary < 100000 & married) {
            salaryAfterTax = (salary - (salary*0.20));
        } else if (salary >= 80000 & salary < 100000 & !married) {
            salaryAfterTax = (salary - (salary*0.25));
        } else if (salary < 80000 & married) {
            salaryAfterTax = (salary - (salary*0.15));
        } else if (salary >= 80000 & !married) {
            salaryAfterTax = (salary - (salary*0.20));
        }

        System.out.println("salaryAfterTax = " + salaryAfterTax);









    }
}
