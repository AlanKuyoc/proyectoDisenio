public class Empleado extends Usuario {
    public Empleado(int id, String nombreUsuario, String correo, String contrasena) {
        super(id, nombreUsuario, correo, contrasena);
    }

    @Override
    public void mostrarAcceso() {
        System.out.println("Acceso administrador: Mostrando panel de gestión del hotel.");
    }
}