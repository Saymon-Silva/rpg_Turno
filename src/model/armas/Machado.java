package model.armas;

import model.Arma;
import model.Personagem;

public class Machado extends Arma {

    public Machado(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public int habilidade() {
        System.out.println("Retorne " + this.getNome());
    return 0;
    }



    @Override
    public String toString() {
        return "Machado";
    }
}
