package abstractas;

public abstract class ServicioHotelAbstract {

    // Atributos base comunes
    protected String nombre;
    protected double precioBase;

    public ServicioHotelAbstract(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // MÉTODO ABSTRACTO: Obliga a definir cómo se calcula el precio final.
    public abstract double calcularCostoFinal();

    // MÉTODO CONCRETO: Comportamiento reusable.
    public void mostrarDetallesBase() {
        System.out.println("Base Servicio: " + nombre + " | Precio Base: $" + String.format("%,.2f", precioBase));
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
