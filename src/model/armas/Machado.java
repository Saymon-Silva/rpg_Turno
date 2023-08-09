package model.armas;

import model.Arma;

public class Machado extends Arma {

    public Machado(String nome) {
        super(50);
    }

    @Override
    public int getDano() {
        return 50;
    }
    @Override
    public String toString() {
        return "Machado";
    }
}
