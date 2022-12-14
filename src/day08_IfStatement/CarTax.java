package day08_IfStatement;

public class CarTax {

    public static void main(String[] args) {

        int carPrice = 30000;

        double taxRate = 0.5;

        if (carPrice >= 20000 && carPrice < 40000){
            taxRate = 0.2;
        } else if (carPrice >= 40000 && carPrice < 60000) {
            taxRate = 0.3;
        } else if (carPrice >= 60000 && carPrice < 80000) {
            taxRate = 0.4;
        }

        System.out.println(taxRate);
    }
}
