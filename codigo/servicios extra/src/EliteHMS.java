import java.util.Scanner;

public class EliteHMS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("        ELITE HMS");
            System.out.println("==============================");
            System.out.println("1. Servicio a la Habitación");
            System.out.println("2. Limpieza Extra");
            System.out.println("3. Lavandería");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    servicioHabitacion();
                    break;

                case 2:
                    limpiezaExtra();
                    break;

                case 3:
                    lavanderia();
                    break;

                case 4:
                    System.out.println("\nGracias por usar EliteHMS.");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 4);

    }

    // =====================================================
    // SERVICIO A LA HABITACIÓN
    // =====================================================

    public static void servicioHabitacion() {

        int opcion;
        double total = 0;

        do {

            System.out.println("\n===== SERVICIO A LA HABITACIÓN =====");
            System.out.println("1. Club Sándwich - $18");
            System.out.println("2. Ensalada César - $14");
            System.out.println("3. Pasta Alfredo - $16");
            System.out.println("4. Jugo Natural - $6");
            System.out.println("5. Finalizar pedido");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    total += 18;
                    System.out.println("Club Sándwich agregado.");
                    break;

                case 2:
                    total += 14;
                    System.out.println("Ensalada César agregada.");
                    break;

                case 3:
                    total += 16;
                    System.out.println("Pasta Alfredo agregada.");
                    break;

                case 4:
                    total += 6;
                    System.out.println("Jugo Natural agregado.");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        System.out.println("\nTotal del pedido: $" + total);
        System.out.println("Pedido enviado a cocina.");

    }

    // =====================================================
    // LIMPIEZA EXTRA
    // =====================================================

    public static void limpiezaExtra() {

        sc.nextLine();

        String fecha;
        String hora;

        System.out.println("\n===== LIMPIEZA EXTRA =====");

        System.out.print("Ingrese fecha de limpieza: ");
        fecha = sc.nextLine();

        System.out.print("Ingrese horario preferido: ");
        hora = sc.nextLine();

        System.out.println("\nSolicitud registrada.");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);

    }

    // =====================================================
    // LAVANDERÍA
    // =====================================================

    public static void lavanderia() {

        int prendas;
        double precioPorPrenda = 1.5;
        double precioFijo = 10;
        double total;

        sc.nextLine();

        String horario;

        System.out.println("\n===== LAVANDERÍA =====");

        System.out.print("Número de prendas: ");
        prendas = sc.nextInt();

        sc.nextLine();

        System.out.print("Horario para recoger la ropa: ");
        horario = sc.nextLine();

        total = (prendas * precioPorPrenda) + precioFijo;

        System.out.println("\n===== RESUMEN =====");
        System.out.println("Prendas: " + prendas);
        System.out.println("Precio por prenda: $" + precioPorPrenda);
        System.out.println("Costo fijo: $" + precioFijo);
        System.out.println("Total: $" + total);
        System.out.println("Horario de recogida: " + horario);

    }

}