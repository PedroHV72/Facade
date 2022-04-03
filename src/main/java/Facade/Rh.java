package Facade;

public class Rh extends Setor {

    private static Rh rh = new Rh();

    private Rh() {};

    public static Rh getInstancia() {
        return rh;
    }
}
