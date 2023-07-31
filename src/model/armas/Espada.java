package model.armas;

import model.Arma;

public class Espada extends Arma {

    public Espada(int dano) {
        super(40);
    }

    @Override
    public int getDano() {
        return 40;
    }
}
