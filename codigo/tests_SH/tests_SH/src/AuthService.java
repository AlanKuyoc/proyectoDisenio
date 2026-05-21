import java.util.ArrayList;
import usuarios.Usuario;

public class AuthService {

    private static AuthService instance;

    private ArrayList<Usuario> usuarios;

    private AuthService() {
        usuarios = new ArrayList<>();
    }

    public static AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    public boolean register(Usuario nuevo) {

        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equals(nuevo.getNombreUsuario()) ||
                    u.getCorreo().equals(nuevo.getCorreo())) {

                System.out.println("Usuario repetido");
                return false;
            }
        }

        usuarios.add(nuevo);
        return true;
    }

    public boolean login(String nombre, String password) {

        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equals(nombre) &&
                    u.getPassword().equals(password)) {

                return true;
            }
        }

        return false;
    }
}