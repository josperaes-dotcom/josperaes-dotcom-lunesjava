package implementaciones;

import interfaces.ICancelable;
import interfaces.IReportable;

// Implementa dos interfaces (Múltiple Implementación)
public class Reserva implements ICancelable, IReportable {

    private int codigoReserva = 101; // Valor de ejemplo
    private double penalizacionAplicada = 0;

    // Asumir que tiene un constructor y otros atributos de Semana 02...

    // CUMPLIMIENTO DEL CONTRATO ICancelable
    @Override
    public void cancelar() {
        if (penalizacionAplicada == 0) {
            this.penalizacionAplicada = calcularPenalizacion();
            System.out.printf("❌ Reserva %d cancelada. Penalización: $%,.2f%n", codigoReserva, penalizacionAplicada);
        }
    }

    @Override
    public double calcularPenalizacion() {
        return 150000.00; // Valor fijo de ejemplo para la demostración
    }

    // CUMPLIMIENTO DEL CONTRATO IReportable
    @Override
    public String generarReporteDetallado() {
        return String.format("Tipo: Reserva | Código: %d | Estado: %s | Penalización: $%,.2f",
                codigoReserva, (penalizacionAplicada > 0 ? "Cancelada" : "Activa"), penalizacionAplicada);
    }
}
