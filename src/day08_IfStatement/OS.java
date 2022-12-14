package day08_IfStatement;

public class OS {

    public static void main(String[] args) {

        String OS = "Lenova";

        String result = (OS == "Mac")? "MacOS" :(OS == "Lenova")? "Windows" :(OS == "iphone")? "IOS" : "Android";

        System.out.println(result);
    }
}
