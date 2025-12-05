public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("=== PROGRAMA DE DEMOSTRACIÓN - HOTEL DESCANSO REAL ===");
        System.out.println("====================================================\n");

        // 1. CREACIÓN DE OBJETOS

        // Creamos 2 objetos de la clase Habitacion
        System.out.println("--- 1. CREACIÓN DE HABITACIONES ---");
        // Habitación Sencilla (180,000 COP)
        Habitacion hab1 = new Habitacion("101", "Sencilla", 180000.00, 1, 1);
        // Habitación Suite (450,000 COP)
        Habitacion hab2 = new Habitacion("307", "Suite", 450000.00, 4, 3);
        System.out.println("Creadas Habitación " + hab1.getNumero() + " y " + hab2.getNumero() + ".");

        // Creamos 2 objetos de la clase Huesped
        System.out.println("\n--- 2. CREACIÓN DE HUÉSPEDES ---");
        // Huésped A: Estancia corta (díasEstancia = 1 por defecto)
        Huesped huespedA = new Huesped("12345678", "Laura Castro", "3109876543");
        // Huésped B: Estancia larga (5 días)
        Huesped huespedB = new Huesped("98765432", "Carlos Pérez", "3201112233");
        huespedB.diasEstancia = 5;

        System.out.println("Creados Huésped " + huespedA.nombreCompleto + " y " + huespedB.nombreCompleto + ".");


        // 2. DEMOSTRACIÓN DE MÉTODOS DE HABITACION

        System.out.println("\n====================================================");
        System.out.println("--- 3. DEMOSTRACIÓN DE MÉTODOS DE HABITACION ---");

        // PRUEBAS EN HABITACION 101 (Sencilla)
        System.out.println("\n* Pruebas para Habitación " + hab1.getNumero() + " (Sencilla) *");
        hab1.mostrarInformacion(); // Llama a mostrarInformacion()

        // Probar setter: la ocupamos
        hab1.setEstaOcupada(true); // Llama a setEstaOcupada()

        // Probar el método que retorna valor: calcular precio con descuento (2 noches)
        double costo1 = hab1.calcularPrecioConDescuento(2); // Llama a calcularPrecioConDescuento()
        System.out.println("Costo total de 2 noches: $" + String.format("%,.2f", costo1));

        // Probar getter
        System.out.println("Getter del número: " + hab1.getNumero()); // Llama a getNumero()

        // PRUEBAS EN HABITACION 307 (Suite)
        System.out.println("\n* Pruebas para Habitación " + hab2.getNumero() + " (Suite) *");
        hab2.mostrarInformacion();

        // La marcamos como libre
        hab2.setEstaOcupada(false);

        // Probar el método que retorna valor (7 noches)
        double costo2 = hab2.calcularPrecioConDescuento(7);
        System.out.println("Costo total de 7 noches: $" + String.format("%,.2f", costo2));

        // Probar getter
        System.out.println("Getter del número: " + hab2.getNumero());


        // 3. DEMOSTRACIÓN DE MÉTODOS DE HUÉSPED

        System.out.println("\n====================================================");
        System.out.println("--- 4. DEMOSTRACIÓN DE MÉTODOS DE HUÉSPED ---");

        // HUÉSPED A: Laura Castro (Estancia corta)
        System.out.println("\n* Pruebas para Huésped Laura Castro *");
        huespedA.mostrarDatos(); // Llama a mostrarDatos()

        // Probar el método funcional void: Check-in
        huespedA.registrarLlegada(); // Llama a registrarLlegada()

        // Probar el método de cálculo/retorno: ¿Es estancia larga?
        System.out.println("¿Estancia larga?: " + huespedA.esEstanciaLarga()); // Llama a esEstanciaLarga()

        // Probar el getter
        System.out.println("Getter de ID: " + huespedA.getIdentificacion()); // Llama a getIdentificacion()


        // HUÉSPED B: Carlos Pérez (Estancia larga)
        System.out.println("\n* Pruebas para Huésped Carlos Pérez *");
        huespedB.mostrarDatos();

        // Probar el método funcional void: Check-in
        huespedB.registrarLlegada();

        // Probar el método de cálculo/retorno: ¿Es estancia larga?
        System.out.println("¿Estancia larga?: " + huespedB.esEstanciaLarga());

        // Probar el getter
        System.out.println("Getter de ID: " + huespedB.getIdentificacion());

        System.out.println("\n====================================================");
        System.out.println("--- DEMOSTRACIÓN FINALIZADA ---");
    }
}