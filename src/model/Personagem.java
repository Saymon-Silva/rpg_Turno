package model;

import model.armas.Cajado;
import model.armas.Machado;

import java.util.ArrayList;

public class Personagem {

    public static ArrayList<Personagem> listaPersonagens = new ArrayList<>();

    private Classe classe;
    private Arma arma;

    private int vida;
    private int dano;
    private String nome;
    private int idade;
    private int codigo;
//region(get/set)


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public int getDano() {
        return dano;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Classe getClasse() {
        return classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
//endregion
//region(funções)
    public Personagem(String nome,int idade, int vida, int dano) {
        this.classe = classe;
        this.arma= arma;
        this.nome = nome;
        this.vida = vida;
        this.idade = idade;
        this.dano = dano;
        this.codigo = listaPersonagens.size() +1 ;
        listaPersonagens.add(this);
    }

    public static Personagem buscarPersonagem(int codigo){
        for(Personagem personagem : listaPersonagens){
            if(personagem.codigo == codigo){
                return personagem;
            }
        }
        return null;
    }

    public String listarPersonagens(){
        String jogadores = "";

        for ( Personagem personagem : listaPersonagens) {
            jogadores += personagem.toString() + "\n";
        }
        return jogadores;
    }

    public String remover(){
        listaPersonagens.remove(this);
        return("Personagem removido com sucesso");
    }

    public int atacar(){
        return this.getDano();
    }
//endregion
    //CRIAR UM PEROSNAGEM PERSONAGEM, COM VIDA E DANO PRE DEFINIDOS.


    @Override
    public String toString() {
        return "Personagem : " + nome +
                " : " + codigo + " : " +
                " Classe = " + classe +
                "; Arma = " + arma +
                "; Idade = " + idade +
                "; Dano = " + dano +
                "; Vida = " + vida +
                ".";
    }
    //pputa merda meu bom tudo dando errado tmnc cartakhi fikha da oyra

}
