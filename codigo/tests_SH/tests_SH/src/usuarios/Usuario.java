package usuarios;

public abstract class Usuario {

    protected int id;
    protected String nombreUsuario;
    protected String correo;
    protected String password;

    public Usuario(int id, String nombreUsuario, String correo, String password) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }
}