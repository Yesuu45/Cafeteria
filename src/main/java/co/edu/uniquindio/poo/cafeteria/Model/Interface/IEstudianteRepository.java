package co.edu.uniquindio.poo.cafeteria.Model.Interface;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;

public interface IEstudianteRepository {

    public void agregarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(String Cedula);

    public void actualizarEstudiante(Estudiante estudiante);

    public Estudiante buscarEstudiante(String cedula);

}