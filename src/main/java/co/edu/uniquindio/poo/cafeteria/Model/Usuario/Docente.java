package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.Materia;

public final class Docente  extends Persona {
    private static Docente instance;
    private Materia materia;

    public Docente(String nombre, String cedula, String telefono, Materia materia) {
        super(nombre, cedula, telefono);
        this.materia = materia;
    }

    private static Docente getInstance(String nombre, String cedula, String telefono, Materia materia) {
        if (instance == null) {
            instance = new Docente(nombre, cedula, telefono, materia);
        }
        return instance;

    }
}
