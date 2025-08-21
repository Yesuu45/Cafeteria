package co.edu.uniquindio.poo.cafeteria.Model.Usuario;

public final  class Visitante extends Persona {
    private static Visitante instance;

    public Visitante(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
    }

    private static Visitante getIstance(String nombre , String cedula , String telefono){
        if(instance == null){
            instance = new Visitante(nombre, cedula, telefono);

        }
        return instance;
    }


}
