
//// SRP: Separé el cálculo del precio total de ShoppingCart.

public class PriceCalculator {

    public double calculateTotalPrice(ShoppingCart cart) {
        double total = 0;

        for (Product product : cart.getProducts()) {
            total += product.getPrice();
        }

        return total;
    }
}