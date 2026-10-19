
//// OCP, Eliminé el switch y ahora utilizo la interfaz Iva
public class IvaCalculator {

    public double calculateIVA(Product product, Iva tax) {
        return tax.calculateIva(product.getPrice());
    }
}
