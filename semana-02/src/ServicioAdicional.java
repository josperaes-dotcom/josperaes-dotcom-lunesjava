public class ServicioAdicional {
    // ATRIBUTOS (Mínimo 3)
    private String nombre; // Spa, Gimnasio, SalaConferencia, Cena
    private double costoBase; // Precio del servicio
    private boolean requiereReserva; // ¿Se necesita agendar antes?
    private String ubicacion; // Dónde se presta (ej: Piso 5, Lobby)

    /**
     * Constructor
     */
    public ServicioAdicional(String nombre, double costoBase, boolean requiereReserva, String ubicacion) {
        this.nombre = nombre;
        this.costoBase = costoBase;
        this.requiereReserva = requiereReserva;
        this.ubicacion = ubicacion;
    }

    // =============================================================
    // MÉTODO DE NEGOCIO
    // =============================================================

    /**
     * Calcula el costo total del servicio aplicando el impuesto (ej: 19% IVA).
     * @return El costo final con impuesto.
     */
    public double calcularCostoConImpuesto() {
        // Se aplica un 19% de impuesto (IVA)
        double impuesto = costoBase * 0.19;
        return costoBase + impuesto;
    }

    // =============================================================
    // GETTERS y SETTERS
    // =============================================================

    public String getNombre() {
        return nombre;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
        System.out.println("Costo de " + nombre + " actualizado a $" + costoBase);
    }

    public double getCostoBase() {
        return costoBase;
    }
}