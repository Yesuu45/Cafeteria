package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Comida;

import java.util.List;

public class ComidaValidacion {

    public boolean validarCodigo(Comida comida , List<Comida> comidas){

        String codigo = comida.getCodigo();

        if(codigo == null || codigo.isEmpty()){
            return false;
        }

        return comidas.stream()
                .anyMatch(c -> !c.equals(comida) && c.getCodigo().equals(codigo));
    }
}
