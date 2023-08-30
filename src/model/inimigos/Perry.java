package model.inimigos;

import model.Arma;
import model.Classe;
import model.Inimigo;
import model.armas.Perry_on_Fire;
import model.classes.Agente_P;

public class Perry extends Inimigo {

    public Perry(String nome, int vida, int dano) {
        super(nome, vida, dano);
    }

    //region(get/set)
    @Override
    public int getDano() {
        return super.getDano();
    }
    @Override
    public Arma getArma() {
        return super.getArma();
    }
    @Override
    public Classe getClasse() {
        return super.getClasse();
    }
    @Override
    public int getCodigo() {
        return super.getCodigo();
    }
    @Override
    public int getVida() {
        return super.getVida();
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    //endregion

    public static void criacaoPerry(){
        //facil
        Inimigo perryFacil = new Perry("Perry l'ornitorinco", 800,120);
        perryFacil.setClasse(new Agente_P(150,200));
        perryFacil.setArma(new Perry_on_Fire(150));
        perryFacil.getArma().setNome("pistola stordente");

        int vidaInimigoPerryFacil = perryFacil.getVida();
        int vidaClassePerryFacil = perryFacil.getClasse().getMaxVida();

        int danoInimigoPerryFacil = perryFacil.getDano();
        int danoArmaPerryFacil = perryFacil.getDano();
        int danoClassePerryFacil = perryFacil.getClasse().getDano();

        perryFacil.setDano(danoInimigoPerryFacil + danoArmaPerryFacil + danoClassePerryFacil);
        perryFacil.setVida(vidaInimigoPerryFacil + vidaClassePerryFacil);
        listaDeInimigosFacil.add(perryFacil);

        //medio
        Inimigo perry = new Perry("007 Perry", 800,120);
        perry.setClasse(new Agente_P(150,200));
        perry.setArma(new Perry_on_Fire(150));
        perry.getArma().setNome("raggio perryzator");

        int vidaInimigoPerry = perry.getVida();
        int vidaClassePerry = perry.getClasse().getMaxVida();

        int danoInimigoPerry = perry.getDano();
        int danoArmaPerry = perry.getDano();
        int danoClassePerry = perry.getClasse().getDano();

        perry.setDano(danoInimigoPerry + danoArmaPerry + danoClassePerry);
        perry.setVida(vidaInimigoPerry + vidaClassePerry);
        listaDeInimigosMedio.add(perry);

        //dificil
        Inimigo perryFlamejante = new Perry("Perry il Fiammeggiante", 2300,120);
        perryFlamejante.setClasse(new Agente_P(150,200));
        perryFlamejante.setArma(new Perry_on_Fire(200));
        perryFlamejante.getArma().setNome("bruciatore di filo");

        int vidaInimigoPerryFlamejante = perryFlamejante.getVida();
        int vidaClassePerryFlamejante = perryFlamejante.getClasse().getMaxVida();

        int danoInimigoPerryFlamejante = perryFlamejante.getDano();
        int danoArmaPerryFlamejante = perryFlamejante.getDano();
        int danoClassePerryFlamejante = perryFlamejante.getClasse().getDano();

        perryFlamejante.setDano(danoInimigoPerryFlamejante + danoArmaPerryFlamejante + danoClassePerryFlamejante);
        perryFlamejante.setVida(vidaInimigoPerryFlamejante + vidaClassePerryFlamejante);
        listaDeInimigosDificil.add(perryFlamejante);

    }

    @Override
    public int habilidade() {
        return 0;
    }
}
