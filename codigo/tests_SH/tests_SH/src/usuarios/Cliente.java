package usuarios;

import java.util.ArrayList;

import reservas.Reserva;

public class Cliente extends Usuario {

    private ArrayList<Reserva> reservas;

    public Cliente(int id, String nombreUsuario, String correo, String password) {
        super(id, nombreUsuario, correo, password);
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }
}