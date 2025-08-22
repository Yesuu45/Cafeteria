package co.edu.uniquindio.poo.cafeteria.Model.Repository;

import co.edu.uniquindio.poo.cafeteria.Model.Interface.IPedidoRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Pedido.Pedido;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class PedidoRepository implements IPedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);


    }

    @Override
    public void eliminarPedido(String codigo) {
        pedidos.removeIf(p -> p.getCodigo().equals(codigo));


    }

    @Override
    public void actualizarPedido(Pedido pedido) {
        for(int i = 0; i < pedidos.size(); i++){
            if(pedidos.get(i).getCodigo().equals(pedido.getCodigo())){
                pedidos.set(i, pedido);
                return;
            }
        }

    }

    @Override
    public Pedido buscarPedido(String codigo) {
        return pedidos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}
