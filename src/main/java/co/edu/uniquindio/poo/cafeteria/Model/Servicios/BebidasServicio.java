package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Bebida;
import co.edu.uniquindio.poo.cafeteria.Model.Repository.BebidaRepsitory;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.BebidaValidacion;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class BebidasServicio {
    private BebidaValidacion bebidaValidacion = new BebidaValidacion();
    private BebidaRepsitory bebidasRepsitory = new BebidaRepsitory();

    public void agregarBebida(Bebida bebida){
        List<Bebida> bebidas = bebidasRepsitory.getBebidas();
        if (bebidaValidacion.validarCodigo(bebida, bebidas)){
            bebidasRepsitory.agregarBebida(bebida);
        } else {
            System.out.println("Error : Codigo de bebida ya existente");
        }

    }

    public void eliminarBebida(String codigo){
        bebidasRepsitory.eliminarBebida(codigo);
    }

    public void actualizarBebida(Bebida bebida){
        List<Bebida> bebidas = bebidasRepsitory.getBebidas();
        if (bebidaValidacion.validarCodigo(bebida, bebidas)){
            bebidasRepsitory.actualizarBebida(bebida);
        } else {
            System.out.println("Error : Codigo de bebida no existente");
        }
    }

    public Bebida buscarBebida(String codigo){
        return bebidasRepsitory.buscarBebida(codigo);
    }


}
