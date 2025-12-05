public class Reserva {
    // Importamos las clases de la Semana 01 para poder usarlas
// NOTA: Asegúrate de tener estas clases disponibles en tu proyecto
// import [package].Habitacion;
// import [package].Huesped;


        // ATRIBUTOS (Mínimo 3)
        private int codigoReserva; // Identificador único
        private Habitacion habitacionAsociada; // Objeto Habitacion (RELACIÓN 1)
        private Huesped huespedPrincipal; // Objeto Huesped (RELACIÓN 2)
        private String fechaLlegada; // Día de inicio
        private int noches; // Duración de la estancia

        /**
         * Constructor
         */
        public Reserva(int codigo, Habitacion habitacion, Huesped huesped, String llegada, int noches) {
            this.codigoReserva = codigo;
            this.habitacionAsociada = habitacion;
            this.huespedPrincipal = huesped;
            this.fechaLlegada = llegada;
            this.noches = noches;
            System.out.println("Reserva " + codigo + " creada exitosamente.");
        }

        // =============================================================
        // MÉTODO DE NEGOCIO
        // =============================================================

        /**
         * Usa el método de la Habitacion para calcular el precio total.
         * @return El precio total de la estancia.
         */
        public double calcularPrecioReserva() {
            // Usamos el método de la clase Habitacion para calcular el total.
            // ¡Esto es un ejemplo de cómo se relacionan los objetos!
            double costoTotal = habitacionAsociada.calcularPrecioConDescuento(this.noches);
            return costoTotal;
        }

        // =============================================================
        // GETTERS y SETTERS (Ejemplos, deben ser completos)
        // =============================================================

        public int getCodigoReserva() {
            return codigoReserva;
        }

        public Habitacion getHabitacionAsociada() {
            return habitacionAsociada;
        }

        public Huesped getHuespedPrincipal() {
            return huespedPrincipal;
        }

        public void setFechaLlegada(String nuevaFecha) {
            this.fechaLlegada = nuevaFecha;
            System.out.println("Fecha de reserva " + codigoReserva + " actualizada a " + nuevaFecha);
        }
    }

