package model;

import java.util.ArrayList;

public class Personagem {

    private ArrayList<Personagem> listaPersonagens = new ArrayList<Personagem>();
    private int vida;
    private int dano;
    private String nome;
    private int idade;

//region(get/set)
    public int getDano() {
        return dano;
    }

    public int getVida() {
        return vida;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaPersonagens(ArrayList<Personagem> listaPersonagens) {
        this.listaPersonagens = listaPersonagens;
    }
//endregion

    public Personagem(){
        this.nome = nome;
        this.idade = idade;
        this.vida = vida;
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                " nome='" + nome + '\'' +
                ", idade=" + idade +
                ", vida=" + vida +
                ", dano=" + dano +
                '}';
    }
}
