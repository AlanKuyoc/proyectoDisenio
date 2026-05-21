public class EmpleadoFactory implements IUsuarioFactory {
    @Override
    public Usuario crearUsuario(int id, String nombreUsuario, String correo, String contrasena) {
        return new Empleado(id, nombreUsuario, correo, contrasena);
    }
}