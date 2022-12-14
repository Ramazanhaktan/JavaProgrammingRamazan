package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //             01234567...




        String brand = word.substring(0, 4+1);

        System.out.println("brand = " + brand);

        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);

        System.out.println("--------------------------------------------");
        String word2 = "Python C# Ruby";

        //String s1 = word2.substring(0,4); //Java
        String s1 = word2.substring(0, word2.indexOf(" "));
        //String s2 = word2.substring(5,16); //Programming
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ")+1); //Language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("---------------------------------");

        String email = "Cydeo.School@gmail.com";

        String email1 = email.substring(email.indexOf("@")+1, email.indexOf(".c"));

        System.out.println("email1 = " + email1);






    }
}
