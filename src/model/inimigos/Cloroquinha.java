package model.inimigos;

import model.Arma;
import model.Classe;
import model.Inimigo;
import model.armas.Vacin_of_Cloroquina;
import model.classes.Medico;

public class Cloroquinha extends Inimigo {

    public Cloroquinha(String nome, int vida, int dano) {
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

    public static void criacaoCloroquinha(){
        //facil
        Inimigo vasilinhaFacil = new Cloroquinha("Cloroquinha", 1200,30);
        vasilinhaFacil.setClasse(new Medico(0,250));
        vasilinhaFacil.setArma(new Vacin_of_Cloroquina(75));
        vasilinhaFacil.getArma().setNome("Vacininha do Cloroquina");

        int vidaInimigoVasilinhaFacil = vasilinhaFacil.getVida();
        int vidaClasseVasilinhaFacil = vasilinhaFacil.getClasse().getMaxVida();

        int danoInimigoVasilinhaFacil = vasilinhaFacil.getDano();
        int danoArmaVasilinhaFacil = vasilinhaFacil.getDano();
        int danoClasseVasilinhaFacil = vasilinhaFacil.getClasse().getDano();

        vasilinhaFacil.setDano(danoInimigoVasilinhaFacil + danoArmaVasilinhaFacil + danoClasseVasilinhaFacil);
        vasilinhaFacil.setVida(vidaInimigoVasilinhaFacil + vidaClasseVasilinhaFacil);
        listaDeInimigosFacil.add(vasilinhaFacil);

        //medio
        Inimigo vasilinha = new Cloroquinha("Dyn Vasilaidd", 1800,30);
        vasilinha.setClasse(new Medico(0,250));
        vasilinha.setArma(new Vacin_of_Cloroquina(75));
        vasilinha.getArma().setNome("Iachâd Caredigrwydd");

        int vidaInimigoVasilinha = vasilinha.getVida();
        int vidaClasseVasilinha = vasilinha.getClasse().getMaxVida();

        int danoInimigoVasilinha = vasilinha.getDano();
        int danoArmaVasilinha = vasilinha.getDano();
        int danoClasseVasilinha= vasilinha.getClasse().getDano();

        vasilinha.setDano(danoInimigoVasilinha + danoArmaVasilinha + danoClasseVasilinha);
        vasilinha.setVida(vidaInimigoVasilinha + vidaClasseVasilinha);

        //dificil
        Inimigo vasilinhaDuro = new Cloroquinha("Inimigo do povo", 1800,30);
        vasilinhaDuro.setClasse(new Medico(0,250));
        vasilinhaDuro.setArma(new Vacin_of_Cloroquina(75));
        vasilinhaDuro.getArma().setNome("Dos Coovid-991");

        int vidaInimigoVasilinhaDuro = vasilinhaDuro.getVida();
        int vidaClasseVasilinhaDuro = vasilinhaDuro.getClasse().getMaxVida();

        int danoInimigoVasilinhaDuro = vasilinhaDuro.getDano();
        int danoArmaVasilinhaDuro = vasilinhaDuro.getDano();
        int danoClasseVasilinhaDuro = vasilinhaDuro.getClasse().getDano();

        vasilinhaDuro.setDano(danoInimigoVasilinhaDuro + danoArmaVasilinhaDuro + danoClasseVasilinhaDuro);
        vasilinhaDuro.setVida(vidaInimigoVasilinhaDuro + vidaClasseVasilinhaDuro);
        listaDeInimigosDificil.add(vasilinhaDuro);

    }

    @Override
    public int habilidade() {
        return 0;
    }
}
