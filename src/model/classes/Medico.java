package model.classes;

import model.Classe;

public class Medico extends Classe {
    public Medico(int dano, int maxVida) {
        super(dano, maxVida);
    }

    @Override
    public String toString() {
        return "Médico pirado";
    }
}
