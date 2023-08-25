package model.armas;

import model.Arma;
import model.Personagem;

public class Cajado extends Arma {

    public Cajado(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public int habilidade() {
        System.out.println(this.getNome() + " acorde e me de sua força");
        System.out.println("Escudo Intangível");
        System.out.println("Quando ativada você não recebe dano");
        return 0;
    }

    @Override
    public String toString() {
        return "Cajado";
    }
}
