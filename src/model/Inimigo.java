package model;

import model.armas.Adaga_do_Pagao;
import model.classes.Assassino;
import model.inimigos.Pagao;

import java.util.ArrayList;

public abstract class Inimigo {

    private Inimigo inimigo;
    private ArrayList<Inimigo> listaDeInimigos = new ArrayList<>();
    private Arma arma;
    private Classe classe;
    private int dano;
    private int vida;

    public Inimigo(int vida, int dano) {
        this.vida = vida + this.getClasse().getMaxVida();
        this.dano = dano + this.getClasse().getDano();
        this.classe = classe;
        this.arma = arma;
        listaDeInimigos.add(this);
    }


    //region(set/get)
    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public int getVida() {
        return vida;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    //endregion
//region(criar personagens)

//endregion

        @Override
        public String toString() {
            return "Inimigo : " +
                    "classe = " + classe +
                    "; arma = " + arma +
                    "; dano = " + dano +
                    "; vida = " + vida +
                    '.';
        }

    }
