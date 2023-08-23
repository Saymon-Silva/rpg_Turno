package model.armas;

import com.sun.tools.javac.Main;
import model.*;

import java.util.Scanner;

public class Adaga_do_Pagao extends Arma {

    Scanner sc = new Scanner(System.in);


    public Adaga_do_Pagao(int dano) {
        super(dano);
    }

    public int getDano() {
        return super.getDano();
    }

    @Override
    public void setDano(int dano) {
        super.setDano(dano);
    }

    public int habilidade() {
        int danoTotal = 0;
        System.out.println("Desperte PARASITA!!!");
        System.out.println("Sua lamina acorda dos sonhos");
        System.out.println("Sedenda pelo sangue de seus inimigos");
        //conforme seu dano causado, use ele para aumentar temporariamente o dano da sua arma, e ,
        // proibe o inimigo de se curar alem de estar em sangramento continuo (diminuindo seu dano e vida até o sangramento parar(2t))
        System.out.println("O dano da " + toString() + " é de : " + getDano());
        System.out.println("Mas a cada corte que você dá...");
        System.out.println("Ele aumenta!!");
        System.out.println("...");
        int dano = getDano();
        int danoAtual = getDano();
        for(int c = 0 ; c <= 2 ; c++ ) {
            if (c == 0) {
                System.out.println("Você causou : " + dano);
                danoTotal += dano;
            }
            if (c == 1) {
                dano = getDano() + getDano();
                danoTotal += dano;
                System.out.println("Você causou : " + dano);
            } else if (c == 2) {
                dano = getDano() + getDano() + getDano();
                danoTotal += dano;
                System.out.println("Você causou : " + dano);
            }
        }
        System.out.println("Após esse combo de demonstração");
        System.out.println("Sua lamina está pronta para a batalha");
        System.out.println("...");
        System.out.println("Sua lamina se prepara para seu ultimo ataque");
        System.out.println("Você causou : " + dano);

        return danoTotal;
    }

    public String toString() {
        return "Adaga do Pagão";
    }
}