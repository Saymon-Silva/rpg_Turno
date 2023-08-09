package model.armas;

import model.Arma;

public class Arco extends Arma{

    public Arco(String nome) {
        super(40);
    }

    @Override
    public int getDano() {
        return 30;
    }
    @Override
    public String toString() {
        return "Arco";
    }
}
