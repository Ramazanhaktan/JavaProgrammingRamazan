package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Wooden", "Spoon");
        domain("rmzn@gmail.com");
        System.out.println("-----------------------------------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "elminur@cydeo.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("-------------------------------------------------");
        nameOfMonth(3);
        System.out.println("----------------------------------------------------");

        nameOfDay(4);
        }


    //Create a method that can display the initials of the person == initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName){
        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0));

    }

    //Create a method that can display the domain of the email == domain (String mail)

    public  static  void domain(String mail){
        System.out.println("domain is:" + mail.substring(mail.indexOf("@")+1, mail.lastIndexOf(".") ) );
    }

//Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        if (number==1)
            System.out.println("January");
        if (number==2)
            System.out.println("February");
        if (number==3)
            System.out.println("March");
        if (number==4)
            System.out.println("April");
        if (number==5)
            System.out.println("May");
        if (number==6)
            System.out.println("June");
    }

    //Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        switch (number){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tues");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thurs");
        }
    }

}
/*Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
*/