package interfaces;

/**
 * Define el contrato para objetos que son susceptibles de cancelación (Reservas).
 */
public interface ICancelable {

    /**
     * Ejecuta la lógica de cancelación y aplica las penalidades.
     */
    void cancelar();

    /**
     * Calcula la penalización económica por la cancelación.
     */
    double calcularPenalizacion();
}