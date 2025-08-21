package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;

    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }
}
