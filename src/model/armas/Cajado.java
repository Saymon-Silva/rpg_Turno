package model.armas;

import model.Arma;

public class Cajado extends Arma {

    public Cajado(String nome) {
        super(75);
    }

    @Override
    public int getDano() {
        return 75;
    }

    @Override
    public String toString() {
        return "Cajado";
    }
}
