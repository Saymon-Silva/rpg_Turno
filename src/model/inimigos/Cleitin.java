package model.inimigos;

import model.Arma;
import model.Classe;
import model.Inimigo;
import model.armas.*;
import model.classes.*;

public class Cleitin extends Inimigo {


    public Cleitin(String nome, int vida, int dano) {
        super(nome, vida, dano);
    }

    //region(get/set)
    @Override
    public int getDano() {
        return super.getDano();
    }
    @Override
    public Arma getArma() {
        return super.getArma();
    }
    @Override
    public Classe getClasse() {
        return super.getClasse();
    }
    @Override
    public int getCodigo() {
        return super.getCodigo();
    }
    @Override
    public int getVida() {
        return super.getVida();
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    //endregion

    public static void criacaoCleitin(){
        //facil
        Inimigo cleitinFacil = new Cleitin("Cleitin del Callejón Soleado", 980,100);
        cleitinFacil.setClasse(new Pipeiro(140,150));
        cleitinFacil.setArma(new Rolo_de_Cerol(40));
        cleitinFacil.getArma().setNome("Cerolzin");

        int vidaInimigocleitinFacil = cleitinFacil.getVida();
        int vidaClassecleitinFacil = cleitinFacil.getClasse().getMaxVida();

        int danoInimigocleitinFacil = cleitinFacil.getDano();
        int danoArmacleitinFacil = cleitinFacil.getDano();
        int danoClassecleitinFacil = cleitinFacil.getClasse().getDano();

        cleitinFacil.setDano(danoInimigocleitinFacil + danoArmacleitinFacil + danoClassecleitinFacil);
        cleitinFacil.setVida(vidaClassecleitinFacil + vidaInimigocleitinFacil);
        listaDeInimigosFacil.add(cleitinFacil);

        //medio
        Inimigo cleitin = new Cleitin("Cleitinho del Grado", 1460,100);
        cleitin.setClasse(new Pipeiro(140,150));
        cleitin.setArma(new Rolo_de_Cerol(40));
        cleitin.getArma().setNome("ffenest cwarel");

        int vidaInimigoCleitin = cleitin.getVida();
        int vidaClasseCleitin = cleitin.getClasse().getMaxVida();

        int danoInimigoCleitin = cleitin.getDano();
        int danoArmaCleitin = cleitin.getDano();
        int danoClasseCleitin = cleitin.getClasse().getDano();

        cleitin.setDano(danoInimigoCleitin + danoArmaCleitin + danoClasseCleitin);
        cleitin.setVida(vidaClasseCleitin + vidaInimigoCleitin);
        listaDeInimigosMedio.add(cleitin);

        //dificil
        Inimigo cleitinDificil = new Cleitin("Cleitin del callejón oscuro", 2000,100);
        cleitinDificil.setClasse(new Pipeiro(140,150));
        cleitin.setArma(new Rolo_de_Cerol(40));
        cleitinDificil.getArma().setNome("boi poenus");

        int vidaInimigoCleitinDificil = cleitinDificil.getVida();
        int vidaClasseCleitinDificil = cleitinDificil.getClasse().getMaxVida();

        int danoInimigoCleitinDificil = cleitinDificil.getDano();
        int danoArmaCleitinDificil = cleitinDificil.getDano();
        int danoClasseCleitinDificil = cleitinDificil.getClasse().getDano();

        cleitinDificil.setDano(danoInimigoCleitinDificil + danoArmaCleitinDificil + danoClasseCleitinDificil);
        cleitinDificil.setVida(vidaClasseCleitinDificil + vidaInimigoCleitinDificil);
        listaDeInimigosDificil.add(cleitinDificil);
    }

    @Override
    public int habilidade() {
        System.out.println();
        return 0;
    }
}
