public class Habitacion {
    // ... (atributos private y constructores de la Semana 03)

    // =============================================================
    // MÉTODOS DE NEGOCIO CON SOBRECARGA (Mismo nombre, diferente uso)
    // =============================================================

    /**
     * 1. Forma Base: Calcula el precio total con el descuento estándar (10%).
     */
    public double calcularPrecioTotal(int noches) {
        System.out.println("-> Usando cálculo base (10% desc.)");
        // El precioBase es el atributo encapsulado (private)
        return (this.precioBase * noches) * 0.90;
    }

    /**
     * 2. Sobrecarga: Calcula el precio aplicando un descuento personalizado.
     */
    public double calcularPrecioTotal(int noches, double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 1) {
            System.out.println("⚠️ Descuento inválido. Usando 10% por defecto.");
            return calcularPrecioTotal(noches); // Llama al método base si hay error
        }
        System.out.println("-> Usando cálculo con descuento manual.");
        double costoSinDescuento = this.precioBase * noches;
        return costoSinDescuento * (1 - porcentajeDescuento);
    }

    /**
     * 3. Sobrecarga: Calcula el precio sumando un servicio adicional con IVA (19%).
     */
    public double calcularPrecioTotal(int noches, double costoServicioExtra) {
        // Llama al método base (Forma 1) para obtener el costo del hospedaje
        double costoHospedaje = calcularPrecioTotal(noches);
        double impuestoServicio = costoServicioExtra * 0.19;
        System.out.println("-> Usando cálculo con servicio extra ($" + costoServicioExtra + " + IVA).");
        return costoHospedaje + costoServicioExtra + impuestoServicio;
    }

    // ... (resto de getters, setters y otros métodos)
}