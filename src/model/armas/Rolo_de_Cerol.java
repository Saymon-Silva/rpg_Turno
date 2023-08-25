package model.armas;

import model.*;

public class Rolo_de_Cerol extends Arma{

    public Rolo_de_Cerol(int dano) {
        super(dano);
    }

    @Override
    public int getDano() {
        return super.getDano();
    }

    public int habilidade() {
        int danoCerol = this.getDano() / 2;
        System.out.println("Você ataca seu inimigo");
        System.out.println("Você causou" + danoCerol);
        System.out.println("O corpo do seu inimigo foi rasgado");
        System.out.println("Pelo corpo de seu inimigo só da para ver seu sangue");
        System.out.println("Seu sangue correndo e esvaziando");
        System.out.println("Você deixou seu inimigo dilacerado");
        return danoCerol;
    }

    @Override
    public String toString() {
        return "Rolo de Cerol";
    }
}
