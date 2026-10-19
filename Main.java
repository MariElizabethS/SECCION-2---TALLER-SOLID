public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product book = new PhysicalProduct("Book", 20, 0.5);
        Product shirt = new PhysicalProduct("Shirt", 30, 0.3);
        Product laptop = new PhysicalProduct("Laptop", 800, 2.0);
        Product ebook = new DigitalProduct("Ebook", 15);

        // Add products to the cart
        cart.addProduct(book);
        cart.addProduct(shirt);
        cart.addProduct(laptop);
        cart.addProduct(ebook);

        // Calculate subtotal
        PriceCalculator calculator = new PriceCalculator();

        double subtotal = calculator.calculateTotalPrice(cart);

        System.out.println("Subtotal: $" + subtotal);

        // Calculate taxes
        IvaCalculator ivaCalculator = new IvaCalculator();

        double bookTax = ivaCalculator.calculateIVA(book, new BookIva());
        double shirtTax = ivaCalculator.calculateIVA(shirt, new ClothesIva());
        double laptopTax = ivaCalculator.calculateIVA(laptop, new TechnologyIva());
        double ebookTax = ivaCalculator.calculateIVA(ebook, new BookIva());

        double totalTax = bookTax + shirtTax + laptopTax + ebookTax;

        System.out.println("IVA: $" + totalTax);
        System.out.println("Total with IVA: $" + (subtotal + totalTax));

        // Send receipt
        ReceiptSender sender = new EmailReceipt();
        sender.sendReceipt();
    }
}
