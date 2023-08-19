package model;

public abstract class Arma {

    private int dano;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public abstract void habilidade();

    public Arma(int dano){
        this.dano = dano;
    }
}
