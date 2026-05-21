public class Autenticacion {
    private final IUsuarioRepository repositorio;
    private int contadorIds = 1; // Simulador de autoincremento para IDs

    // Inyección de dependencias
    public Autenticacion(IUsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Registro de Usuario
     */
    public void registrar(String nombre, String pass, String correo, IUsuarioFactory factory) {
        System.out.println("\n--- Iniciando Registro ---");
        
        // validarUsuario(correo) y usuarioDisponible(true/false)
        boolean estaDisponible = repositorio.validarUsuarioDisponible(correo);
        
        if (!estaDisponible) {
            // Usuario ya existe: mostrarError
            System.out.println("Error: El correo " + correo + " ya está registrado.");
            return;
        }
        
        // Usuario no existe: <<Create>> Usuario
        Usuario nuevoUsuario = factory.crearUsuario(contadorIds++, nombre, correo, pass);
        
        // usuarios.add(nuevoUsuario)
        repositorio.agregarUsuario(nuevoUsuario);
        
        // confirmar() y registroExitoso
        System.out.println("Registro exitoso para el usuario: " + nombre);
    }

    /**
     * Iniciar Sesión
     */
    public void iniciarSesion(String correo, String contrasena) {
        System.out.println("\n--- Iniciando Sesión ---");
        
        // usuarios.find(u, p) -> devuelve Cliente / Empleado / null
        Usuario usuario = repositorio.buscarUsuario(correo, contrasena);
        
        if (usuario == null) {
            // alt [credenciales inválidas] -> 4: error de autenticación
            System.out.println("Error de autenticación: Credenciales inválidas para " + correo);
        } else {
            // alt [es Cliente] o [es Empleado (Administrador)]
            usuario.mostrarAcceso();
        }
    }
}
