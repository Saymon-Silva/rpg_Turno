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
        int danoFogo = this.getDano() * 2;
        System.out.println("Você cansou de brincar com seu inimigo!");
        System.out.println(this.getNome() + " Queime vossos inimigos!!");
        System.out.println("Você torrou seu inimigo");
        //queimadura dx o inimigo recebendo dano;
        return danoFogo;
    }

    @Override
    public String toString() {
        return "Perry on Flames";
    }
}
