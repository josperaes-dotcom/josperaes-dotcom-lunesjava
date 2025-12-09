public class Empleado {
    // Usamos 'protected' para que las subclases (hijos) puedan acceder directamente.
    protected String identificacion;
    protected String nombreCompleto;
    protected double salarioBase;
    protected String cargo;
    protected String fechaContratacion;

    /**
     * Constructor del Empleado (Clase Padre).
     */
    public Empleado(String identificacion, String nombreCompleto, double salarioBase, String cargo, String fechaContratacion) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
    }

    // =============================================================
    // Método Común y Sobrescribible
    // =============================================================

    /**
     * Método base que será sobrescrito por cada tipo de empleado.
     */
    public void realizarTrabajo() {
        System.out.println(nombreCompleto + " (" + cargo + ") está realizando una tarea general en el hotel.");
    }

    // Método que no se sobrescribe
    public double calcularSalarioAnual() {
        return salarioBase * 12;
    }

    // Getter esencial
    public String getNombreCompleto() {
        return nombreCompleto;
    }
}

