package Facade;

public class Suporte extends Setor {

    private static Suporte suporte = new Suporte();

    private Suporte() {};

    public static Suporte getInstancia() {
        return suporte;
    }
}
