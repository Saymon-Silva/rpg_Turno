package model.inimigos;

import model.Arma;
import model.Classe;
import model.Inimigo;
import model.armas.Adaga_do_Pagao;
import model.classes.Assassino;

public class Pagao extends Inimigo {

    public Pagao(String nome, int vida, int dano) {
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

    public static void criacaoPagao(){
        //facil
        Inimigo pagaoFacil = new Pagao("ẹjẹ", 1100,100);
        pagaoFacil.setClasse(new Assassino(145,200));
        pagaoFacil.setArma(new Adaga_do_Pagao(150));
        pagaoFacil.getArma().setNome("Lati ẹjẹ");

        int vidaInimigopagaoFacil = pagaoFacil.getVida();
        int vidaClassepagaoFacil = pagaoFacil.getClasse().getMaxVida();

        int danoInimigopagaoFacil = pagaoFacil.getDano();
        int danoArmapagaoFacil = pagaoFacil.getDano();
        int danoClassepagaoFacil = pagaoFacil.getClasse().getDano();

        pagaoFacil.setDano(danoInimigopagaoFacil + danoArmapagaoFacil + danoClassepagaoFacil);
        pagaoFacil.setVida(vidaInimigopagaoFacil + vidaClassepagaoFacil);
        listaDeInimigosFacil.add(pagaoFacil);

        //medio
        Inimigo pagao = new Pagao("Keferi", 1800,100);
        pagao.setClasse(new Assassino(145,200));
        pagao.setArma(new Adaga_do_Pagao(150));
        pagao.getArma().setNome("Ọdẹ ẹjẹ");

        int vidaInimigoPagao = pagao.getVida();
        int vidaClassePagao = pagao.getClasse().getMaxVida();

        int danoInimigoPagao = pagao.getDano();
        int danoArmaPagao = pagao.getDano();
        int danoClassePagao = pagao.getClasse().getDano();

        pagao.setDano(danoInimigoPagao + danoArmaPagao + danoClassePagao);
        pagao.setVida(vidaInimigoPagao + vidaClassePagao);
        listaDeInimigosMedio.add(pagao);

        //dificil
        Inimigo pagaoHard = new Pagao("Ipajẹ inu", 1800,100);
        pagaoHard.setClasse(new Assassino(145,200));
        pagaoHard.setArma(new Adaga_do_Pagao(150));
        pagaoHard.getArma().setNome("irora ailopin");

        int vidaInimigoPagaoHard = pagaoHard.getVida();
        int vidaClassePagaoHard = pagaoHard.getClasse().getMaxVida();

        int danoInimigoPagaoHard = pagaoHard.getDano();
        int danoArmaPagaoHard = pagaoHard.getDano();
        int danoClassePagaoHard = pagaoHard.getClasse().getDano();

        pagaoHard.setDano(danoInimigoPagaoHard + danoArmaPagaoHard + danoClassePagaoHard);
        pagaoHard.setVida(vidaInimigoPagaoHard + vidaClassePagaoHard);
        listaDeInimigosDificil.add(pagaoHard);
    }

    @Override
    public int habilidade() {
        return 0;
    }
}
