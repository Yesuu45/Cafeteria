package co.edu.uniquindio.poo.cafeteria.Model.Pedido;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.EstadoPedido;
import co.edu.uniquindio.poo.cafeteria.Model.Menu.Producto;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Persona;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class Pedido {
    private String codigo;
    private Persona cliente;
    private List<Producto> productos;
    private EstadoPedido estado;

    public Pedido(String codigo, Persona cliente, List<Producto> productos, EstadoPedido estado) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.productos = productos;
        this.estado = estado;
    }
}
