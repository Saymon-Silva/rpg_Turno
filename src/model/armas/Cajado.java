package model.armas;

import model.Arma;

public class Cajado extends Arma {

    public Cajado() {
        super(75);
    }

    @Override
    public int getDano() {
        return 75;
    }
}
