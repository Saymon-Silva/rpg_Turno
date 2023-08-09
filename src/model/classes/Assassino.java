package model.classes;

import model.*;

public class Assassino extends Classe {

    private Arma arma;

    public Assassino(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Assassino";
    }
}
