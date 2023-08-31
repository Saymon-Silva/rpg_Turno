package model;

public abstract class Arma {

    private int dano;
    private String nome;
    public boolean habilidade = false;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract int habilidade();

    public Arma(int dano){
        this.dano = dano;
    }
}
