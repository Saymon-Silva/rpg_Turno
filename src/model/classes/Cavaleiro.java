package model.classes;

import model.Arma;
import model.Classe;

public class Cavaleiro extends Classe {

    private Arma arma;

    public Cavaleiro(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Cavaleiro";
    }
}