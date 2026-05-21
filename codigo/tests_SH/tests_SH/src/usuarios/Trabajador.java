package usuarios;

public class Trabajador extends Usuario {

    public Trabajador(int id, String nombreUsuario, String correo, String password) {
        super(id, nombreUsuario, correo, password);
    }

    public void gestionarHabitaciones() {
        System.out.println("Gestionando habitaciones...");
    }

    public void generarReporte() {
        System.out.println("Generando reporte...");
    }
}