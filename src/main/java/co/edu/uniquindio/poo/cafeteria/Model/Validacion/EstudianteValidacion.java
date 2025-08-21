package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;

public class EstudianteValidacion {
    public boolean validarCedula(Estudiante estudiante){
        return estudiante.getNombre()  != null && estudiante.getTelefono().length() == 10;
    }
}
