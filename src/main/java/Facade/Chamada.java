package Facade;

public class Chamada {

    public boolean redirecionar() {
        return ChamadaFacade.verificarRedirecionamento(this);
    }

}
