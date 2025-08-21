package co.edu.uniquindio.poo.cafeteria.Model.Menu;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.TipoEmpanada;

public final class Empanada extends Producto{
    private static Empanada instance;
    private TipoEmpanada tipoEmpanada;
    public Empanada(String nombre, double precio, int cantidad, String descripcion, TipoEmpanada tipoEmpanada) {
        super(nombre, precio, cantidad, descripcion);
        this.tipoEmpanada = tipoEmpanada;
    }

    public static Empanada getInstance(String nombre, double precio, int cantidad, String descripcion, TipoEmpanada tipoEmpanada) {
        if(instance == null){
            instance = new Empanada(nombre, precio, cantidad, descripcion, tipoEmpanada);
        }
        return instance;

    }

}
