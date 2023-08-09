package model.armas;

import model.Arma;

public class Espada extends Arma {

    public Espada(String nome) {
        super(40);
    }


    @Override
    public int getDano() {
        return 40;
    }
    @Override
    public String toString() {
        return "Espada";
    }
}
