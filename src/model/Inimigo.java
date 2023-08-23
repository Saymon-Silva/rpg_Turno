package model;
import model.*;
import model.Arma;
import model.Classe;
import model.armas.*;
import model.classes.*;

import java.util.ArrayList;

public class Inimigo extends Personagem {

    private static Inimigo inimigo;
    public static ArrayList<Inimigo> listaDeInimigos = new ArrayList<>();
    public static ArrayList<Inimigo> listaDeInimigosFacil = new ArrayList<>();
    public static ArrayList<Inimigo> listaDeInimigosMedio = new ArrayList<>();
    public static ArrayList<Inimigo> listaDeInimigosDificil = new ArrayList<>();
    private Arma arma;
    private Classe classe;
    private int dano;
    private int vida;
    private int codigo;
    private String nome;


    public Inimigo(String nome, int vida, int dano) {
        super(nome,dano,vida);
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.classe = classe;
        this.arma = arma;
        this.codigo = listaDeInimigos.size() + 1;
        listaDeInimigos.add(this);
    }


    //region(set/get)

    public String getNome() {
        return nome;
    }

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

    public int getCodigo() {
        return codigo;
    }

    //endregion
//region(criar personagens)
    public static void criarInimigos(){

        //region(facil)
        //region(criação cleitinFacil do grau)
        Inimigo cleitinFacil = new Inimigo("Cleitin do Grau", 980,100);
        cleitinFacil.setClasse(new Pipeiro(140,150));
        cleitinFacil.setArma(new Rolo_de_Cerol(40));

        int vidaInimigocleitinFacil = cleitinFacil.getVida();
        int vidaClassecleitinFacil = cleitinFacil.getClasse().getMaxVida();

        int danoInimigocleitinFacil = cleitinFacil.getDano();
        int danoArmacleitinFacil = cleitinFacil.getDano();
        int danoClassecleitinFacil = cleitinFacil.getClasse().getDano();

        cleitinFacil.setDano(danoInimigocleitinFacil + danoArmacleitinFacil + danoClassecleitinFacil);
        cleitinFacil.setVida(vidaClassecleitinFacil + vidaInimigocleitinFacil);
        listaDeInimigosFacil.add(cleitinFacil);
        //endregion

        //region(criação mikey da craco)
        Inimigo cracoMikeyFacil = new Inimigo("Mickey da Craco", 760,120);
        cracoMikeyFacil.setClasse(new Mago(200,160));
        cracoMikeyFacil.setArma(new Varinha_de_Condao(150));

        int vidaInimigoMikeyFacil = cracoMikeyFacil.getVida();
        int vidaClasseMikeyFacil = cracoMikeyFacil.getClasse().getMaxVida();

        int danoInimigoMikeyFacil = cracoMikeyFacil.getDano();
        int danoArmaMikeyFacil = cracoMikeyFacil.getDano();
        int danoClasseMikeyFacil = cracoMikeyFacil.getClasse().getDano();

        cracoMikeyFacil.setDano(danoInimigoMikeyFacil + danoArmaMikeyFacil + danoClasseMikeyFacil);
        cracoMikeyFacil.setVida(vidaInimigoMikeyFacil + vidaClasseMikeyFacil);
        listaDeInimigosFacil.add(cracoMikeyFacil);
        //endregion

        //region(criação pagão da viela)
        Inimigo pagaoFacil = new Inimigo("Pagão da viela", 1100,100);
        pagaoFacil.setClasse(new Assassino(145,200));
        pagaoFacil.setArma(new Adaga_do_Pagao(150));

        int vidaInimigopagaoFacil = pagaoFacil.getVida();
        int vidaClassepagaoFacil = pagaoFacil.getClasse().getMaxVida();

        int danoInimigopagaoFacil = pagaoFacil.getDano();
        int danoArmapagaoFacil = pagaoFacil.getDano();
        int danoClassepagaoFacil = pagaoFacil.getClasse().getDano();

        pagaoFacil.setDano(danoInimigopagaoFacil + danoArmapagaoFacil + danoClassepagaoFacil);
        pagaoFacil.setVida(vidaInimigopagaoFacil + vidaClassepagaoFacil);
        listaDeInimigosFacil.add(pagaoFacil);
        //endregion

        //region(criação perry el ornitorrinco)
        Inimigo perryFacil = new Inimigo("Perry o Ornitorrinco", 800,120);
        perryFacil.setClasse(new Agente_P(150,200));
        perryFacil.setArma(new Perry_on_Fire(150));

        int vidaInimigoPerryFacil = perryFacil.getVida();
        int vidaClassePerryFacil = perryFacil.getClasse().getMaxVida();

        int danoInimigoPerryFacil = perryFacil.getDano();
        int danoArmaPerryFacil = perryFacil.getDano();
        int danoClassePerryFacil = perryFacil.getClasse().getDano();

        perryFacil.setDano(danoInimigoPerryFacil + danoArmaPerryFacil + danoClassePerryFacil);
        perryFacil.setVida(vidaInimigoPerryFacil + vidaClassePerryFacil);
        listaDeInimigosFacil.add(perryFacil);
        //endregion

        //region(criação vasilhian man)
        Inimigo vasilinhaFacil = new Inimigo("Vasilhian Man", 1200,30);
        vasilinhaFacil.setClasse(new Medico(0,250));
        vasilinhaFacil.setArma(new Vacin_of_Cloroquina(75));

        int vidaInimigoVasilinhaFacil = vasilinhaFacil.getVida();
        int vidaClasseVasilinhaFacil = vasilinhaFacil.getClasse().getMaxVida();

        int danoInimigoVasilinhaFacil = vasilinhaFacil.getDano();
        int danoArmaVasilinhaFacil = vasilinhaFacil.getDano();
        int danoClasseVasilinhaFacil = vasilinhaFacil.getClasse().getDano();

        vasilinhaFacil.setDano(danoInimigoVasilinhaFacil + danoArmaVasilinhaFacil + danoClasseVasilinhaFacil);
        vasilinhaFacil.setVida(vidaInimigoVasilinhaFacil + vidaClasseVasilinhaFacil);
        listaDeInimigosFacil.add(vasilinhaFacil);
        //endregion
        //endregion
        //region(medio)
        //region(criação cleitin do grau)
        Inimigo cleitin = new Inimigo("Cleitin do Grau", 1460,100);
        cleitin.setClasse(new Pipeiro(140,150));
        cleitin.setArma(new Rolo_de_Cerol(40));

        int vidaInimigoCleitin = cleitin.getVida();
        int vidaClasseCleitin = cleitin.getClasse().getMaxVida();

        int danoInimigoCleitin = cleitin.getDano();
        int danoArmaCleitin = cleitin.getDano();
        int danoClasseCleitin = cleitin.getClasse().getDano();

        cleitin.setDano(danoInimigoCleitin + danoArmaCleitin + danoClasseCleitin);
        cleitin.setVida(vidaClasseCleitin + vidaInimigoCleitin);
        listaDeInimigosMedio.add(cleitin);
        //endregion

        //region(criação mikey da craco)
        Inimigo cracoMikey = new Inimigo("Mickey da Craco", 1350,120);
        cracoMikey.setClasse(new Mago(200,160));
        cracoMikey.setArma(new Varinha_de_Condao(150));

        int vidaInimigoMikey = cracoMikey.getVida();
        int vidaClasseMikey = cracoMikey.getClasse().getMaxVida();

        int danoInimigoMikey = cracoMikey.getDano();
        int danoArmaMikey = cracoMikey.getDano();
        int danoClasseMikey = cracoMikey.getClasse().getDano();

        cracoMikey.setDano(danoInimigoMikey + danoArmaMikey +danoClasseMikey);
        cracoMikey.setVida(vidaInimigoMikey + vidaClasseMikey);
        listaDeInimigosMedio.add(cracoMikey);
        //endregion

        //region(criação pagão da viela)
        Inimigo pagao = new Inimigo("Pagão da vilinha", 1800,100);
        pagao.setClasse(new Assassino(145,200));
        pagao.setArma(new Adaga_do_Pagao(150));

        int vidaInimigoPagao = pagao.getVida();
        int vidaClassePagao = pagao.getClasse().getMaxVida();

        int danoInimigoPagao = pagao.getDano();
        int danoArmaPagao = pagao.getDano();
        int danoClassePagao = pagao.getClasse().getDano();

        pagao.setDano(danoInimigoPagao + danoArmaPagao + danoClassePagao);
        pagao.setVida(vidaInimigoPagao + vidaClassePagao);
        listaDeInimigosMedio.add(pagao);
        //endregion

        //region(criação perry el ornitorrinco)
        Inimigo perry = new Inimigo("Agent Perry", 800,120);
        perry.setClasse(new Agente_P(150,200));
        perry.setArma(new Perry_on_Fire(150));

        int vidaInimigoPerry = perry.getVida();
        int vidaClassePerry = perry.getClasse().getMaxVida();

        int danoInimigoPerry = perry.getDano();
        int danoArmaPerry = perry.getDano();
        int danoClassePerry = perry.getClasse().getDano();

        perry.setDano(danoInimigoPerry + danoArmaPerry + danoClassePerry);
        perry.setVida(vidaInimigoPerry + vidaClassePerry);
        listaDeInimigosMedio.add(perry);
        //endregion

        //region(criação vasilhian man)
        Inimigo vasilinha = new Inimigo("Vasilhian Man", 1800,30);
        vasilinha.setClasse(new Medico(0,250));
        vasilinha.setArma(new Vacin_of_Cloroquina(75));

        int vidaInimigoVasilinha = vasilinha.getVida();
        int vidaClasseVasilinha = vasilinha.getClasse().getMaxVida();

        int danoInimigoVasilinha = vasilinha.getDano();
        int danoArmaVasilinha = vasilinha.getDano();
        int danoClasseVasilinha= vasilinha.getClasse().getDano();

        vasilinha.setDano(danoInimigoVasilinha + danoArmaVasilinha + danoClasseVasilinha);
        vasilinha.setVida(vidaInimigoVasilinha + vidaClasseVasilinha);
        listaDeInimigosMedio.add(vasilinha);
        //endregion
        //endregion
        //region(dificel)
        //region(criação cleitinFacil do grau)
        Inimigo cleitinDificil = new Inimigo("Cleitin da Viela Ensolarada", 2000,100);
        cleitinDificil.setClasse(new Pipeiro(140,150));
        cleitin.setArma(new Rolo_de_Cerol(40));

        int vidaInimigoCleitinDificil = cleitinDificil.getVida();
        int vidaClasseCleitinDificil = cleitinDificil.getClasse().getMaxVida();

        int danoInimigoCleitinDificil = cleitinDificil.getDano();
        int danoArmaCleitinDificil = cleitinDificil.getDano();
        int danoClasseCleitinDificil = cleitinDificil.getClasse().getDano();

        cleitinDificil.setDano(danoInimigoCleitinDificil + danoArmaCleitinDificil + danoClasseCleitinDificil);
        cleitinDificil.setVida(vidaClasseCleitinDificil + vidaInimigoCleitinDificil);
        listaDeInimigosDificil.add(cleitinDificil);
        //endregion

        //region(criação mikey da craco)
        Inimigo cracoMikeyDificel = new Inimigo("EXA Mikey Magic", 1850,120);
        cracoMikeyDificel.setClasse(new Mago(200,160));
        cracoMikeyDificel.setArma(new Varinha_de_Condao(150));

        int vidaInimigoMikeyDificel = cracoMikeyDificel.getVida();
        int vidaClasseMikeyDificel = cracoMikeyDificel.getClasse().getMaxVida();

        int danoInimigoMikeyDificel = cracoMikeyDificel.getDano();
        int danoArmaMikeyDificel = cracoMikeyDificel.getDano();
        int danoClasseMikeyDificel = cracoMikeyDificel.getClasse().getDano();

        cracoMikeyDificel.setDano(danoInimigoMikeyDificel + danoArmaMikeyDificel +danoClasseMikeyDificel);
        cracoMikeyDificel.setVida(vidaInimigoMikeyDificel + vidaClasseMikeyDificel);
        listaDeInimigosDificil.add(cracoMikeyDificel);
        //endregion

        //region(criação pagão da viela)
        Inimigo pagaoHard = new Inimigo("La Pagon del viela", 1800,100);
        pagaoHard.setClasse(new Assassino(145,200));
        pagaoHard.setArma(new Adaga_do_Pagao(150));

        int vidaInimigoPagaoHard = pagaoHard.getVida();
        int vidaClassePagaoHard = pagaoHard.getClasse().getMaxVida();

        int danoInimigoPagaoHard = pagaoHard.getDano();
        int danoArmaPagaoHard = pagaoHard.getDano();
        int danoClassePagaoHard = pagaoHard.getClasse().getDano();

        pagaoHard.setDano(danoInimigoPagaoHard + danoArmaPagaoHard + danoClassePagaoHard);
        pagaoHard.setVida(vidaInimigoPagaoHard + vidaClassePagaoHard);
        listaDeInimigosDificil.add(pagaoHard);
        //endregion

        //region(criação perry el ornitorrinco)
        Inimigo perryFlamejante = new Inimigo("Perry o Flamejador", 2300,120);
        perryFlamejante.setClasse(new Agente_P(150,200));
        perryFlamejante.setArma(new Perry_on_Fire(200));

        int vidaInimigoPerryFlamejante = perryFlamejante.getVida();
        int vidaClassePerryFlamejante = perryFlamejante.getClasse().getMaxVida();

        int danoInimigoPerryFlamejante = perryFlamejante.getDano();
        int danoArmaPerryFlamejante = perryFlamejante.getDano();
        int danoClassePerryFlamejante = perryFlamejante.getClasse().getDano();

        perryFlamejante.setDano(danoInimigoPerryFlamejante + danoArmaPerryFlamejante + danoClassePerryFlamejante);
        perryFlamejante.setVida(vidaInimigoPerryFlamejante + vidaClassePerryFlamejante);
        listaDeInimigosDificil.add(perryFlamejante);
        //endregion

        //region(criação vasilhian man)
        Inimigo vasilinhaDuro = new Inimigo("Cloroquinha Man", 1800,30);
        vasilinhaDuro.setClasse(new Medico(0,250));
        vasilinhaDuro.setArma(new Vacin_of_Cloroquina(75));

        int vidaInimigoVasilinhaDuro = vasilinhaDuro.getVida();
        int vidaClasseVasilinhaDuro = vasilinhaDuro.getClasse().getMaxVida();

        int danoInimigoVasilinhaDuro = vasilinhaDuro.getDano();
        int danoArmaVasilinhaDuro = vasilinhaDuro.getDano();
        int danoClasseVasilinhaDuro = vasilinhaDuro.getClasse().getDano();

        vasilinhaDuro.setDano(danoInimigoVasilinhaDuro + danoArmaVasilinhaDuro + danoClasseVasilinhaDuro);
        vasilinhaDuro.setVida(vidaInimigoVasilinhaDuro + vidaClasseVasilinhaDuro);
        listaDeInimigosDificil.add(vasilinhaDuro);
        //endregion
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
