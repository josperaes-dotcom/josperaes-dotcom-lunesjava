public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("=== SEMANA 03: PRUEBA DE ENCAPSULACIÓN Y SOBRECARGA ===");
        System.out.println("====================================================\n");

        // --- 1. PRUEBA DE SOBRECARGA DE CONSTRUCTORES (Habitacion y Huesped) ---
        System.out.println("--- 1. Probando Constructores ---");

        // Habitación A: Usa Constructor COMPLETO
        Habitacion habA = new Habitacion("301", "SUITE", 500000.00, 4);
        System.out.println("Hab A (Completo): " + habA.getNumero() + ", Tipo: " + habA.getTipo());

        // Habitación B: Usa Constructor PARCIAL (asume Doble y precio por defecto)
        Habitacion habB = new Habitacion("405");
        System.out.println("Hab B (Parcial): " + habB.getNumero() + ", Tipo: " + habB.getTipo() + ", Precio: " + habB.getPrecioBase());

        // Huésped 1: Usa Constructor COMPLETO
        Huesped huesped1 = new Huesped("111", "Laura Jiménez", "3101234567", 5);
        System.out.println("Huésped 1 (Completo): " + huesped1.getNombreCompleto() + ", Días: " + huesped1.getDiasEstancia());

        // Huésped 2: Usa Constructor PARCIAL (asume 1 día de estancia)
        Huesped huesped2 = new Huesped("222", "Carlos Gómez", "3209876543");
        System.out.println("Huésped 2 (Parcial): " + huesped2.getNombreCompleto() + ", Días: " + huesped2.getDiasEstancia());


        // --- 2. PRUEBA DE ENCAPSULACIÓN Y VALIDACIÓN (SETTERS) ---
        System.out.println("\n--- 2. Probando Encapsulación (Setters con Validación) ---");

        // Uso de un setter normal
        huesped1.setDiasEstancia(6);
        System.out.println("Días de Laura actualizados a: " + huesped1.getDiasEstancia());

        // Prueba de método de negocio con validación interna
        habA.cambiarEstado(true); // Ocupamos Habitación A (queda sucia al desocupar)
        habA.cambiarEstado(false);

        System.out.println("Intentando ocupar Hab. A de nuevo (debe fallar por estar sucia):");
        habA.cambiarEstado(true);

        // --- 3. PRUEBA DE EXCEPCIONES (VALIDACIONES FUERTES) ---
        System.out.println("\n--- 3. Probando Error de Validación (Capturando la excepción) ---");
        try {
            // Intentamos poner un precio inválido (debe lanzar error)
            habB.setPrecioBase(-50000.00);
        } catch (IllegalArgumentException e) {
            // Se muestra el mensaje que definimos en el setter
            System.out.println("❌ ERROR CAPTURADO (Precio): " + e.getMessage());
        }

        try {
            // Intentamos poner un nombre muy corto (debe lanzar error)
            huesped1.setNombreCompleto("J");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ ERROR CAPTURADO (Nombre): " + e.getMessage());
        }

        System.out.println("\n================ DEMOSTRACIÓN EXITOSA ================");
    }
}