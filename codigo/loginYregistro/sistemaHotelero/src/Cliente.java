public class Cliente extends Usuario {
    public Cliente(int id, String nombreUsuario, String correo, String contrasena) {
        super(id, nombreUsuario, correo, contrasena);
    }

    @Override
    public void mostrarAcceso() {
        System.out.println("Acceso cliente: Mostrando panel de reservas y servicios.");
    }
}
