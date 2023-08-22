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

    public void habilidade(Personagem personagem) {
        System.out.println("Desperte PARASITA!!!");
        System.out.println("Sua lamina acorda de seus sonhos");
        System.out.println("Sedenta por sangue");
        //conforme seu dano causado, use ele para aumentar temporariamente o dano da sua arma, e ,
        // proibe o inimigo de se curar alem de estar em sangramento continuo (diminuindo seu dano e vida até o sangramento parar(2t))
        setDano(getDano() + getDano());
        System.out.println("Seu dano foi dobrado");
    }

    public String toString() {
        return "Adaga do Pagão";
    }
}
