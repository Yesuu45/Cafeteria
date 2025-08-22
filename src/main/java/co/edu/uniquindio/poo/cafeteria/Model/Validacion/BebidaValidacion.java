package co.edu.uniquindio.poo.cafeteria.Model.Validacion;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Bebida;

import java.util.List;

public class BebidaValidacion {

    public boolean validarCodigo(Bebida bebida, List<Bebida> bebidas){

        String codigo = bebida.getCodigo();

        if(codigo == null || codigo.isEmpty()){
            return false;
        }

        return bebidas.stream()
                .noneMatch(b -> !b.equals(bebida) && b.getCodigo().equals(codigo));
    }
}
