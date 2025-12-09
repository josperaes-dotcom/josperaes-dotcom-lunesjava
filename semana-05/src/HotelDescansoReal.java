import java.util.ArrayList;
// Se necesita importar Empleado para usar la lista polimórfica

public class HotelDescansoReal {
    private String nombre;
    // ... (ArrayList<Reserva> de la Semana 02)

    // Nuevo ArrayList Polimórfico: puede guardar cualquier objeto que sea un Empleado
    private ArrayList<Empleado> listaPersonal;

    public HotelDescansoReal(String nombre) {
        this.nombre = nombre;
        // ... (inicialización de listaReservas)
        this.listaPersonal = new ArrayList<>();
    }

    // ... (métodos de reserva de la Semana 02)

    // =============================================================
    // MÉTODOS POLIMÓRFICOS
    // =============================================================

    /**
     * Método Polimórfico: Acepta cualquier objeto de tipo Empleado o sus hijos.
     */
    public void agregarPersonal(Empleado empleado) {
        listaPersonal.add(empleado);
        System.out.println("✅ Personal agregado: " + empleado.getNombreCompleto() + ".");
    }

    /**
     * Método Polimórfico: Itera sobre el ArrayList Polimórfico.
     */
    public void generarReportesDePersonal() {
        System.out.println("\n--- GENERANDO REPORTES (POLIMORFISMO DINÁMICO) ---");

        if (listaPersonal.isEmpty()) {
            System.out.println("No hay personal registrado para reportes.");
            return;
        }

        for (Empleado empleado : listaPersonal) {
            // Llama al método sobrescrito: Java decide si usa la versión
            // del Recepcionista o la del Gerente en tiempo de ejecución.
            System.out.println(empleado.generarReportePersonal());
            System.out.println("-------------------------------------------------");
        }
    }
}