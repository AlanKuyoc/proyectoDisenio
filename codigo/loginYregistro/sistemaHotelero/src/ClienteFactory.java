public class ClienteFactory implements IUsuarioFactory {
    @Override
    public Usuario crearUsuario(int id, String nombreUsuario, String correo, String contrasena) {
        return new Cliente(id, nombreUsuario, correo, contrasena);
    }
}