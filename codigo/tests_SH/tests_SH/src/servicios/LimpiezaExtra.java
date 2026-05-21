package servicios;

public class LimpiezaExtra extends Servicio {

    public LimpiezaExtra(int idServicio, double precio) {
        super(idServicio, "Limpieza extra", precio);
    }

    @Override
    public double calcularCosto() {
        return precio;
    }
}