import java.util.ArrayList;
import java.util.List;

public class SistemaHotelero implements IUsuarioRepository {
    private List<Usuario> usuarios;

    public SistemaHotelero() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public boolean validarUsuarioDisponible(String correo) {
        // Verifica si el correo ya está registrado
        return usuarios.stream().noneMatch(u -> u.getCorreo().equals(correo));
    }

    @Override
    public void agregarUsuario(Usuario nuevoUsuario) {
        usuarios.add(nuevoUsuario);
    }

    @Override
    public Usuario buscarUsuario(String correo, String contrasena) {
        // usuarios.find(u, p)
        return usuarios.stream()
                .filter(u -> u.getCorreo().equals(correo) && u.getContrasena().equals(contrasena))
                .findFirst()
                .orElse(null);
    }
}