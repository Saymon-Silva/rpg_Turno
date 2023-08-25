package model.armas;

import model.Arma;
import model.Personagem;

public class Machado extends Arma {

    public Machado(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    @Override
    public int habilidade() {
        int danoTrovao = this.getDano() / 2;
        int danoTotal = 0;
        System.out.println("Retorne " + this.getNome());
        System.out.println("Com o despertar do seu " + this.getNome());
        System.out.println("Raios e trovões caem do céu!");
        System.out.println("Na direção do seu inimigo");
        for (int c = 0; c < 3 ; c++){
            System.out.println("Você causou " + danoTrovao);
            danoTotal+= danoTrovao;
        }
        System.out.println("Depois desse ataque seu inimigo fritou até o cerebro!");
        System.out.println("Que nem eu pra pensar nessas habilidades!! kssksk");

        return danoTotal;
    }

    @Override
    public String toString() {
        return "Machado";
    }
}
