package model.armas;

import model.Arma;

public class Arco extends Arma{

    private int dano;

    public Arco(int dano) {
        super(25);
    }

    @Override
    public int getDano() {
        return dano;
    }
}
