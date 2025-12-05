public class Habitacion {
    // 1. Encapsulación: Todos los atributos son 'private'
    private String numero;
    private String tipo;
    private double precioBase;
    private int capacidad;
    private boolean estaOcupada;
    private String estadoLimpieza; // Nuevo atributo de control

    // =============================================================
    // 2. SOBRECARGA DE CONSTRUCTORES
    // =============================================================

    /**
     * Constructor COMPLETO: Inicializa todos los valores con validación.
     */
    public Habitacion(String numero, String tipo, double precioBase, int capacidad) {
        // Usamos setters (aunque estén en el constructor) para validar desde el inicio
        setNumero(numero);
        setTipo(tipo);
        setPrecioBase(precioBase);
        setCapacidad(capacidad);
        this.estaOcupada = false;
        this.estadoLimpieza = "Limpia";
    }

    /**
     * Constructor PARCIAL: Crea una habitación estándar (Doble) por defecto.
     */
    public Habitacion(String numero) {
        // Llama al constructor completo con valores estándar
        this(numero, "DOBLE", 200000.00, 2);
    }

    // =============================================================
    // 3. SETTERS con VALIDACIÓN
    // =============================================================

    public void setPrecioBase(double precioBase) {
        // Validación: El precio debe ser positivo.
        if (precioBase <= 0) {
            // Lanza un error si la condición no se cumple
            throw new IllegalArgumentException("El precio base debe ser mayor a cero.");
        }
        this.precioBase = precioBase;
    }

    public void setCapacidad(int capacidad) {
        // Validación: Capacidad entre 1 y 4 (Regla de negocio del Hotel)
        if (capacidad > 4 || capacidad < 1) {
            throw new IllegalArgumentException("Capacidad de habitación debe ser entre 1 y 4 personas.");
        }
        this.capacidad = capacidad;
    }

    public void setTipo(String tipo) {
        String tipoUpper = tipo.toUpperCase();
        // Validación: Solo tipos de habitación válidos.
        if (!tipoUpper.equals("SENCILLA") && !tipoUpper.equals("DOBLE") && !tipoUpper.equals("SUITE")) {
            throw new IllegalArgumentException("Tipo de habitación inválido. Use Sencilla, Doble o Suite.");
        }
        this.tipo = tipoUpper;
    }

    // Método de negocio refactorizado: Usa la encapsulación para verificar limpieza
    public void cambiarEstado(boolean ocupada) {
        // Validación de lógica: No se puede ocupar si está sucia
        if (ocupada && !this.estadoLimpieza.equals("Limpia")) {
            System.out.println("❌ No se puede asignar la habitación " + numero + ". ¡Requiere limpieza!");
            return;
        }
        this.estaOcupada = ocupada;
        this.estadoLimpieza = ocupada ? "Ocupada" : "Sucia"; // Si se desocupa, queda sucia
        System.out.println("Habitación " + numero + " marcada como " + (ocupada ? "OCUPADA" : "LIBRE"));
    }

    // =============================================================
    // GETTERS y Métodos de Semana 01
    // =============================================================

    // Es necesario el setter privado para usarlo en el constructor
    private void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() { return numero; }
    public double getPrecioBase() { return precioBase; }
    public String getTipo() { return tipo; }
    public boolean getEstaOcupada() { return estaOcupada; }

    public double calcularPrecioConDescuento(int noches) {
        return (precioBase * noches) * 0.90; // 10% de descuento
    }
}