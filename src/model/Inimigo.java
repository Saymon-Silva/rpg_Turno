package model;
import model.*;
import model.Arma;
import model.Classe;
import model.armas.*;
import model.classes.*;
import model.inimigos.*;

import java.util.ArrayList;

public abstract class Inimigo{

    public Inimigo inimigo;
    public static ArrayList<Inimigo> listaDeInimigos = new ArrayList<>();//aqui estão todos eles, no modo de escolha para batalha, um treinin eles tao ai
    public static ArrayList<Inimigo> listaDeInimigosFacil = new ArrayList<>();//como o nome diz (facil)
    public static ArrayList<Inimigo> listaDeInimigosMedio = new ArrayList<>();//como o nome diz (medio)
    public static ArrayList<Inimigo> listaDeInimigosDificil = new ArrayList<>();//como o nome diz (dificil)
    public static ArrayList<Inimigo> listaDeInimigosModoBatalha = new ArrayList<>();//vai receber outra lista dentro
    //essa ta sendo usada pra setar os inimigos que você quer batalhar...
    // Usada no main (modo escolha de inimigos
    //vai ser usada para colocar os inimigos das outras listas dentro dessa, o usuario escolhe o inimigo e a lista dele vai pra dentro (facil, medio ou dificel).
    //understood
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
        Cleitin.criacaoCleitin();
        Cloroquinha.criacaoCloroquinha();
        Mikey.criacaoMikey();
        Pagao.criacaoPagao();
        Perry.criacaoPerry();
    }
//endregion

    public abstract int habilidade();

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
