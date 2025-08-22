package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Pedido.Pedido;

import java.util.List;

public class PediddoValidacion {

    public boolean validarCodigoPedido(Pedido pedido , List<Pedido> pedidos){

        String codigo = pedido.getCodigo();
        if(codigo == null || codigo.isEmpty()){
            return false;
        }

        return pedidos.stream()
                .anyMatch(p -> !p.equals(pedido) && p.getCodigo().equals(codigo));
    }
}
