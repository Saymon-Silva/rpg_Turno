package model.armas;

import model.*;

public class Vacin_of_Cloroquina extends Arma{

    private int dano;

    public Vacin_of_Cloroquina(int dano) {
        super(dano);
    }
    //mas se levar dois ataques você morre de ataque no coração;

    @Override
    public int getDano() {
        return super.getDano();
    }

    public int habilidade() {
        int danoCeringa = this.getDano();

        System.out.println("Você acerta um ataque em seu inimigo!");
        System.out.println("Você causou " + danoCeringa);
        System.out.println("Você percebeu que ele não gostou muito dessa seringada");
        System.out.println("Tente três vezes para ver o que acontece!");

        return danoCeringa;
    }
    public static int habilidadeCura(){
        int cura = 1000;
        System.out.println("Você injeta o liquido da seringa em você");
        System.out.println("O medo toma conta de você quando percebe que nada mudou");
        System.out.println("Seu corpo começa a convulsionar!!");
        System.out.println("Mas percebe que está totalmente 0 denovo!");
        System.out.println("Você recebeu +" + cura + " de vida");
        return cura;
    }

    public static void meusPesames(){
        System.out.println("Após todas essas seringadas...");
        System.out.println("Seu inimigo cai duro no chão");
        System.out.println("sem deixar rastros algum");
        System.out.println("Mas o estranho...");
        System.out.println("Ele morreu rindo, caiu em meio a um sonho lucido");
        System.out.println("Como se tivesse ido para outro mundo.");
    }

    @Override
    public String toString() {
        return "Vacina de Cloroquina";
    }

}
