package MainPackage;

import java.util.ArrayList;

public class Cart {
    ArrayList<String> userCartItems;
    ArrayList<Integer> userCartQuantity;

    public void creatingCart(Stock stock) {
        String input = "";
        int itemSelection;
        int quantity;
        userCartItems = new ArrayList<>();
        userCartQuantity = new ArrayList<>();
        do {
            System.out.println("Select the number of item you need");
            itemSelection = Reader.readIntInput();
            if (stock.itemsQuantity[itemSelection] > 0) {
                System.out.println("how many units of " + stock.itemsName[itemSelection] + " you need");
                quantity = Reader.readIntInput();
                if (stock.itemsQuantity[itemSelection] - quantity >= 0) {
                    userCartQuantity.add(quantity);
                    userCartItems.add(stock.itemsName[itemSelection]);
                    stock.itemsQuantity[itemSelection] -= quantity;
                } else
                    System.out.println("the available quantity of " + stock.itemsName[itemSelection] +
                            " is " + stock.itemsQuantity[itemSelection]);
            } else System.out.println("sorry this item is out of stock");

            System.out.println("if you are done type done else press anything ");
            input = Reader.readStringInput().toLowerCase();

        } while (!input.equals("done"));
        System.out.println("you cart contains " + userCartItems + " quantity of" + userCartQuantity);


    }
}
