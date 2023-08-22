package model.armas;

import model.*;

public class Rolo_de_Cerol extends Arma{

    public Rolo_de_Cerol(int dano) {
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
        return "Rolo de Cerol";
    }
}
