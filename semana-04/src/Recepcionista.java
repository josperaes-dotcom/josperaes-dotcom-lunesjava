// Usa 'extends' para heredar de la clase Empleado
public class Recepcionista extends Empleado {
    // Atributo ÚNICO del Recepcionista
    private int checkInsRealizados;

    /**
     * Constructor del Recepcionista (Clase Hija).
     */
    public Recepcionista(String identificacion, String nombreCompleto, double salarioBase, String fechaContratacion, int checkInsRealizados) {
        // Llama al constructor del padre (Empleado) con la palabra clave 'super'
        super(identificacion, nombreCompleto, salarioBase, "Recepcionista", fechaContratacion);
        this.checkInsRealizados = checkInsRealizados;
    }

    // =============================================================
    // Sobrescritura de Método (@Override)
    // =============================================================

    /**
     * Sobrescribe el método 'realizarTrabajo()' para hacerlo específico.
     */
    @Override
    public void realizarTrabajo() {
        System.out.println("🔔 " + nombreCompleto + " está gestionando reservas y haciendo Check-in/out en la recepción.");
    }

    // Método ÚNICO del Recepcionista
    public void registrarCheckIn() {
        this.checkInsRealizados++;
        System.out.println("✅ Recepcionista " + nombreCompleto + " acaba de registrar un nuevo Check-in.");
    }
}