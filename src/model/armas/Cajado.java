package model.armas;

import model.Arma;

public class Cajado extends Arma {

    public Cajado(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    public void habilidade() {

    }

    @Override
    public String toString() {
        return "Cajado";
    }
}
