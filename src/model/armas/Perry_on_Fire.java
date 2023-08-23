package model.armas;

import model.*;

public class Perry_on_Fire extends Arma {

    public Perry_on_Fire(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    public int habilidade() {
        return 0;
    }

    @Override
    public String toString() {
        return "Perry on Flames";
    }
}
