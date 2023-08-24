package model.armas;

import model.Arma;
import model.Personagem;

public class Espada extends Arma {

    public Espada(int dano) {
        super(dano);
    }


    @Override
    public int getDano() {
        return super.getDano();
    }

    public int habilidade() {
        int danoMeteoro = getDano() / 5;
        int danoTotal = 0;
        System.out.println("Chuva de Meteoros!!");
        System.out.println("A habilidade de sua arma foi ativada!!");
        System.out.println("A cada ataque que você dá caem milhoes de meteoritos");
        System.out.println("Mas esse meteoritos não tem rota");
        System.out.println("Você ataca seu inimigo");
        for(int c = 0; c < 5; c++) {
            System.out.println("Você causou : " + danoMeteoro);
            danoTotal += danoMeteoro;
            if (c == 3 ) {
                System.out.println("Você recebeu : " + danoMeteoro);
            }
            if(c == 5){
                System.out.println("Você recebeu : " + danoMeteoro);
            }
        }
        return danoTotal;
    }

    @Override
    public String toString() {
        return "Espada";
    }
}
