package model.inimigos;

import model.Arma;
import model.Classe;
import model.Inimigo;
import model.armas.*;
import model.classes.*;

public class Mikey extends Inimigo {

    public Mikey(String nome, int vida, int dano) {
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

    public static void criacaoMikey(){
        //facil
        Inimigo mikeyFacil = new Mikey("Mikey mai i te 10", 760,120);
        mikeyFacil.setClasse(new Mago(200,160));
        mikeyFacil.setArma(new Varinha_de_Condao(150));
        mikeyFacil.getArma().setNome("Atchiim");

        int vidaInimigoMikeyFacil = mikeyFacil.getVida();
        int vidaClasseMikeyFacil = mikeyFacil.getClasse().getMaxVida();

        int danoInimigoMikeyFacil = mikeyFacil.getDano();
        int danoArmaMikeyFacil = mikeyFacil.getDano();
        int danoClasseMikeyFacil = mikeyFacil.getClasse().getDano();

        mikeyFacil.setDano(danoInimigoMikeyFacil + danoArmaMikeyFacil + danoClasseMikeyFacil);
        mikeyFacil.setVida(vidaInimigoMikeyFacil + vidaClasseMikeyFacil);
        listaDeInimigosFacil.add(mikeyFacil);

        //medio
        Inimigo mikey = new Mikey("Maikin whakapono V.L", 1350,120);
        mikey.setClasse(new Mago(200,160));
        mikey.setArma(new Varinha_de_Condao(150));
        mikey.getArma().setNome("Fé-tilizador");

        int vidaInimigoMikey = mikey.getVida();
        int vidaClasseMikey = mikey.getClasse().getMaxVida();

        int danoInimigoMikey = mikey.getDano();
        int danoArmaMikey = mikey.getDano();
        int danoClasseMikey = mikey.getClasse().getDano();

        mikey.setDano(danoInimigoMikey + danoArmaMikey +danoClasseMikey);
        mikey.setVida(vidaInimigoMikey + vidaClasseMikey);
        listaDeInimigosMedio.add(mikey);

        //dificil
        Inimigo MikeyDificel = new Mikey("EXA Mikey Magic", 1850,120);
        MikeyDificel.setClasse(new Mago(200,160));
        MikeyDificel.setArma(new Varinha_de_Condao(150));
        mikey.getArma().setNome("Varinha de Condão");

        int vidaInimigoMikeyDificel = MikeyDificel.getVida();
        int vidaClasseMikeyDificel = MikeyDificel.getClasse().getMaxVida();

        int danoInimigoMikeyDificel = MikeyDificel.getDano();
        int danoArmaMikeyDificel = MikeyDificel.getDano();
        int danoClasseMikeyDificel = MikeyDificel.getClasse().getDano();

        MikeyDificel.setDano(danoInimigoMikeyDificel + danoArmaMikeyDificel +danoClasseMikeyDificel);
        MikeyDificel.setVida(vidaInimigoMikeyDificel + vidaClasseMikeyDificel);
        listaDeInimigosDificil.add(MikeyDificel);
    }

    @Override
    public int habilidade() {
        return 0;
    }
}
