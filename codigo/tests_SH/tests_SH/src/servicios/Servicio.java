package servicios;

public abstract class Servicio {

    protected int idServicio;
    protected String nombre;
    protected double precio;

    public Servicio(int idServicio, String nombre, double precio) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularCosto();

    public String getNombre() {
        return nombre;
    }
}