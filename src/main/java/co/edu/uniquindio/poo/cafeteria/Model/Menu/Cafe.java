package co.edu.uniquindio.poo.cafeteria.Model.Menu;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.TipoCafe;

public final class Cafe  extends Producto{
    private static Cafe instance;
    private TipoCafe tipoCafe;

    public Cafe(String nombre, double precio, int cantidad, String descripcion, TipoCafe tipoCafe) {
        super(nombre, precio, cantidad, descripcion);
        this.tipoCafe = tipoCafe;
    }

    public static Cafe getInstance(String nombre, double precio, int cantidad, String descripcion, TipoCafe tipoCafe) {
        if(instance == null){
            instance = new Cafe(nombre, precio, cantidad, descripcion, tipoCafe);
        }
        return instance;
    }

}
