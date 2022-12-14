package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves"};
        double[] prices = {99.99,    150.0,     9.99};
        int[] itemIDs = {  12345,    12346,    12347};

        /*
        itemName - itemID - price
         */

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item + " - " + id + " - $" + price);
        }










    }
}
