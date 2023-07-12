package model;

public abstract class Classe {

    private int maxVida;
    private int dano;

    public Classe(int maxVida,int dano){
        this.dano = dano;
        this.maxVida = maxVida;
    }
//region (get/set)
    public int getDano() {
        return dano;
    }

    public int getMaxVida() {
        return maxVida;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setMaxVida(int maxVida) {
        this.maxVida = maxVida;
    }
//endregion
}
