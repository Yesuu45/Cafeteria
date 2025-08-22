package co.edu.uniquindio.poo.cafeteria.Model.Interface;

import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Visitante;

public interface IVisitanteRepository {

    public void agregarVisitante(Visitante vivistante);

    public void eliminarVisitante(String cedula);

    public void actualizarVisitante(Visitante visitante);

    public Visitante buscarVisitante(String cedula);
}
