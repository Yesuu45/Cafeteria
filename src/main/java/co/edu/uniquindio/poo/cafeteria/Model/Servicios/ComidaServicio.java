package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Comida;
import co.edu.uniquindio.poo.cafeteria.Model.Repository.ComidaRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.ComidaValidacion;

import java.util.List;

public class ComidaServicio {
    private ComidaValidacion comidaValidacion = new ComidaValidacion();
    private ComidaRepository comidaRepository = new ComidaRepository();

    public void agregarComida(Comida comida){
        List<Comida>comidas = comidaRepository.getComidas();
        if(comidaValidacion.validarCodigo(comida,comidas)){
            comidaRepository.agregarComida(comida);
        }else{
            System.out.println("Error : Codigo de comida ya existente");
        }
    }

    public void eliminarComida(String codigo){
        comidaRepository.elimnarComida(codigo);
    }

    public void actualizarComida(Comida comida){
        List<Comida>comidas = comidaRepository.getComidas();
        if(comidaValidacion.validarCodigo(comida,comidas)){
            comidaRepository.actualizarComida(comida);
        }else {
            System.out.println("Error : Codigo de comida no existente");
        }
    }

    public  Comida buscarComida(String codigo){
        return comidaRepository.buscarComida(codigo);
    }

}
