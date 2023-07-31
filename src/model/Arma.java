package model;

public abstract class Arma {

    private int dano;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Arma(int dano){
        this.dano = dano;
    }
}
