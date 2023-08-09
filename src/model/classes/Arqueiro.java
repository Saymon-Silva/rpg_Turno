package model.classes;

import model.Arma;
import model.Classe;

public class Arqueiro extends Classe {

    private Arma arma;

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Arqueiro";
    }
}
