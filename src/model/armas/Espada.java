package model.armas;

import model.Arma;
import model.Personagem;

public class Espada extends Arma {

    public Espada(int dano) {
        super(dano);
    }


    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public void habilidade(Personagem personagem) {

    }

    public void habilidade() {

    }

    @Override
    public String toString() {
        return "Espada";
    }
}
