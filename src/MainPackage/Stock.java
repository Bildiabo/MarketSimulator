package MainPackage;

import java.util.Arrays;

public class Stock {
    int unitsToBeSold ;
    String[] itemsName;
    int[] itemsPrice;
    int[] itemsQuantity;

    public void creatingStock() {
        System.out.println("lets create your store stock ");
        System.out.println("how many units are you selling ?");
        unitsToBeSold = Reader.readIntInput();
        itemsName =new String[unitsToBeSold];
        itemsPrice = new int[unitsToBeSold];
        itemsQuantity = new int[unitsToBeSold];
        for (int i = 0; i < unitsToBeSold; i++) {
            System.out.println("what is the name of the item you are selling ?");
            itemsName[i] = Reader.readStringInput();
            System.out.println("how manny units of " + itemsName[i] + " are you selling ?");
            itemsQuantity[i] = Reader.readIntInput();
            System.out.println("how much for each " + itemsName[i]);
            itemsPrice[i] = Reader.readIntInput();
        }
        System.out.println("*************** Your menu contains ***************");
        String[]screen={"Item Number","Item Name","item Price","Item Quantity"};
        System.out.println(Arrays.toString(screen));
        for (int j = 0; j < unitsToBeSold; j++) {
            System.out.println(j+ " " +itemsName[j] + "             " + itemsPrice[j] + "             " + itemsQuantity[j]);
        }
    }
}
