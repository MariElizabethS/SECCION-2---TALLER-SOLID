

/*Como sabemos, no todos los productos tienen peso
* como los que son digitales, entonces se lo quitamos de la clase Product
* ARREGLADO LSP
*/
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}