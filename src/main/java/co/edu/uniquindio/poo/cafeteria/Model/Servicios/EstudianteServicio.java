package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Repository.EstudianteRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.EstudianteValidacion;

import java.util.List;

public class EstudianteServicio {

    private final EstudianteValidacion estudianteValidacion = new EstudianteValidacion();
    private final EstudianteRepository estudianteRepository = new EstudianteRepository();

    public boolean agregarEstudiante(Estudiante estudiante) {
        List<Estudiante> estudiantes = estudianteRepository.getEstudiantes();
        if (estudianteValidacion.validarCedula(estudiante, estudiantes)) {
            estudianteRepository.agregarEstudiante(estudiante);
            return true;
        }
        System.out.println("Error: Cédula inválida o ya existe otro estudiante con la misma cédula.");
        return false;
    }

    public boolean eliminarEstudiante(String cedula) {
        Estudiante e = estudianteRepository.buscarEstudiante(cedula);
        if (e != null) {
            estudianteRepository.eliminarEstudiante(cedula);
            return true;
        }
        return false;
    }

    public boolean actualizarEstudiante(Estudiante estudiante) {
        List<Estudiante> estudiantes = estudianteRepository.getEstudiantes();
        if (estudianteValidacion.validarCedula(estudiante, estudiantes)) {
            estudianteRepository.actualizarEstudiante(estudiante);
            return true;
        }
        System.out.println("Error: No se puede actualizar. La cédula es inválida o ya está en uso.");
        return false;
    }

    public Estudiante buscarEstudiante(String cedula) {
        return estudianteRepository.buscarEstudiante(cedula);
    }


    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.obtenerTodos();
    }

}
