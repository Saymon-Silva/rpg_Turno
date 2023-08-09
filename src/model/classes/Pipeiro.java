package model.classes;

import model.*;

public class Pipeiro extends Classe{

    private Arma arma;

    public Pipeiro(int dano, int maxVida) {
        super(dano,maxVida);
    }
    public String toString() {
        return "Pipeiro";
    }
}
