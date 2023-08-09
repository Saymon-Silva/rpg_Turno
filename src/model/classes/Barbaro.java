package model.classes;

import model.Arma;
import model.Classe;

public class Barbaro extends Classe{

    private Arma arma;

    public Barbaro(String nome) {
super(nome);
    }
    @Override
    public String toString() {
        return "Barbaro";
    }

}
