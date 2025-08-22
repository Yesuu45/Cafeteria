package co.edu.uniquindio.poo.cafeteria.Model.Menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public String codigo;
    public String descripcion;


    public Producto(String nombre, double precio, int cantidad, String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
