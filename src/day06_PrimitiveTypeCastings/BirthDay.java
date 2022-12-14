package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {
        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".");

        System.out.println("------------------------------------------------------------");

        String bookName = "The Rich Dad";

        System.out.println("My favorite book is \"" + bookName + "\"");

        //double>float>long>int>short>byte
        //smaller primitive can be directly assigned to larger
    }
}
