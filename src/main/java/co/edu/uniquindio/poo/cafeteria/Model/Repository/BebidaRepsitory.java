package co.edu.uniquindio.poo.cafeteria.Model.Repository;

import co.edu.uniquindio.poo.cafeteria.Model.Interface.IRepositoryBebida;
import co.edu.uniquindio.poo.cafeteria.Model.Menu.Bebida;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BebidaRepsitory implements IRepositoryBebida {
    private List<Bebida> bebidas = new ArrayList<>();

    @Override
    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);

    }

    @Override
    public void eliminarBebida(String codigo) {
        bebidas.removeIf(b -> b.getCodigo().equals(codigo));

    }

    @Override
    public void actualizarBebida(Bebida bebida) {
        for(int i = 0 ; i < bebidas.size() ; i ++ ){
            if(bebidas.get(i).getCodigo().equals(bebida.getCodigo())){
                bebidas.set(i, bebida);
                return;
            }
        }

    }

    @Override
    public Bebida buscarBebida(String codigo) {
        return bebidas.stream()
                .filter(b -> b.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}
