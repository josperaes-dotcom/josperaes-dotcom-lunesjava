public class Huesped {


        // ATRIBUTOS (Mínimo 4)
        private String identificacion;    // Documento de identidad del huésped (String)
        protected String nombreCompleto;    // Nombre completo del cliente (String)
        private String telefonoContacto;  // Número de teléfono (String adicional)
        protected int diasEstancia;         // Número de días que se va a quedar (int)
        private boolean tieneCheckIn;     // Indica si ya se registró en el hotel (boolean)

        /**
         * Constructor para crear un nuevo Huésped.
         */
        public Huesped(String identificacion, String nombreCompleto, String telefonoContacto) {
            this.identificacion = identificacion;
            this.nombreCompleto = nombreCompleto;
            this.telefonoContacto = telefonoContacto;
            // Al crear el objeto, la estancia y el check-in son iniciales
            this.diasEstancia = 1;
            this.tieneCheckIn = false;
        }

        // =============================================================
        // MÉTODOS REQUERIDOS (Mínimo 3)
        // =============================================================

        /**
         * 1. Método funcional (void): Simula el proceso de Check-in.
         */
        public void registrarLlegada() {
            if (!this.tieneCheckIn) {
                this.tieneCheckIn = true;
                System.out.println("✅ Check-In exitoso para " + nombreCompleto + ".");
                System.out.println("¡Bienvenido/a al Hotel Descanso Real!");
            } else {
                System.out.println("El huésped " + nombreCompleto + " ya había realizado el Check-In.");
            }
        }

        /**
         * 2. Método funcional (retorna valor): Verifica si la estancia es considerada "larga"
         * (más de 3 días) para aplicar beneficios.
         * @return true si se queda más de 3 días, false si no.
         */
        public boolean esEstanciaLarga() {
            // La lógica simple es comparar con un número fijo
            return this.diasEstancia > 3;
        }

        /**
         * 3. Método getter: Obtiene el número de identificación del huésped.
         * @return La identificación (String).
         */
        public String getIdentificacion() {
            return this.identificacion;
        }

        // Método adicional para mostrar la información del huésped
        public void mostrarDatos() {
            System.out.println("\n--- DATOS DEL HUÉSPED ---");
            System.out.println("Nombre: " + nombreCompleto);
            System.out.println("ID: " + identificacion);
            System.out.println("Teléfono: " + telefonoContacto);
            System.out.println("Días Reservados: " + diasEstancia);
            String estado = this.tieneCheckIn ? "En el Hotel" : "Reserva Pendiente";
            System.out.println("Estado: " + estado);
        }


        // Método MAIN para probar que todo funcione
        public static void main(String[] args) {
            // Creamos un nuevo huésped
            Huesped clienteUno = new Huesped("102456789", "Jose Luis Guerrero", "3001234567");

            // Asignamos una estancia de 5 días
            clienteUno.diasEstancia = 5;

            // 1. Mostrar datos iniciales
            System.out.println("--- PRUEBA DE LA CLASE HUESPED ---");
            clienteUno.mostrarDatos();

            // 2. Probar el método funcional: registrar llegada
            clienteUno.registrarLlegada();

            // 3. Probar el método de cálculo/retorno: ¿Es estancia larga?
            if (clienteUno.esEstanciaLarga()) {
                System.out.println("📢 ¡Beneficio! El huésped aplica para un descuento por estancia larga.");
            } else {
                System.out.println("El huésped tiene una estancia estándar.");
            }

            // 4. Probar el getter
            System.out.println("Identificación del huésped: " + clienteUno.getIdentificacion());

            // Mostrar datos después del check-in
            clienteUno.mostrarDatos();
        }
    }

