package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B'};
        Arrays.sort(charArray);

        System.out.println("-------------------------------------------------");

        sumOfNumbers(2,3,4,5);

        System.out.println("-----------------------------------------");

        int sum1 = sumOfNumbers(10,20);

        int sum2 = sumOfNumbers(10,20,30);

        int sum3 = sumOfNumbers(10,20,30,40);

        double sum4= sumOfNumbers(10.5,14.7);

        double sum5 = sumOfNumbers(3.7,6.8,9.4);

        double sum6 = sumOfNumbers(1.5,4.6,3.4,5.5);

    }

    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }

}
