package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Pedido.Pedido;
import co.edu.uniquindio.poo.cafeteria.Model.Repository.PedidoRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.PediddoValidacion;

import java.util.List;

public class PedidoServicio {
    private PedidoRepository pedidoRepository = new PedidoRepository();
    private PediddoValidacion pediddoValidacion = new PediddoValidacion();

    public void agregarPedido(Pedido pedido){
        List<Pedido>pedidos = pedidoRepository.getPedidos();
        if(pediddoValidacion.validarCodigoPedido(pedido,pedidos)){
            pedidoRepository.agregarPedido(pedido);
        }else{
            System.out.println("Error : Codigo de pedido ya existente");
        }
    }

    public Pedido buscarPedido(String codigo){
        return pedidoRepository.buscarPedido(codigo);
    }
    public void eliminarPedido(String codigo){
        pedidoRepository.eliminarPedido(codigo);
    }

    public void actualizarPedido(Pedido pedido){
        List<Pedido>pedidos = pedidoRepository.getPedidos();
        if(pediddoValidacion.validarCodigoPedido(pedido,pedidos)){
            pedidoRepository.actualizarPedido(pedido);
        }else{
            System.out.println("Error : Codigo de pedido ya existente");
        }
    }
}
