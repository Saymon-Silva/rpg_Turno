package model.classes;

import model.*;

public class Assassino extends Classe {

    private Arma arma;

    public Assassino(int dano, int maxVida) {
        super(dano, maxVida);
    }

    @Override
    public String toString() {
        return "Assassino";
    }
}
