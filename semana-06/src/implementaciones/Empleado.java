package implementaciones;

import interfaces.IReportable;

public class Empleado implements IReportable { // Implementa IReportable

    protected String identificacion;
    protected String nombreCompleto;
    protected double salarioBase;
    protected String cargo;
    protected String fechaContratacion;

    public Empleado(String identificacion, String nombreCompleto, double salarioBase, String cargo, String fechaContratacion) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
    }

    // MÉTODO IReportable (renombra el anterior generarReportePersonal)
    @Override
    public String generarReporteDetallado() {
        return String.format("--- REPORTE EMPLEADO BASE ---\nNombre: %s | Cargo: %s | ID: %s | Salario Base: $%,.2f",
                nombreCompleto, cargo, identificacion, salarioBase);
    }

    // Método que será sobrescrito en las clases hijas
    public void realizarTrabajo() {
        System.out.println(nombreCompleto + " (" + cargo + ") está realizando una tarea general.");
    }

    // Getters y Setters...
    public String getNombreCompleto() { return nombreCompleto; }
    // ...
}