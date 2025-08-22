package co.edu.uniquindio.poo.cafeteria.Model.Menu;

public class Comida extends Producto{
    private String tipoComida;

    public Comida(String nombre, double precio, int cantidad, String codigo, String descripcion, String tipoComida) {
        super(nombre, precio, cantidad, codigo, descripcion);
        this.tipoComida = tipoComida;
    }
}
