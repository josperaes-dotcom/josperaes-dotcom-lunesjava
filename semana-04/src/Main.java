import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("=== SEMANA 04: DEMOSTRACIÓN DE HERENCIA Y POLIMORFISMO ===");
        System.out.println("======================================================\n");

        // 1. CREACIÓN DE OBJETOS HIJOS (Subclases)
        System.out.println("--- 1. Creación de Personal ---");

        // Empleado base (el padre, aunque en este caso se crea un hijo)
        Recepcionista r1 = new Recepcionista("E101", "María Solano", 2500000.00, "2023-01-15", 50);
        Gerente g1 = new Gerente("E001", "Javier Prada", 7000000.00, "2020-05-01", 15, "clave123");

        // 2. USO DE MÉTODOS SOBRESCRITOS (Demuestra la lógica específica)
        System.out.println("\n--- 2. Ejecución de Tareas Específicas ---");

        r1.realizarTrabajo(); // Llama a la versión de Recepcionista
        r1.registrarCheckIn(); // Llama al método único del Recepcionista

        g1.realizarTrabajo(); // Llama a la versión de Gerente (que incluye la base)
        g1.autorizarDescuento(50000.00); // Llama al método único del Gerente

        // 3. DEMOSTRACIÓN DE POLIMORFISMO
        System.out.println("\n--- 3. Demostración de Polimorfismo ---");

        // Creamos una lista de tipo Empleado (la clase padre)
        ArrayList<Empleado> personalHotel = new ArrayList<>();

        // Podemos agregar tanto Recepcionistas como Gerentes a la lista de Empleado
        personalHotel.add(r1);
        personalHotel.add(g1);

        // Recorremos la lista de EMpleados y llamamos a un método común
        System.out.println("Ejecutando la tarea genérica en la lista de Empleados:");
        for (Empleado e : personalHotel) {
            System.out.print(" -> " + e.getNombreCompleto() + ": ");
            // Aunque la lista es de tipo Empleado, Java llama al método
            // ¡Sobrescrito y específico de cada hijo!
            e.realizarTrabajo();
        }

        // 4. USO DEL CONSTRUCTOR PADRE (super())
        System.out.println("\n--- 4. Uso del Constructor Padre (Heredado) ---");
        System.out.println(g1.getNombreCompleto() + " tiene un salario anual de: $" + String.format("%,.2f", g1.calcularSalarioAnual()));


        System.out.println("\n================ DEMOSTRACIÓN EXITOSA ================");
    }
}