package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

      //  Car car1 = new Car("Cydeo", "EU10", "blue", 2023, 100000);
        // we can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("A6", "white", 2020, 40000);

        Tesla tesla = new Tesla("Model Y", "grey", 2021, 50000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(45000);
        tesla.setPrice(55000);

        System.out.println("---------------------------------------------------");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);




    }

}
