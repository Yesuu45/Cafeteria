package co.edu.uniquindio.poo.cafeteria.Model.Interface;

import co.edu.uniquindio.poo.cafeteria.Model.Menu.Comida;

public interface IComidaRepository {

    public void agregarComida( Comida comida);

    public void elimnarComida(String codigo);

    public void actualizarComida( Comida comida);

    public Comida buscarComida(String codigo );
}
