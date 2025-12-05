import java.util.ArrayList;

public class HotelDescansoReal {
    private String nombre;
    private ArrayList<Reserva> listaReservas;

    public HotelDescansoReal(String nombre) {
        this.nombre = nombre;
        this.listaReservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        listaReservas.add(reserva);
        System.out.println("✅ Reserva " + reserva.getCodigoReserva() + " registrada.");
    }

    public void mostrarTodasLasReservas() {
        System.out.println("\n--- LISTADO DE RESERVAS ---");

        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        for (Reserva reserva : listaReservas) {
            // Obtenemos información de los objetos internos (Huesped y Habitacion)
            String nombreHuesped = reserva.getHuespedPrincipal().nombreCompleto;
            String numHabitacion = reserva.getHabitacionAsociada().getNumero();
            double costo = reserva.calcularPrecioReserva();

            System.out.printf("  - R%d: %s en Hab. %s. Costo: $%,.2f%n",
                    reserva.getCodigoReserva(), nombreHuesped, numHabitacion, costo);
        }
    }

    public int contarTotalReservas() {
        return listaReservas.size();
    }
}
