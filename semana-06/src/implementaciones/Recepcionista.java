package implementaciones;

// No necesita implementar IReportable porque lo hereda de Empleado
public class Recepcionista extends Empleado {

    private int checkInsRealizados;

    public Recepcionista(String identificacion, String nombreCompleto, double salarioBase, String fechaContratacion, int checkInsRealizados) {
        super(identificacion, nombreCompleto, salarioBase, "Recepcionista", fechaContratacion);
        this.checkInsRealizados = checkInsRealizados;
    }

    // Sobrescritura de IReportable
    @Override
    public String generarReporteDetallado() {
        String reporteBase = super.generarReporteDetallado();
        return reporteBase + String.format("\nFunción: Recepción | Check-Ins en el Mes: %d", checkInsRealizados);
    }

    @Override
    public void realizarTrabajo() {
        System.out.println(getNombreCompleto() + " está realizando check-in a un nuevo huésped.");
    }
}