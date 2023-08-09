package model.classes;

import model.Arma;
import model.Classe;

public class Cavaleiro extends Classe {

    private Arma arma;

    public Cavaleiro(int dano, int maxVida) {
        super(dano,maxVida);
    }

    @Override
    public String toString() {
        return "Cavaleiro";
    }
}