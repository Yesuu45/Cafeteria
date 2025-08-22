package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.Materia;

public  class Docente  extends Persona {
    private Materia materia;

    public Docente(String nombre, String cedula, String telefono, Materia materia) {
        super(nombre, cedula, telefono);
        this.materia = materia;
    }

}
