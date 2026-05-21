public interface IUsuarioRepository {
    boolean validarUsuarioDisponible(String correo); // Retorna true si el correo NO existe
    void agregarUsuario(Usuario nuevoUsuario);
    Usuario buscarUsuario(String correo, String contrasena);
}
