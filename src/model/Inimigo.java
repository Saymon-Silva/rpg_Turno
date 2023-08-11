package model;
import model.*;
import model.Arma;
import model.Classe;
import model.armas.*;
import model.classes.*;

import java.util.ArrayList;

public class Inimigo {

    private static Inimigo inimigo;
    public static ArrayList<Inimigo> listaDeInimigos = new ArrayList<>();
    private Arma arma;
    private Classe classe;
    private int dano;
    private int vida;
    private int codigo;
    private String nome;


    public Inimigo(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.classe = classe;
        this.arma = arma;
        this.codigo = listaDeInimigos.size() + 1;
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
    public static void criarInimigos(){

        //region(facil)
        //endregion
        //region(medio)
        //region(criação cleitin do grau)
        Inimigo cleitin = new Inimigo("Cleitin do Grau", 700,100);
        cleitin.setClasse(new Pipeiro(140,150));
        cleitin.setArma(new Rolo_de_Cerol(40));

        int vidaInimigoCleitin = cleitin.getVida();
        int vidaClasseCleitin = cleitin.getClasse().getMaxVida();

        int danoInimigoCleitin = cleitin.getDano();
        int danoArmaCleitin = cleitin.getDano();
        int danoClasseCleitin = cleitin.getClasse().getDano();

        cleitin.setDano((danoInimigoCleitin * 0) + danoInimigoCleitin + danoArmaCleitin + danoClasseCleitin);
        cleitin.setVida((vidaInimigoCleitin * 0) + vidaClasseCleitin + vidaInimigoCleitin);
        //endregion

        //region(criação mikey da craco)
        Inimigo cracoMikey = new Inimigo("Mickey da Craco", 800,120);
        cracoMikey.setClasse(new Mago(200,160));
        cracoMikey.setArma(new Varinha_de_Condao(150));

        int vidaInimigoMikey = cracoMikey.getVida();
        int vidaClasseMikey = cracoMikey.getClasse().getMaxVida();

        int danoInimigoMikey = cracoMikey.getDano();
        int danoArmaMikey = cracoMikey.getDano();
        int danoClasseMikey = cracoMikey.getClasse().getDano();

        cracoMikey.setDano(( danoInimigoMikey * 0) +  danoInimigoMikey + danoArmaMikey +danoClasseMikey);
        cracoMikey.setVida((vidaInimigoMikey * 0) + vidaInimigoMikey + vidaClasseMikey);
        //endregion

        //region(criação pagão da viela)
        Inimigo pagao = new Inimigo("Pagão da viela", 700,100);
        pagao.setClasse(new Assassino(145,200));
        pagao.setArma(new Adaga_do_Pagao(150));

        int vidaInimigoPagao = pagao.getVida();
        int vidaClassePagao = pagao.getClasse().getMaxVida();

        int danoInimigoPagao = pagao.getDano();
        int danoArmaPagao = pagao.getDano();
        int danoClassePagao = pagao.getClasse().getDano();

        pagao.setDano((danoInimigoPagao * 0) + danoInimigoPagao + danoArmaPagao + danoClassePagao);
        pagao.setVida((vidaInimigoPagao * 0) +  vidaInimigoPagao + vidaClassePagao);
        //endregion

        //region(criação perry el ornitorrinco)
        Inimigo perry = new Inimigo("Perry o Ornitorrinco", 800,120);
        perry.setClasse(new Agente_P(150,200));
        perry.setArma(new Perry_on_Fire(150));

        int vidaInimigoPerry = perry.getVida();
        int vidaClassePerry = perry.getClasse().getMaxVida();

        int danoInimigoPerry = perry.getDano();
        int danoArmaPerry = perry.getDano();
        int danoClassePerry = perry.getClasse().getDano();

        perry.setDano((danoInimigoPerry * 0) + danoInimigoPerry + danoArmaPerry + danoClassePerry);
        perry.setVida((vidaInimigoPerry * 0) +  vidaInimigoPerry + vidaClassePerry);
        //endregion

        //region(criação vasilhian man)
        Inimigo vasilinha = new Inimigo("Vasilhian Man", 1000,30);
        vasilinha.setClasse(new Medico(0,250));
        vasilinha.setArma(new Vacin_of_Cloroquina(75));

        int vidaInimigoVasilinha = vasilinha.getVida();
        int vidaClasseVasilinha = vasilinha.getClasse().getMaxVida();

        int danoInimigoVasilinha = vasilinha.getDano();
        int danoArmaVasilinha = vasilinha.getDano();
        int danoClasseVasilinha= vasilinha.getClasse().getDano();

        vasilinha.setDano((danoInimigoVasilinha * 0) + danoInimigoVasilinha + danoArmaVasilinha + danoClasseVasilinha);
        vasilinha.setVida((vidaInimigoVasilinha * 0) +  vidaInimigoVasilinha + vidaClasseVasilinha);
        //endregion
        //endregion
        //region(dificel)
        //endregion
    }
//endregion

        @Override
        public String toString() {
            return "Inimigo : " + nome +
                    "; classe = " + classe +
                    "; arma = " + arma +
                    "; dano = " + dano +
                    "; vida = " + vida +
                    '.';
        }

    }
