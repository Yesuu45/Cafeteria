package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;

import java.util.List;

public class EstudianteValidacion {
    public boolean validarCedula(Estudiante estudiante, List<Estudiante> estudiantes) {
        String cedula = estudiante.getCedula();

        // Validación: no nula ni vacía
        if (cedula == null || cedula.isEmpty()) {
            return false;
        }

        // Validación: solo números
        if (!cedula.matches("\\d+")) {
            return false;
        }

        // Validación: longitud entre 8 y 10 caracteres
        if (cedula.length() < 8 || cedula.length() > 10) {
            return false;
        }

        // Validación: unicidad (ignora el mismo estudiante)
        return estudiantes.stream()
                .noneMatch(e -> !e.equals(estudiante) && e.getCedula().equals(cedula));
    }
}
