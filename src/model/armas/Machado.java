package model.armas;

import model.Arma;

public class Machado extends Arma {

    private int dano;
    public Machado(int dano) {
        super(30);
    }

    @Override
    public int getDano() {
        return dano;
    }
}
