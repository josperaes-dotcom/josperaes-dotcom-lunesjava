package interfaces;

/**
 * Define el contrato para cualquier elemento en el hotel que deba generar
 * un informe detallado (cumple el Principio de Segregación de Interfaces).
 */
public interface IReportable {

    /**
     * Retorna una cadena con el resumen de datos del objeto para un informe.
     */
    String generarReporteDetallado();
}