package co.edu.uniquindio.poo.cafeteria.Model.Repository;

import co.edu.uniquindio.poo.cafeteria.Model.Interface.IComidaRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Menu.Comida;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ComidaRepository implements IComidaRepository {
    private List<Comida> comidas = new ArrayList<>();
    @Override
    public void agregarComida(Comida comida) {
        comidas.add(comida);

    }

    @Override
    public void elimnarComida(String codigo) {
        comidas.removeIf(c -> c.getCodigo().equals(codigo));

    }

    @Override
    public void actualizarComida(Comida comida) {
        for(int i = 0 ; i < comidas.size() ; i ++ ){
            if(comidas.get(i).getCodigo().equals(comida.getCodigo())){
                comidas.set(i, comida);
                return;
            }
        }

    }

    @Override
    public Comida buscarComida(String codigo) {
        return comidas.stream()
                .filter(c -> c.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}
