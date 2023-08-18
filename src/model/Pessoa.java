package model;

import java.util.ArrayList;

public class Pessoa {
    public static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    public static ArrayList <Personagem> listaDePersonagens = new ArrayList<>();
    public static Pessoa pessoa;
    private String nome;
    private int idade, codigo;
    private String senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Personagem> getListaDePersonagens() {
        return listaDePersonagens;
    }

//    public Personagem getPersonagem() {
//        return personagem;
//    }
//
//    public void setPersonagem(Personagem personagem) {
//        this.personagem = personagem;
//    }
//o get e set para o personagem
    public static ArrayList<Pessoa> getlistaDePessoas() {
        return listaDePessoas;
    }
    //endregion
//region(funções)
    public Pessoa(String nome, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
//        this.personagem = personagem;

        this.codigo = listaDePessoas.size() + 1;
        listaDePessoas.add(this);
    }

    public String listarPersonagens(){
        String jogadores = "";

        for (Pessoa pessoa : listaDePessoas) {
            jogadores += pessoa.toString() + "\n";
        }
        return jogadores;
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
        return  nome + " : codigo = " + codigo;
    }

//    public int atacar(){
//        return getPersonagem().getDano();
//    }

    //endregion
}

