package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone12", "6.7 inches", 1000, "black");

        Samsung samsung1 = new Samsung("Galaxy S19", "6 inches", 900,  "grey");

        Nokia nokia1 = new Nokia("Brick", "2", "3 inches", 110, "grey");

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone1.call(911);
        iphone1.text(12345678);
        iphone1.faceTime("dasf@fsdfd.com");
        iphone1.faceTime(12346);

        System.out.println("-----------------------------------------");

        samsung1.call(911);
        samsung1.text(13245689);
        samsung1.freeze();

        nokia1.selfDefence();

        System.out.println("---------------------------------------------------");

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);


    }


}
