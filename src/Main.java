import model.Personagem;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;
import model.classes.Cavaleiro;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Personagem personagem;
    private static int optionForDeath;
    private static Personagem personagemEscolhido;
    private static Personagem personagem1 = new Personagem("Principal",60,30);
     public static void main(String[]args) {
//         personagem1.setClasse(new Cavaleiro().setDano(););
//            adicionar();
            escolherPersonagem();
         System.out.println(personagemEscolhido);
        do{
           menu();
        }while (optionForDeath != 4) ;
}
a
//region(menu)
    public static void menu() {

        System.out.println("""
                    MENU
                1 - CRIAR PERSONAGEM
                2 - VER PERSONAGENS
                3 - BATALHAR
                4 - SAIR
                """);
        optionForDeath = sc.nextInt();

        switch (optionForDeath) {
            case 1:
                int i = 0;
                do {
                    criarPersonagem();
                    i++;
                } while (i != 1);
                break;
            case 2:
                for (Personagem personagem : Personagem.listaPersonagens) {
                    System.out.println(personagem);
                }
                System.out.println("");
                break;
            case 3:
//                escolherPersonagem().combateMortal();
                //escolherPersonagem() criar essa função para o usuario escolher qual personagem quer usar para o combate

                break;
            case 4:
                System.out.println("BYEE!!!\n" +
                        "Good luck on your journey... \n" +
                        "And don't forget to be a good person in that life.");
                break;
            default:
                System.out.println("Insira uma opção valida...");

                break;
        }
    }
//endregion

//    public static void adicionar() {
//        Personagem.listaPersonagens.add(personagem1);
//
//        Personagem.listaPersonagens.add(personagem2);
//    }

//region(escolher personagem)
//    private static Personagem escolherPersonagem() {
//         Personagem personagemEscolhido = null;
//        for ( Personagem personagem : Personagem.listaPersonagens) {
//            System.out.println(personagem);
//        }
//        System.out.println("""
//                Escolha do personagem ( escolha pelo codigo dele )
//                """);
//        int codigo = sc.nextInt();
//        for ( Personagem personagem : Personagem.listaPersonagens ) {
//            if( codigo == personagem.getCodigo(codigo)) {
//                System.out.println("entrei nessa bct");
//                personagem = Personagem.buscarPersonagem(codigo);
//            }
//            else{
//                System.out.println(" Não há nenhum personagem com o codigo: " + codigo );
//            }
//            return personagem;
//        }
//
//        return personagem;
//    }
//endregion
private static Personagem escolherPersonagem() {
    for (Personagem personagem : Personagem.listaPersonagens) {
        System.out.println(personagem);
    }
    System.out.println("");
    System.out.print("""
            Escolha do personagem (escolha pelo codigo dele)
            """);
    int codigo = sc.nextInt();

    for (Personagem personagem : Personagem.listaPersonagens) {
        if (codigo == personagem.getCodigo()) {
            System.out.println("Personagem escolhido: " + personagem);
            personagemEscolhido = personagem;
            return personagemEscolhido;
        }
        System.out.println("Não há nenhum personagem com o codigo: " + codigo);
        return null;
    }

    return null;
}


    //region(funções)
    public static Personagem criarPersonagem() {

        String nome = "";
        int dano = 0, vida = 0;
        int escolhaVD;
        boolean setVD = false;

        System.out.println("Qual o nome do seu personagem? ");
        nome = sc.next();
        do {
            System.out.println("""
                    Escolha de vida e dano
                    1 - Vida = 50; Dano = 30
                    2 - Vida = 60; dano = 20
                    3 - Vida = 55; dano = 25
                    """);
            escolhaVD = sc.nextInt();
            switch (escolhaVD) {
                case 1:
                    vida = 50;
                    dano = 30;
                    setVD = true;
                    break;
                case 2:
                    vida = 60;
                    dano = 20;
                    setVD = true;
                    break;
                case 3:
                    vida = 55;
                    dano = 25;
                    setVD = true;
                    break;
                default:
                    System.out.print("ESCOLHA UMA OPÇÃO VALIDA");
                    // Volta pra escolha de vida e dano
                    break;
            }
        }while(!setVD);


        return new Personagem(nome,dano, vida);
    }

    public static void combateMortal() {//iniciar esse aqui
         int vida = personagem.getVida();
//region(historia do inicio)
        System.out.println("sempre que travar, aperte no '.' e depois no 'enter'");
        System.out.println("Vamos começar...");
        System.out.println("""
                E é assim que sua jornada se inicia...
                          
                Um dia você simplesmente dormiu em sua casa e acordau numa vila cheia de estranhos e distante de todo 
                o restante do mundo. Você se vê preocupado e assustado em meio a essa situação.
                    Perceba que a população dessa vila é rude com você, porém não há motivos.
                """);
        String x = sc.next();
//region(inicio do combate)
        System.out.println("""
                O dia passa num piscar de olhos.
                E você se deita para descansar... E começa a sonhar... Dentro desse sonho, há um corredor branco, totalmente branco
                e você o segue até o que parece ser o final dele.
                Porém encontra uma pequena criatura, horrenda como um pesadelo...
                Ela te ataca...
                 """);
        String a = sc.next();
        Inimigo inimigo1 = new Inimigo(10, 10);
        int vidaImigo = inimigo1.getVida();
        int danoImigo = inimigo1.getDano();
        System.out.println("""
                1 - Revidar
                2 - Ignorar e correr
                """);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você revidou o ataque dela e agora um duelo esta por vir.");
                int escMov;
                do {
                    System.out.println("""
                            1 - Atacar
                            2 - regenerar
                            3 - desisitir
                            """);
                    escMov = sc.nextInt();

                    if (escMov == 1) {
                        vidaImigo -= personagem.atacar();
                        System.out.println("Você atacou e o acertou");
                    } else if (escMov == 2) {
                        vida += 5;
                    } else if (escMov == 3 ){
                        System.out.println("você desistiu!! ");
                        System.out.println("""
                                        Você corre deseperadamente para longe dessa coisa.
                                            Você acorda com medo e suado, sua cama tem sangue... Mas não é seu, aparentemente.
                                        """);
                    }
                    vida -= danoImigo;

                    if (vida <= 0) {
                        System.out.println("""
                                        Seu corpo foi atacado diversas vezes...
                                            Você acorda com medo e suado, sua cama possui sangue... Mas aparentemente não é seu.
                                        """);
                    }
                    if (vidaImigo <= 0) {
                        System.out.println("""
                                Você derrotou a criatura... Porém quando acordou notou que estava com sangue em suas mãos
                                e olhando mais atentamente para o chão você encontrou um pequeno rastro de sangue.
                                """);
                    }
                } while (vida >= 0 || escMov == 3 || vidaImigo >= 0);
                Inimigo inimigo2 = new Inimigo(20, 30);
                int vidaImigo2 = inimigo2.getVida();
                int danoImigo2 = inimigo2.getDano();

                System.out.println("");
        }
//endregion

    }

    //endregion
}
