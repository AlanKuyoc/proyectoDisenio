package facturacion;

import java.util.ArrayList;

public class Factura {

    private int idFactura;
    private String fecha;

    private ArrayList<ItemFactura> items;

    private double subtotal;
    private double impuestos;
    private double total;

    public Factura(int idFactura, String fecha) {

        this.idFactura = idFactura;
        this.fecha = fecha;

        items = new ArrayList<>();

        subtotal = 0;
        impuestos = 0;
        total = 0;
    }

    public void agregarItem(ItemFactura item) {

        items.add(item);
    }

    public void calcularFactura() {

        subtotal = 0;

        for (ItemFactura item : items) {

            subtotal += item.getCostoTotal();
        }

        impuestos = subtotal * 0.16; // IVA 16%

        total = subtotal + impuestos;
    }

    public void mostrarFactura() {

        System.out.println("\n========== FACTURA ==========");

        System.out.println("Factura ID: " + idFactura);
        System.out.println("Fecha: " + fecha);

        System.out.println("\n----- DESGLOSE -----");

        for (ItemFactura item : items) {

            System.out.println(
                    item.getDescripcion()
                            + " | Cantidad: "
                            + item.getCantidad()
                            + " | Precio Unitario: $"
                            + item.getPrecioUnitario()
                            + " | Total: $"
                            + item.getCostoTotal()
            );
        }

        System.out.println("\n-----------------------------");

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (16%): $" + impuestos);
        System.out.println("TOTAL: $" + total);

        System.out.println("=============================\n");
    }

    public double getTotal() {

        return total;
    }

    public ArrayList<ItemFactura> getItems() {

        return items;
    }
}