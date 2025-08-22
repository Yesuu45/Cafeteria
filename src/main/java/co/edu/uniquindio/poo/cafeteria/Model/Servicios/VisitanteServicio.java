package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Repository.VisitanteRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Visitante;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.VisitanteValidacion;

import java.util.List;

public class VisitanteServicio {
    private VisitanteRepository visitanteRepository= new VisitanteRepository();
    private VisitanteValidacion visitanteValidacion = new VisitanteValidacion();

    public void agregarVisitante(Visitante visitante){
        List<Visitante> visitantes = visitanteRepository.getVisitantes();
        if(visitanteValidacion.validarCedula(visitante,visitantes)){
            visitanteRepository.agregarVisitante(visitante);
        }else {
            System.out.println("Error : Cedula ya existente");
        }
    }

    public void eliminarVisitante(String cedula){
        visitanteRepository.eliminarVisitante(cedula);
    }

    public void actualizarVisitante(Visitante visitante){
        List<Visitante> visitantes = visitanteRepository.getVisitantes();
        if(visitanteValidacion.validarCedula(visitante,visitantes)){
            visitanteRepository.actualizarVisitante(visitante);
        }else{
            System.out.println("Error : Cedula no existente");
        }
    }

    public Visitante buscarVisitante(String cedula){
        return visitanteRepository.buscarVisitante(cedula);
    }


}
