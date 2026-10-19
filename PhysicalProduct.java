

//Aquí si se declara el método porque es un objeto 
// físico, a diferencia del digital

//// LSP, Dejé getWeight() solo para los productos físicos

public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
