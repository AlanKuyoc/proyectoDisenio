import java.util.ArrayList;

import usuarios.*;
import habitaciones.*;
import reservas.*;

public class SistemaHotel {

    private static SistemaHotel instance;

    private ArrayList<Usuario> usuarios;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    private SistemaHotel() {
        usuarios = new ArrayList<>();
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public static SistemaHotel getInstance() {
        if (instance == null) {
            instance = new SistemaHotel();
        }
        return instance;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Reserva crearReserva(Cliente cliente,
                                Habitacion habitacion,
                                String inicio,
                                String fin,
                                int personas) {

        if (habitacion.getEstado() != EstadoHabitacion.DISPONIBLE) {
            System.out.println("Habitación no disponible");
            return null;
        }

        Reserva reserva = new Reserva(cliente, habitacion, inicio, fin, personas);

        reservas.add(reserva);

        habitacion.setEstado(EstadoHabitacion.RESERVADA);

        return reserva;
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelar();
    }
}