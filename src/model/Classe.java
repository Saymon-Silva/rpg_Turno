package model;

public abstract class Classe {

    private int maxVida;
    private int dano;
    private String classeNome;

    public Classe(String classeNome, int dano, int maxVida){
        this.dano = dano;
        this.maxVida = maxVida;
        this.classeNome = classeNome;
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
