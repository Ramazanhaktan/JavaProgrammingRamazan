package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        String email1 = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        //System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")));
        System.out.println("email1 = " + email1);

        System.out.println("-----------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        //
        String s1 = str1.substring(0, str1.indexOf(","));
        System.out.println("s1 = " + s1);
        String s2 = str1.substring(str1.indexOf(" J") +1, str1.lastIndexOf(","));
        System.out.println("s2 = " + s2);

        String s3 = str1.substring(str1.indexOf("I"));
        System.out.println("s3 = " + s3);


    }
}
