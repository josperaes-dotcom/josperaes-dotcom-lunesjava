public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("=== SEMANA 05: DEMOSTRACIÓN DE POLIMORFISMO ===");
        System.out.println("====================================================\n");

        // Objetos de las Semanas 03 y 04
        Recepcionista r1 = new Recepcionista("E101", "María Solano", 2500000.00, "2023-01-15", 50);
        Gerente g1 = new Gerente("E001", "Javier Prada", 7000000.00, "2020-05-01", 15, "clave123");
        Habitacion habA = new Habitacion("301", "SUITE", 500000.00, 4);


        // --- 1. PRUEBA DE SOBRECARGA (Polimorfismo Estático) ---
        System.out.println("--- 1. Cálculo de Precios con Sobrecarga (Habitacion) ---");

        // Uso 1: Base (3 noches)
        double costoBase = habA.calcularPrecioTotal(3);
        System.out.println("Costo 3 noches (Base): $" + String.format("%,.2f", costoBase));

        // Uso 2: Descuento manual (3 noches, 20% desc.)
        double costoDesc = habA.calcularPrecioTotal(3, 0.20);
        System.out.println("Costo 3 noches (20% desc): $" + String.format("%,.2f", costoDesc));

        // Uso 3: Servicio extra (3 noches + $100k + IVA)
        double costoFinal = habA.calcularPrecioTotal(3, 100000.00);
        System.out.println("Costo Final (c/ Servicio): $" + String.format("%,.2f", costoFinal));


        // --- 2. PRUEBA DE POLIMORFISMO DINÁMICO (Sobrescritura y ArrayList) ---
        System.out.println("\n--- 2. Reporte General con Polimorfismo Dinámico ---");

        HotelDescansoReal gestorHotel = new HotelDescansoReal("Sistema de RH");

        // Se agregan los hijos a la lista del padre
        gestorHotel.agregarPersonal(r1);
        gestorHotel.agregarPersonal(g1);

        // El método gestor llama al método sobrescrito específico de cada uno.
        gestorHotel.generarReportesDePersonal();

        System.out.println("\n================ DEMOSTRACIÓN EXITOSA ================");
    }
}
