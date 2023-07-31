package model;

public class Inimigo {

    private int dano;
    private int vida;

    public Inimigo(int vida, int dano){
        this.vida = vida;
        this.dano = dano;
    }

//region(set/get)
    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public int getVida() {
        return vida;
    }
//endregion
}
