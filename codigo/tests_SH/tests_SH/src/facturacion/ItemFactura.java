package facturacion;

public class ItemFactura {

    private String descripcion;

    private int cantidad;

    private double precioUnitario;

    public ItemFactura(String descripcion,
                       int cantidad,
                       double precioUnitario) {

        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double getCostoTotal() {

        return cantidad * precioUnitario;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public int getCantidad() {

        return cantidad;
    }

    public double getPrecioUnitario() {

        return precioUnitario;
    }
}