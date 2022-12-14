package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
/*
        String name = "Jimmy Joe";
        String buildingNumber = "7925";
        String streetName = "Jones Branch Dr";
        String city =  "McLean";
        String state = "VA";
        String zipCode = "20125";
*/

        String name = "Jimmy Joe",
         buildingNumber = "7925",
         streetName = "Jones Branch Dr",
         city =  "McLean",
         state = "VA",
         zipCode = "20125";

       // System.out.println(name + "\n" + buildingNumber + " " + streetName
       //         + "\n" + city + ", " + state + " " + zipCode );

        String shippingAddress = name + "\n" + buildingNumber + " " + streetName
                + "\n" + city + ", " + state + " " + zipCode;

        System.out.println("shippingAddress = " + "\n" + shippingAddress);




        /*
        Jimmy Joe
        7925 Jones Branch Dr
        McLean, VA 20125
         */
    }
}
