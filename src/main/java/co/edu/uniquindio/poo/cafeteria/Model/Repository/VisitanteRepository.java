package co.edu.uniquindio.poo.cafeteria.Model.Repository;

import co.edu.uniquindio.poo.cafeteria.Model.Interface.IVisitanteRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Visitante;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class VisitanteRepository implements IVisitanteRepository {
    private List<Visitante> visitantes = new ArrayList<>();
    @Override
    public void agregarVisitante(Visitante visitante) {
        visitantes.add(visitante);

    }

    @Override
    public void eliminarVisitante(String cedula) {
        visitantes.removeIf(v -> v.getCedula().equals(cedula));

    }

    @Override
    public void actualizarVisitante(Visitante visitante) {
        for(int i = 0 ; i < visitantes.size() ; i ++ ){
            if(visitantes.get(i).getCedula().equals(visitante.getCedula())){
                visitantes.set(i, visitante);
                return;
            }
        }

    }

    @Override
    public Visitante buscarVisitante(String cedula) {
        return visitantes.stream()
                .filter(v-> v.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }
}
