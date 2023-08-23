package model.armas;

import model.Arma;
import model.Personagem;

public class Arco extends Arma{

    public Arco(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public int habilidade() {
        return 0;
    }

    @Override
    public String toString() {
        return "Arco";
    }
}
