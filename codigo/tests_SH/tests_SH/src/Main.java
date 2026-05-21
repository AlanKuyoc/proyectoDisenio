import usuarios.*;
import habitaciones.*;
import reservas.*;
import servicios.*;

public class Main {
    public static void main(String[] args) {

        SistemaHotel sistema = SistemaHotel.getInstance();

        Cliente cliente = new Cliente(1, "Ruben", "ruben@gmail.com", "1234");
        sistema.agregarUsuario(cliente);

        Habitacion h1 = new Habitacion(101, "Suite", 4, 2500);
        Habitacion h2 = new Habitacion(102, "Simple", 2, 1200);

        sistema.agregarHabitacion(h1);
        sistema.agregarHabitacion(h2);

        Reserva reserva = sistema.crearReserva(cliente, h1,
                "2026-05-20",
                "2026-05-25",
                2);

        Servicio servicio1 = new Lavanderia(1, 300);
        Servicio servicio2 = new LimpiezaExtra(2, 500);

        reserva.agregarServicio(servicio1);
        reserva.agregarServicio(servicio2);

        reserva.generarFactura();

        reserva.mostrarReserva();
    }
}