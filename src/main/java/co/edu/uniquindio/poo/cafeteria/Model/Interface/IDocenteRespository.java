package co.edu.uniquindio.poo.cafeteria.Model.Interface;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Docente;

public interface IDocenteRespository {
    public void agregarDocente(Docente docente );

    public void eliminarDocente(String Cedula);

    public void actualizarDocente(Docente docente);

    public Docente buscarDocente(String cedula);
}
