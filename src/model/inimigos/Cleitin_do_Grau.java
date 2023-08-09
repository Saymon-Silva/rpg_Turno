package model.inimigos;

import model.*;
import model.armas.Rolo_de_Cerol;
import model.classes.Assassino;
import model.classes.Pipeiro;

public class Cleitin_do_Grau extends Inimigo {

//    private static Cleitin_do_Grau cleitin_do_grau = new Cleitin_do_Grau("Clleitin",150,50);

    private Arma arma;
    private Classe classe;
    private String nome = "Cleitin";
    private int dano = 50;
    private int vida = 150;

    public Cleitin_do_Grau(int vida, int dano) {
        super(vida, dano);
        this.arma = new Rolo_de_Cerol(30);
        this.classe = new Pipeiro("Pipeiro");

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

    public String toString() {
        return "Cleitin do Grau : " +
                "arma = " + arma +
                "; classe = " + classe +
                "; dano = " + dano +
                "; vida = " + vida +
                '.';
    }
}
