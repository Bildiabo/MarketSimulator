package MainPackage;

public class main {
    public static void main(String[] args) {
        var stock = new Stock();
        stock.creatingStock();
        var cart = new Cart();
        cart.creatingCart(stock);
        var price = new CalculateCost();
        price.cost(stock,cart);

    }
}
