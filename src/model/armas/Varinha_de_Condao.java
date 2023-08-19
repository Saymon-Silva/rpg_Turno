package model.armas;

import model.*;

public class Varinha_de_Condao extends Arma {


    public Varinha_de_Condao(int dano) {
        super(dano);
    }
    //leva três ataques fica com alucinações e tonto(pt vai seer dificel)(tlvx diminua o dano e/ou deixe ele como seu amigo durante pouco tempo(usa pra helar))

    @Override
    public int getDano() {
        return super.getDano();
    }

    public void habilidade() {

    }

    @Override
    public String toString() {
        return "Varinha de Condão";
    }

}
