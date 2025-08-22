package co.edu.uniquindio.poo.cafeteria.Model.Repository;


import co.edu.uniquindio.poo.cafeteria.Model.Interface.IDocenteRespository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Docente;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DocenteRepository implements IDocenteRespository {
    private List<Docente> docentes = new ArrayList<>();

    @Override
    public void agregarDocente(Docente docente) {
        docentes.add(docente);

    }

    @Override
    public void eliminarDocente(String Cedula) {
        docentes.removeIf(d -> d.getCedula().equals(Cedula));

    }

    @Override
    public void actualizarDocente(Docente docente) {
        for(int i = 0; i>= docentes.size(); i++){
            if(docentes.get(i).getCedula().equals(docente.getCedula())){
                docentes.set(i, docente);
                return;
            }
        }

    }

    @Override
    public Docente buscarDocente(String cedula) {
        return docentes.stream()
                .filter(d -> d.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }
}
