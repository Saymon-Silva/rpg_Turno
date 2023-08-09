package model.classes;

import model.*;

public class Pipeiro extends Classe{

    private Arma arma;

    public Pipeiro(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Pipeiro";
    }
}
