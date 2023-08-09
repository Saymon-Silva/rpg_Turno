package model.armas;

import model.*;

public class Vacin_of_Cloroquina extends Arma{

    private int dano;

    public Vacin_of_Cloroquina(int dano) {
        super(dano);
    }
    //mas se levar dois ataques você morre de ataque no coração;

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public String toString() {
        return "Vacin of Cloroquina";
    }

}
