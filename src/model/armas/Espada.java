package model.armas;

import model.Arma;

public class Espada extends Arma {

    public Espada(int dano) {
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
        return "Espada";
    }
}
