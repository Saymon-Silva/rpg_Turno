package model.armas;

import model.Arma;

public class Arco extends Arma{

    public Arco() {
        super(40);
    }

    @Override
    public int getDano() {
        return 30;
    }
}
