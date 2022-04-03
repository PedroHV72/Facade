package Facade;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AtendenteTest {

    @Test
    void deveRetornarRedirecionamentoRh() {
        Chamada chamada = new Chamada();
        Rh.getInstancia().addChamada(chamada);

        assertEquals(true, chamada.redirecionar());
    }

    @Test
    void deveRetornarRedirecionamentoFinanceiro() {
        Chamada chamada = new Chamada();
        Financeiro.getInstancia().addChamada(chamada);

        assertEquals(true, chamada.redirecionar());
    }

    @Test
    void deveRetornarRedirecionamentoSuporte() {
        Chamada chamada = new Chamada();
        Suporte.getInstancia().addChamada(chamada);

        assertEquals(true, chamada.redirecionar());
    }

    @Test
    void deveRetornarRedirecionamentoSemSetor() {
        Chamada chamada = new Chamada();

        assertEquals(false, chamada.redirecionar());
    }

}
