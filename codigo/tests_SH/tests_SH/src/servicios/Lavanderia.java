package servicios;

public class Lavanderia extends Servicio {

    public Lavanderia(int idServicio, double precio) {
        super(idServicio, "Lavandería", precio);
    }

    @Override
    public double calcularCosto() {
        return precio;
    }
}