package co.edu.uniquindio.poo.cafeteria.Model.Repository;

import co.edu.uniquindio.poo.cafeteria.Model.Interface.IEstudianteRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class EstudianteRepository implements IEstudianteRepository {
    private List<Estudiante> estudiantes = new ArrayList<>();


    @Override
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public void eliminarEstudiante(String Cedula){
        estudiantes.removeIf(estudiantes -> estudiantes.getCedula() == Cedula);
    }


    @Override
    public void actualizarEstudiante(Estudiante estudiante){
        for ( int i = 0 ; i < estudiantes.size() ; i++){
            if(estudiantes.get(i).getCedula()== estudiante.getCedula()){
                estudiantes.set(i, estudiante);
                return;
            }
        }
    }


    @Override
    public Estudiante buscarEstudiante(String cedula){
        return estudiantes.stream().filter(estudiante -> estudiante.getCedula() == cedula).findFirst().orElse(null);

    }


}
