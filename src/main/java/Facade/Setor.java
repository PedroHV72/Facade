package Facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Chamada> chamada = new ArrayList<Chamada>();

    public void addChamada(Chamada chamada) {
        this.chamada.add(chamada);
    }

    public boolean verificarChamada(Chamada chamada) {
        return this.chamada.contains(chamada);
    }

}
