package model.inimigos;

import model.*;

public class Pagao extends Inimigo {

    private Arma arma;
    private Classe classe;
    private int dano;
    private int vida;

    public Pagao(int vida, int dano) {
        super(vida, dano);
        this.arma = arma;
        this.classe = classe;
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
        return "Pagao : " +
                "arma = " + arma +
                "; classe = " + classe +
                "; dano = " + dano +
                "; vida = " + vida +
                '.';
    }
}
