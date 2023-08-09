package model.classes;

import model.Arma;
import model.Classe;

public class Arqueiro extends Classe {

    private Arma arma;


    public Arqueiro(int dano, int maxVida) {
    super(dano, maxVida);
    }

    @Override
    public String toString() {
        return "Arqueiro";
    }
}
