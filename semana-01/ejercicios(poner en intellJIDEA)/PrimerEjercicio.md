/**
 * Clase principal para el dominio Hotel "Descanso Real".
 * Representa una habitación con sus datos básicos.
 */
public class Habitacion {

    // ATRIBUTOS (Variables que describen la habitación)
    private String numero;       // Número de la habitación (String)
    private String tipo;         // Ej: Sencilla, Doble, Suite (String)
    private double precioBase;   // Tarifa por noche (double)
    private int capacidad;       // Cuántas personas caben (int)
    private boolean estaOcupada; // ¿Está un huésped dentro? (boolean)
    private int piso;            // El piso donde está la habitación (int adicional)

    /**
     * Constructor para crear una nueva Habitación.
     */
    public Habitacion(String numero, String tipo, double precioBase, int capacidad, int piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.capacidad = capacidad;
        this.piso = piso;
        // Al inicio, asumimos que no está ocupada
        this.estaOcupada = false;
    }

    // =============================================================
    // MÉTODOS REQUERIDOS
    // =============================================================

    /**
     * 1. Método que solo imprime: Muestra la información de la habitación.
     */
    public void mostrarInformacion() {
        System.out.println("--- DATOS DE LA HABITACIÓN ---");
        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: $" + precioBase);
        System.out.println("Capacidad: " + capacidad + " personas");
        // Usamos un simple IF para mostrar el estado
        if (estaOcupada) {
            System.out.println("Estado: OCUPADA");
        } else {
            System.out.println("Estado: LIBRE");
        }
    }

    /**
     * 2. Método que retorna un valor calculado: Calcula cuánto cuesta
     * una estadía con un 10% de descuento.
     * @param noches Los días que se queda el huésped.
     * @return El costo total con descuento.
     */
    public double calcularPrecioConDescuento(int noches) {
        double subtotal = precioBase * noches;
        double descuento = subtotal * 0.10; // 10% de descuento
        double totalFinal = subtotal - descuento;
        return totalFinal;
    }

    /**
     * 3. Método getter: Nos da el número de la habitación.
     * @return El número (String).
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * 4. Método setter: Para cambiar si la habitación está ocupada o no.
     * @param ocupada El nuevo estado (true si está ocupada, false si está libre).
     */
    public void setEstaOcupada(boolean ocupada) {
        this.estaOcupada = ocupada;
        if (ocupada) {
            System.out.println("Habitación " + numero + " marcada como OCUPADA.");
        } else {
            System.out.println("Habitación " + numero + " marcada como LIBRE.");
        }
    }
    
    // Método MAIN para probar que todo funcione
    public static void main(String[] args) {
        // Creamos una habitación Doble
        Habitacion habDoble = new Habitacion("205", "Doble", 250000.00, 2, 2);

        // 1. Mostrar su info inicial
        System.out.println("--- INICIO DE PRUEBA ---");
        habDoble.mostrarInformacion();

        // 2. Probar el setter: marcar como ocupada
        habDoble.setEstaOcupada(true);

        // 3. Mostrar info para ver el cambio
        habDoble.mostrarInformacion();

        // 4. Probar el método calculado: estadía de 4 noches
        int noches = 4;
        double costo = habDoble.calcularPrecioConDescuento(noches);
        
        System.out.println("\nCálculo:");
        System.out.println("4 noches en la " + habDoble.getNumero() + " cuestan: $" + String.format("%,.2f", costo));
        
        // 5. Probar el getter
        System.out.println("El número de habitación es: " + habDoble.getNumero());
    }
}