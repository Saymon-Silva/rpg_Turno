package model.classes;

import model.Arma;
import model.Classe;

public class Barbaro extends Classe{

    private Arma arma;

    public Barbaro(int dano, int maxVida) {
        super(dano, maxVida);
    }
    @Override
    public String toString() {
        return "Barbaro";
    }
}
