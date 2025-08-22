package co.edu.uniquindio.poo.cafeteria.ViewController;

import co.edu.uniquindio.poo.cafeteria.App;
import co.edu.uniquindio.poo.cafeteria.Controller.EstudianteController;
import co.edu.uniquindio.poo.cafeteria.Model.Enum.Carrera;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.event.ActionEvent;

@Getter
@Setter

public class EstudianteViewController {

    private App app;

    private EstudianteController estudianteController;

    private final ObservableList<Estudiante> estudiantes = FXCollections.observableArrayList();

    private Estudiante estudianteSeleccionado;

    @FXML
    private TextField txtNombre;

    @FXML
    private TableColumn<Estudiante, String> colCarrera;

    @FXML
    private TableColumn<Estudiante, String> colCedula;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TableView<Estudiante> tablaEstudiantes;

    @FXML
    private TableColumn<Estudiante, String> colNombre;

    @FXML
    private TextField txtCedula;

    @FXML
    private ComboBox<Carrera> cmbCarrera;

    @FXML
    private TableColumn<Estudiante, String> colTelefono;

    @FXML
    void initialize() {
        initTableColumns();
    }

    private void initTableColumns() {
        colNombre.setCellValueFactory(c -> new SimpleStringProperty(nz(c.getValue().getNombre())));
        colCedula.setCellValueFactory(c -> new SimpleStringProperty(nz(c.getValue().getCedula())));
        colCarrera.setCellValueFactory(c -> new SimpleStringProperty(
                c.getValue().getCarrera() == null ? "" : c.getValue().getCarrera().toString()
        ));
        colTelefono.setCellValueFactory(c -> new SimpleStringProperty(nz(c.getValue().getTelefono())));

    }


    private static String nz(String s) {
        return s == null ? "" : s;
    }

    @FXML
    void agregarEstudiante(ActionEvent event) {

    }

    @FXML
    void eliminarEstudiante(ActionEvent event) {

    }

    @FXML
    void buscarEstudiante(ActionEvent event) {

    }

    @FXML
    void limpiarCampos(ActionEvent event) {

    }

}
