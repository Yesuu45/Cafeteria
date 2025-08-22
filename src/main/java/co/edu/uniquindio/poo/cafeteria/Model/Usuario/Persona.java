package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa una Persona en el sistema de la cafetería
 */
@Getter
@Setter
public class Persona {
    /**
     * Nombre completo de la persona
     */
    private String nombre;

    /**
     * Número de cédula que identifica a la persona
     */
    private String cedula;

    /**
     * Número de teléfono de contacto de la persona
     */
    private String telefono;

    /**
     * Constructor para crear una nueva Persona
     *
     * @param nombre   Nombre completo de la persona
     * @param cedula   Número de cédula de la persona
     * @param telefono Número de teléfono de la persona
     */
    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }
}