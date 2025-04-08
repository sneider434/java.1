package unidad_1;
public class DescuentoRopa {
    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Aplicar descuento del 15%
        double descuento = 0.15;
        double precioCamisetaConDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonConDescuento = precioPantalon * (1 - descuento);

        // Precio total de ambas prendas después del descuento
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento;
        System.out.println("Precio total después del 15% de descueno: $" + precioTotal);

        // Descuento adicional del 5% en la segunda camiseta
        double descuentoAdicional = 0.05;
        double precioSegundaCamiseta = precioCamisetaConDescuento * (1 - descuentoAdicional);

        // Precio total con segunda camiseta
        double precioTotalConSegundaCamiseta = precioTotal + precioSegundaCamiseta;
        System.out.println("Precio total con segunda camiseta y descuento adicional: $" + precioTotalConSegundaCamiseta);
    }
}
