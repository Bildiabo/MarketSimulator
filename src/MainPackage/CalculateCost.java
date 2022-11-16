package MainPackage;

import java.util.Arrays;

public class CalculateCost {

    public void cost(Stock stock, Cart cart) {
        int price;
        int totalPrice = 0;

        for (int i = 0; i < cart.userCartItems.size(); i++) {
           int index =  Arrays.asList(stock.itemsName).indexOf(cart.userCartItems.get(i));
           price =stock.itemsPrice[index];
           totalPrice+=price* cart.userCartQuantity.get(i);
        }
        System.out.println("Your total cost is "+totalPrice);
    }
}


// pepsi chipsi manga
// manga pepsi manga manga manga
// index of