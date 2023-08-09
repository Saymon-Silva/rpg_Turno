package model.classes;

import model.Arma;
import model.Classe;

public class Mago extends Classe {

    private Arma arma;

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Mago";
    }
}
