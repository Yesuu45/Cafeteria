package co.edu.uniquindio.poo.cafeteria;

import co.edu.uniquindio.poo.cafeteria.Model.Cafeteria;
import co.edu.uniquindio.poo.cafeteria.Model.Menu.Bebida;
import co.edu.uniquindio.poo.cafeteria.Model.Menu.Producto;
import co.edu.uniquindio.poo.cafeteria.Model.Servicios.BebidasServicio;
import co.edu.uniquindio.poo.cafeteria.Model.Servicios.PedidoServicio;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Cafeteria cafeteria = Cafeteria.getInstance();

        BebidasServicio bebidasServicio = new BebidasServicio();

        bebidasServicio.agregarBebida(new Bebida("Fanta",12121,21,"211212","Bebida saborisada ","Gaseosa "));


    }
}
