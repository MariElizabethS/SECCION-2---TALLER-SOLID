public class ClothesIva implements Iva {

    @Override
    public double calculateIva(double price) {
        return price * 0.12;
    }
}