package habitaciones;

public class Habitacion {

    private int idHabitacion;
    private String tipo;
    private int capacidad;
    private double precio;
    private EstadoHabitacion estado;

    public Habitacion(int idHabitacion,
                      String tipo,
                      int capacidad,
                      double precio) {

        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precio = precio;
        this.estado = EstadoHabitacion.DISPONIBLE;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}