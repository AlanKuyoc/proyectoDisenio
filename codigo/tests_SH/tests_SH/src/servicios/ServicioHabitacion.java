package servicios;

public class ServicioHabitacion extends Servicio {

    public ServicioHabitacion(int idServicio, double precio) {
        super(idServicio, "Servicio a la habitación", precio);
    }

    @Override
    public double calcularCosto() {
        return precio;
    }
}