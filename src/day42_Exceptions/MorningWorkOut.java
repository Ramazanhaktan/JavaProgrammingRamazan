package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        // do 30 push-ups and try pausing 1.5 seconds in each

        System.out.println("-----------Push up started---------------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.println("Push up " + i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        System.out.println("-----------Push ups completed---------------------");

        System.out.println("---------------Pull up started------------------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.println("Pull up " + i);

            sleep(0.3);

        }

        System.out.println("-----------Pull ups completed---------------------");


    }

    public static void sleep(double seconds){

        try {
            Thread.sleep( (long) (seconds * 1000) ) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
