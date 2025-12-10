package implementaciones;

import abstractas.ServicioHotelAbstract;
import interfaces.IReportable;

public class ServicioAdicional extends ServicioHotelAbstract implements IReportable {

    private String descripcion;

    public ServicioAdicional(String nombre, double precioBase, String descripcion) {
        super(nombre, precioBase); // Llama al constructor de la clase abstracta
        this.descripcion = descripcion;
    }

    // CUMPLIMIENTO DEL CONTRATO ABSTRACTO
    @Override
    public double calcularCostoFinal() {
        double iva = precioBase * 0.19;
        return precioBase + iva;
    }

    // CUMPLIMIENTO DEL CONTRATO IReportable
    @Override
    public String generarReporteDetallado() {
        return String.format("Tipo: Servicio Adicional | Nombre: %s | Base: $%,.2f | Total: $%,.2f | Descripción: %s",
                nombre, precioBase, calcularCostoFinal(), descripcion);
    }
}
