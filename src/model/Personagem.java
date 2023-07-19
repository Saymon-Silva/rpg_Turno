package model;

import java.util.ArrayList;

public abstract class Personagem {

    private ArrayList<Personagem> listaPersonagens = new ArrayList<Personagem>();
    private Pessoa pessoa;
    private Classe classe;
    private Arma arma;

    private int vida;
    private int dano;
    private String nome;
    private int idade;
    private int codigo;

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

    public int getCodigo() {
        return codigo;
    }

    public Classe getClasse() {
        return classe;
    }

    public Pessoa getPessoa() {
        return pessoa;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setListaPersonagens(ArrayList<Personagem> listaPersonagens) {
        this.listaPersonagens = listaPersonagens;
    }
//endregion

    public Personagem(Classe classe, String nome) {
        this.classe = classe;
        this.nome = nome;
        this.vida = classe.getMaxVida();
        this.codigo = listaPersonagens.size() + 1;
    }


}
