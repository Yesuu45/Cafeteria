package co.edu.uniquindio.poo.cafeteria.Model.Interface;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Bebida;

public interface IRepositoryBebida {
    public void agregarBebida(Bebida bebida);
    public void eliminarBebida(String codigo);
    public void actualizarBebida(Bebida bebida);
    public Bebida buscarBebida(String codigo);

}
