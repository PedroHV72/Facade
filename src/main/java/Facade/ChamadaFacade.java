package Facade;

public class ChamadaFacade {

    public static boolean verificarRedirecionamento(Chamada chamada) {
        if (Suporte.getInstancia().verificarChamada(chamada)) {
            return true;
        }
        if (Rh.getInstancia().verificarChamada(chamada)) {
            return true;
        }
        if (Financeiro.getInstancia().verificarChamada(chamada)) {
            return true;
        }
        return false;
    }

}
