package model;

public abstract class Arma {

    private int dano;
    private String nome;
    public boolean habilidadeAdagaDoPagao = false;
    public int contHabilidadeDoPagao = 3; //usa pra parar a cura do inimigo;
    public boolean habilidadeArco = false;
    public int contHabilidadeDoArco = 3;
    public int danoVenenoHabilidadeArco;
    public boolean habilidadeCajado = false;
    public int contHabilidadeDoCajado;
    public boolean habilidadeEspada = false;
    public int danoHabilidadeEspada;
    public boolean habilidadeMachado = false;
    public boolean habilidadePerryOnFire = false;
    public int danoHabilidadePerry;
    public int contHabillidadeDoPerry = 3;
    public boolean habilidadeRoloDeCerol = false;
    public int contHabillidadeDoCerol = 3;
    public int danoSangramentoHabilidadeCerol;
    public boolean habilidadeVacinOfCloroquiha = false;
    public int contHabilidadeVacina = 3;
    public boolean habilidadeVarinhaDeCondao = false;

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
