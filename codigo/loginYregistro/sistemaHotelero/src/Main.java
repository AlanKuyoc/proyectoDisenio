public class Main {
   public static void main(String[] args) {
        // Inicialización
        SistemaHotelero sistema = new SistemaHotelero();
        Autenticacion auth = new Autenticacion(sistema);
        
        IUsuarioFactory clienteFactory = new ClienteFactory();
        IUsuarioFactory empleadoFactory = new EmpleadoFactory();

        // Registro exitoso (Cliente)
        auth.registrar("Juan Perez", "12345", "juan@mail.com", clienteFactory);
        
        // Registro exitoso (Empleado)
        auth.registrar("Ana Lopez", "admin123", "ana@hotel.com", empleadoFactory);

        // Flujo alterno [Usuario ya existe]
        auth.registrar("Juan Dos", "abcde", "juan@mail.com", clienteFactory);

        // Iniciar sesión como Cliente
        auth.iniciarSesion("juan@mail.com", "12345");
        
        // Iniciar sesión como Empleado
        auth.iniciarSesion("ana@hotel.com", "admin123");
        
        // Flujo alterno: Credenciales inválidas
        auth.iniciarSesion("juan@mail.com", "claveIncorrecta");
    }
}
