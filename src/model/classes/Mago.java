package model.classes;

import model.Arma;
import model.Classe;

public class Mago extends Classe {

    private Arma arma;

    public Mago(int dano, int maxVida) {
        super(dano, maxVida);
    }

    @Override
    public String toString() {
        return "Mago";
    }
}
