package model.armas;

import model.Arma;

public class Machado extends Arma {

    public Machado(int dano) {
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
        return "Machado";
    }
}
