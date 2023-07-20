package model;

public abstract class Arma {

    private int dano;
    private String nome;

    public int getDano() {
        return dano;
    }

    public String getNome() {
        return nome;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Arma(String nome, int dano){
        this.dano = dano;
        this.nome = nome;
    }
}
