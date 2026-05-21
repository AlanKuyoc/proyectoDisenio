public abstract class Usuario {
    protected int id;
    protected String nombreUsuario;
    protected String correo;
    protected String contrasena;

    public Usuario(int id, String nombreUsuario, String correo, String contrasena) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() { return correo; }
    public String getContrasena() { return contrasena; }
    
    //Resolver los flujos alternos
    public abstract void mostrarAcceso(); 
}
