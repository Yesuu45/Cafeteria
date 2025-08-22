package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Docente;

import java.util.List;

public class DocenteValidacion {

    public boolean validarCedula(Docente docente , List<Docente> docentes) {
        String cedula = docente.getCedula();
        if (cedula == null || cedula.isEmpty()) {
            return false;
        }

        if( !cedula.matches("\\d+")){
            return false;
        }

        // Validación: longitud entre 8 y 10 caracteres
        if (cedula.length() < 8 || cedula.length() > 10) {
            return false;
        }

        // Validación: unicidad (ignora el mismo estudiante)
        return docentes.stream()
                .noneMatch(e -> !e.equals(docente) && e.getCedula().equals(cedula));


    }


}
