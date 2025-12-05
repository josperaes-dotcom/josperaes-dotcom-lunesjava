public class Huesped {
    // 1. Encapsulación: Todos los atributos son 'private'
    private String identificacion;
    private String nombreCompleto;
    private String telefonoContacto;
    private int diasEstancia;
    private boolean tieneCheckIn;

    // =============================================================
    // 2. SOBRECARGA DE CONSTRUCTORES
    // =============================================================

    /**
     * Constructor COMPLETO: Inicializa todos los valores con validación.
     */
    public Huesped(String identificacion, String nombreCompleto, String telefonoContacto, int diasEstancia) {
        this.identificacion = identificacion;
        setNombreCompleto(nombreCompleto); // Llama al setter con validación
        setTelefonoContacto(telefonoContacto); // Llama al setter con validación
        setDiasEstancia(diasEstancia); // Llama al setter con validación
        this.tieneCheckIn = false;
    }

    /**
     * Constructor PARCIAL: Crea un huésped asumiendo 1 día de estancia (por defecto).
     */
    public Huesped(String identificacion, String nombreCompleto, String telefonoContacto) {
        // Llama al constructor completo con díasEstancia = 1
        this(identificacion, nombreCompleto, telefonoContacto, 1);
    }

    // =============================================================
    // 3. SETTERS con VALIDACIÓN
    // =============================================================

    public void setNombreCompleto(String nombreCompleto) {
        // Validación: Nombre debe tener al menos 3 caracteres.
        if (nombreCompleto == null || nombreCompleto.trim().length() < 3) {
            throw new IllegalArgumentException("El nombre completo debe tener al menos 3 letras.");
        }
        this.nombreCompleto = nombreCompleto;
    }

    public void setDiasEstancia(int diasEstancia) {
        // Validación: Estancia mínima de 1 día.
        if (diasEstancia < 1) {
            throw new IllegalArgumentException("La estancia mínima es de 1 día.");
        }
        this.diasEstancia = diasEstancia;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        // Validación: Simple verificación de longitud.
        if (telefonoContacto == null || telefonoContacto.length() < 7) {
            System.out.println("⚠️ Teléfono no válido. Asignando 'N/A' y continuando.");
            this.telefonoContacto = "N/A";
            return;
        }
        this.telefonoContacto = telefonoContacto;
    }

    // =============================================================
    // GETTERS y Métodos de Semana 01
    // =============================================================
    public String getNombreCompleto() { return nombreCompleto; }
    public int getDiasEstancia() { return diasEstancia; }
    public boolean tieneCheckIn() { return tieneCheckIn; }

    public void registrarCheckIn() {
        if (!this.tieneCheckIn) {
            this.tieneCheckIn = true;
            System.out.println("✅ Check-In de " + nombreCompleto + " completado.");
        }
    }

    public boolean esEstanciaLarga() {
        return this.diasEstancia > 3;
    }
}
