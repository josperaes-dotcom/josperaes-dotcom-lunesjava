import implementaciones.*;
import interfaces.IReportable;

public class Main {

    /**
     * Método Polimórfico: Acepta CUALQUIER objeto que implemente IReportable.
     * Demuestra el desacoplamiento.
     */
    public static void imprimirReporte(IReportable objeto) {
        System.out.println("--- INICIO REPORTE POLIMÓRFICO ---");
        System.out.println(objeto.generarReporteDetallado());
        System.out.println("--- FIN REPORTE POLIMÓRFICO ---\n");
    }

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("=== SEMANA 06: DEMOSTRACIÓN DE ABSTRACCIÓN ===");
        System.out.println("====================================================\n");

        // Objetos de diferentes jerarquías:
        Recepcionista r1 = new Recepcionista("E101", "María Solano", 2500000.00, "2023-01-15", 50);
        ServicioAdicional spa = new ServicioAdicional("Masaje VIP", 150000.00, "Terapia de relajación");
        Reserva res1 = new Reserva();


        // --- 1. PRUEBA DE POLIMORFISMO CON INTERFACES (IReportable) ---
        System.out.println("--- 1. Reporte Universal (Personal y Servicios) ---");

        imprimirReporte(r1);     // Acepta un Empleado (por herencia de Empleado -> IReportable)
        imprimirReporte(spa);    // Acepta un Servicio (por implementación directa de IReportable)
        imprimirReporte(res1);   // Acepta una Reserva (por implementación directa de IReportable)


        // --- 2. PRUEBA DE CLASE ABSTRACTA y ICancelable ---
        System.out.println("--- 2. Cálculo Abstracto y Cancelación ---");

        // Ejecución de método concreto heredado
        spa.mostrarDetallesBase();

        // Ejecución de método abstracto implementado
        System.out.printf("Costo final del servicio: $%,.2f%n", spa.calcularCostoFinal());

        // Ejecución de interface ICancelable
        res1.cancelar();
        System.out.printf("Penalización calculada: $%,.2f%n", res1.calcularPenalizacion());

        imprimirReporte(res1); // Volvemos a imprimir la Reserva para ver el cambio de estado.

        System.out.println("\n================ DEMOSTRACIÓN EXITOSA ================");
    }
}