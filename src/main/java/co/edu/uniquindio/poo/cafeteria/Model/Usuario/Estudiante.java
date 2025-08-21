package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.Carrera;

public final class Estudiante extends Persona {
    private static Estudiante instance;
    private Carrera carrera;

    public Estudiante(String nombre, String cedula, String telefono, Carrera carrera) {
        super(nombre, cedula, telefono);
        this.carrera = carrera;
    }

    private static Estudiante getInstance(String nombre, String cedula, String telefono, Carrera carrera) {
        if (instance == null) {
            instance = new Estudiante(nombre, cedula, telefono, carrera);
        }
        return instance;
    }
}
