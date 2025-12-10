package implementaciones;

public class Gerente extends Empleado {

    private int numeroSubordinados;
    private String claveAcceso;

    public Gerente(String identificacion, String nombreCompleto, double salarioBase, String fechaContratacion, int numeroSubordinados, String claveAcceso) {
        super(identificacion, nombreCompleto, salarioBase, "Gerente", fechaContratacion);
        this.numeroSubordinados = numeroSubordinados;
        this.claveAcceso = claveAcceso;
    }

    // Sobrescritura de IReportable
    @Override
    public String generarReporteDetallado() {
        String reporteBase = super.generarReporteDetallado();
        return reporteBase + String.format("\nFunción: Liderazgo | Subordinados a Cargo: %d", numeroSubordinados);
    }

    @Override
    public void realizarTrabajo() {
        System.out.println(getNombreCompleto() + " está analizando los reportes financieros del mes.");
    }
}