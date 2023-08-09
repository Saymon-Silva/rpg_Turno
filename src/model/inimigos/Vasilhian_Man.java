package model.inimigos;

import model.*;

public class Vasilhian_Man extends Inimigo{

    private Arma arma;
    private Classe classe;
    private int dano;
    private int vida;

    public Vasilhian_Man(int vida, int dano) {
        super(vida, dano);
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
        return "Vasilhian_Man : " +
                "arma = " + arma +
                "; classe = " + classe +
                "; dano = " + dano +
                "; vida = " + vida +
                '.';
    }
}
