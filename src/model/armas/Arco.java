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
        int dano = getDano();
        System.out.println("Você desperta o poder obscuro do " + this.getNome());
        System.out.println("Acerte... Flecha del Veneno!");
        System.out.println("Você causou : " + getDano());
        System.out.println("No sangue do seu inimigo está correndo seu veneno");
        return dano;
    }

    @Override
    public String toString() {
        return "Arco";
    }
}
