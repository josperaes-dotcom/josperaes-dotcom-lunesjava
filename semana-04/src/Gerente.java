// Usa 'extends' para heredar de la clase Empleado
public class Gerente extends Empleado {
    // Atributo ÚNICO del Gerente
    private int numeroSubordinados;
    private String claveAcceso;

    /**
     * Constructor del Gerente (Clase Hija).
     */
    public Gerente(String identificacion, String nombreCompleto, double salarioBase, String fechaContratacion, int numeroSubordinados, String claveAcceso) {
        // Llama al constructor del padre (Empleado)
        super(identificacion, nombreCompleto, salarioBase, "Gerente General", fechaContratacion);
        this.numeroSubordinados = numeroSubordinados;
        this.claveAcceso = claveAcceso;
    }

    // =============================================================
    // Sobrescritura de Método (@Override)
    // =============================================================

    /**
     * Sobrescrive el método 'realizarTrabajo()' para hacerlo específico.
     */
    @Override
    public void realizarTrabajo() {
        // El Gerente delega, por lo que llama al método base (super) y agrega su tarea.
        super.realizarTrabajo();
        System.out.println("📈 Gerente " + nombreCompleto + " está revisando informes financieros y la ocupación.");
    }

    // Método ÚNICO del Gerente
    public void autorizarDescuento(double cantidad) {
        System.out.println("🔑 Gerente " + nombreCompleto + " autorizó un descuento de $" + cantidad + ".");
    }
}
