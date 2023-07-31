package model.armas;

import model.Arma;

public class Machado extends Arma {

    public Machado(int dano) {
        super(50);
    }

    @Override
    public int getDano() {
        return 50;
    }
}
