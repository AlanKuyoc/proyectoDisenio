package reservas;

import java.util.ArrayList;

import usuarios.Cliente;
import habitaciones.*;
import servicios.*;
import facturacion.*;

public class Reserva {

    private static int contador = 1;

    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;

    private String fechaInicio;
    private String fechaFin;

    private int numeroPersonas;

    private ArrayList<Servicio> servicios;

    private Factura factura;

    public Reserva(Cliente cliente,
                   Habitacion habitacion,
                   String fechaInicio,
                   String fechaFin,
                   int numeroPersonas) {

        this.idReserva = contador++;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroPersonas = numeroPersonas;

        servicios = new ArrayList<>();

        cliente.agregarReserva(this);
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void cancelar() {
        habitacion.setEstado(EstadoHabitacion.LIBERADA);
        System.out.println("Reserva cancelada");
    }

    public void generarFactura() {

        factura = new Factura(
                idReserva,
                fechaInicio
        );

        factura.agregarItem(

                new ItemFactura(
                        "Habitación " + habitacion.getTipo(),
                        1,
                        habitacion.getPrecio()
                )
        );

        for (Servicio s : servicios) {

            factura.agregarItem(

                    new ItemFactura(
                            s.getNombre(),
                            1,
                            s.calcularCosto()
                    )
            );
        }

        factura.calcularFactura();
    }

    public void mostrarReserva() {

        System.out.println("===== RESERVA =====");
        System.out.println("ID: " + idReserva);
        System.out.println("Cliente: " + cliente.getNombreUsuario());
        System.out.println("Habitación: " + habitacion.getTipo());
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
        System.out.println("Personas: " + numeroPersonas);

        if (factura != null) {
            factura.mostrarFactura();
        }
    }
}