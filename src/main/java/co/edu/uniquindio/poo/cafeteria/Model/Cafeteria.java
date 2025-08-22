package co.edu.uniquindio.poo.cafeteria.Model;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Producto;
import co.edu.uniquindio.poo.cafeteria.Model.Pedido.Pedido;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Docente;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Visitante;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public final class Cafeteria {
    private static Cafeteria instance;
    public static final String NOMBRE = "Cafetería UQ"; // ✅ Nombre constante

    private  List<Producto> productos;
    private  List<Pedido> pedidos;
    private  List<Docente> docentes;
    private  List<Estudiante> estudiantes;
    private  List<Visitante> visitantes;

    // ✅ Constructor privado
    private Cafeteria() {
        this.productos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    // ✅ Singleton
    public static Cafeteria getInstance() {
        if (instance == null) {
            instance = new Cafeteria();
        }
        return instance;
    }
}
