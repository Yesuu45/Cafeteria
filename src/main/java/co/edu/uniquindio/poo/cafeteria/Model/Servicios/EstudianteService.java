package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Repository.EstudianteRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.EstudianteValidacion;

public class EstudianteService {
    private EstudianteValidacion estudianteValidacion = new EstudianteValidacion() ;
    private EstudianteRepository estudianteRepository = new EstudianteRepository();


    public void agregarEstudiante(Estudiante estudiante){
        if(estudianteValidacion.validarCedula(estudiante)){
            estudianteRepository.agregarEstudiante(estudiante);
        }
    }

    public void eliminarEstudiante(String Cedula){
        estudianteRepository.eliminarEstudiante(Cedula);
    }

    public void actualizarEstudiante(Estudiante estudiante){
        if(estudianteValidacion.validarCedula(estudiante)){
            estudianteRepository.actualizarEstudiante(estudiante);
        }
    }

    public Estudiante buscarEstudiante(String cedula){
        return estudianteRepository.buscarEstudiante(cedula);
    }
}
