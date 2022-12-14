package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '6';

if (ch >= '0' && ch <= '9') {
    System.out.println("Digit");
} else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
    System.out.println("Alphabetic");
}else {
    System.out.println("special character");
}








    }
}
