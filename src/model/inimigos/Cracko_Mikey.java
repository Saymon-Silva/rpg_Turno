package model.inimigos;

import model.*;
import model.armas.Varinha_de_Condao;

public class Cracko_Mikey extends Inimigo {

    private Arma arma;
    private Classe classe;
    private int dano;
    private int vida;

    public Cracko_Mikey(int vida, int dano) {
        super(vida, dano);
        this.arma = new Varinha_de_Condao(100);
    }

//region(get e set)


    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public Classe getClasse() {
        return classe;
    }

    @Override
    public int getDano() {
        return dano;
    }

    @Override
    public int getVida() {
        return vida;
    }
    //endregion

    @Override
    public String toString() {
        return "Cracko Mikey : " +
                "arma = " + arma +
                "; classe = " + classe +
                "; dano = " + dano +
                "; vida = " + vida +
                '.';
    }
}
