// Dentro de la clase Empleado.java (Semana 04)

// ... (atributos y constructor de la Semana 04)

// =============================================================
// MÉTODO BASE PARA SOBRESCRITURA
// =============================================================

/**
 * Método base para generar un reporte de datos básicos (Será sobrescrito).
 */
public String generarReportePersonal() {
    return String.format("--- REPORTE EMPLEADO ---\nNombre: %s | Cargo: %s | ID: %s | Salario Base: $%,.2f",
            nombreCompleto, cargo, identificacion, salarioBase);
}

// ... (resto de métodos)
