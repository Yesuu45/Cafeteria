package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

import co.edu.uniquindio.poo.cafeteria.Model.Enum.Carrera;

public  class Estudiante extends Persona {

    private Carrera carrera;

    public Estudiante(String nombre, String cedula, String telefono, Carrera carrera) {
        super(nombre, cedula, telefono);
        this.carrera = carrera;
    }

}
