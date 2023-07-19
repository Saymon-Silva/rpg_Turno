package model;

import model.Personagem;

import java.util.ArrayList;

public class Pessoa {
    private static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    private Personagem personagem;
    private String nome;
    private int idade, codigo;
    private static int cont = 0;

//region(get/set)

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public static void setlistaDePessoas(ArrayList<Pessoa> listaDePessoas) {
        Pessoa.listaDePessoas = listaDePessoas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public static ArrayList<Pessoa> getlistaDePessoas() {
        return listaDePessoas;
    }
    //endregion
//region(funções)
    public Pessoa(String nome, int idade, Personagem personagem) {
        this.nome = nome;
        this.idade = idade;
        this.personagem = personagem;
        cont++;
        this.codigo = cont;
    }

    public String listarPersonagens(){
        String jogadores = "";

        for (Pessoa pessoa : listaDePessoas) {
            jogadores += pessoa.toString() + "\n";
        }
        return jogadores;
    }
    public void adicionar(){
        listaDePessoas.add(this);
    }
    public static Pessoa buscarPlayer(int codigo){
        for(Pessoa pessoa : listaDePessoas){
            if(pessoa.codigo == codigo){
                return pessoa;
            }
        }
        return null;
    }

    public String remover(){
        listaDePessoas.remove(this);
        return("\nPlayer removido!!\n");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "personagem=" + personagem +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", codigo=" + codigo +
                '}';
    }

    //endregion
}

