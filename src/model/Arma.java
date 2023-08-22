package model;

public abstract class Arma {

    private int dano;
    Personagem personagem;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public abstract void habilidade(Personagem personagem);

    public Arma(int dano){
        this.dano = dano;
    }
}
