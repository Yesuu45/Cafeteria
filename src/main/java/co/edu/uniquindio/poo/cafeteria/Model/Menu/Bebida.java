package co.edu.uniquindio.poo.cafeteria.Model.Menu;

public class Bebida extends Producto {
    private String tipoBebida;

    public Bebida(String nombre, double precio, int cantidad, String codigo, String descripcion, String tipoBebida) {
        super(nombre, precio, cantidad, codigo, descripcion);
        this.tipoBebida = tipoBebida;
    }

}
