package co.edu.uniquindio.poo.cafeteria.Controller;

import co.edu.uniquindio.poo.cafeteria.Model.Servicios.EstudianteServicio;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;

import java.util.List;
import java.util.Objects;

public class EstudianteController {


    private final EstudianteServicio estudianteServicio = new EstudianteServicio();



    public boolean agregarEstudiante(Estudiante estudiante) {
        Objects.requireNonNull(estudiante, "El estudiante no puede ser null");
        return estudianteServicio.agregarEstudiante(estudiante);
    }

    public boolean eliminarEstudiante(String cedula){
        return estudianteServicio.eliminarEstudiante(cedula);
    }

    public boolean actualizarEstudiante(Estudiante estudiante){
        return estudianteServicio.actualizarEstudiante(estudiante);
    }
    public Estudiante buscarEstudiante(String cedula){
        return estudianteServicio.buscarEstudiante(cedula);
    }
    public List<Estudiante> obtenerTodos() {
        return estudianteServicio.obtenerTodos();
    }


}
