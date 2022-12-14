package day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        // swap the last and first elements of an arraylist

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(list, 0, list.size()-1);

        System.out.println("list = " + list);

        //int[] arr  = {1,2,3,4,5,6,7,8};

        //System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------------------");

        // move all the zeros to last indexes

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = list2.size();

        list2.removeAll(Arrays.asList(0));

        System.out.println(list2);

        int newSize = list2.size();

        int totalNumberOf0 = size - newSize;

        System.out.println("totalNumberOf0 = " + totalNumberOf0);

        for (int i = 0; i < totalNumberOf0; i++) {
            list2.add(0);
        }

        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list3) {
            if (each!=0)
                result.add(each);
        }

        for (Integer each : list3) {
            if (each==0)
                result.add(each);
        }
        System.out.println(result);

        System.out.println("----------------------------------------------");

        String str = "ABCD123$½#{456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf( p-> !(Character.isLetter(p) ) );

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);

        digits.removeIf( p -> !(Character.isDigit(p) ) );

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>(chars);

      //  specialChar.removeIf(p-> Character.isLetterOrDigit(p));

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);

        System.out.println("specialChar = " + specialChar);
























    }
}
