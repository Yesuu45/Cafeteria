package co.edu.uniquindio.poo.cafeteria.Model.Interface;

import co.edu.uniquindio.poo.cafeteria.Model.Pedido.Pedido;

public interface IPedidoRepository {
    public void agregarPedido( Pedido pedido);

    public void eliminarPedido(String codigo);

    public void actualizarPedido(Pedido pedido);

    public Pedido buscarPedido(String codigo);
}
