module co.edu.uniquindio.poo.cafeteria {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires co.edu.uniquindio.poo.cafeteria;
    requires java.desktop;


    opens co.edu.uniquindio.poo.cafeteria to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteria;
    exports co.edu.uniquindio.poo.cafeteria.Model;
    opens co.edu.uniquindio.poo.cafeteria.Model to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteria.Model.Usuario;
    opens co.edu.uniquindio.poo.cafeteria.Model.Usuario to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteria.Model.Menu;
    opens co.edu.uniquindio.poo.cafeteria.Model.Menu to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteria.Controller;
    opens co.edu.uniquindio.poo.cafeteria.Controller to javafx.fxml;
    exports co.edu.uniquindio.poo.cafeteria.ViewController;
    opens co.edu.uniquindio.poo.cafeteria.ViewController to javafx.fxml;
}