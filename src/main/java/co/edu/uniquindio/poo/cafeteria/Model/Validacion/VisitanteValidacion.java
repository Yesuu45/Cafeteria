package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Estudiante;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Visitante;

import java.util.List;


/**
 * Clase que contiene las validaciones para un visitante
 */
public class VisitanteValidacion {

    /**
     * Valida que la cédula del visitante cumpla con los requisitos establecidos y no esté duplicada
     *
     * @param visitante  Visitante a validar
     * @param visitantes Lista de visitantes existentes para validar duplicidad
     * @return true si la cédula es válida, false en caso contrario
     */
    public boolean validarCedula(Visitante visitante, List<Visitante> visitantes) {
        String cedula = visitante.getCedula();

        // Validación: verifica que la cédula no sea nula ni vacía
        if (cedula == null || cedula.isEmpty()) {
            return false;
        }

        // Validación: verifica que la cédula solo contenga números
        if (!cedula.matches("\\d+")) {
            return false;
        }

        // Validación: verifica que la longitud de la cédula esté entre 8 y 10 caracteres
        if (cedula.length() < 8 || cedula.length() > 10) {
            return false;
        }

        // Validación: verifica que la cédula no esté duplicada excluyendo al visitante actual
        return visitantes.stream()
                .noneMatch(e -> !e.equals(visitante) && e.getCedula().equals(cedula));
    }
}