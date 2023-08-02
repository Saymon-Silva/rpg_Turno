import model.Personagem;

import java.util.Scanner;
import model.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Pessoa pessoa;
    private static Personagem personagem;
    private static int optionForDeath;

     public static void main(String[]args) {

        do{
           menu();
        }while (optionForDeath != 4) ;
}
//region(menu)
    public static void menu(){

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
                    criarPersonagem().adicionar();
                    i++;
                }while(i != 1);
                menu();
                break;
            case 2:
                System.out.println(pessoa.listarPersonagens());
                break;
            case 3:
                combateMortal();
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

    //region(funções)
    public static Pessoa criarPersonagem() {

        String nome = "";
        int idade = 0;

        System.out.println("Qual o nome do seu personagem? ");
        nome = sc.next();
        System.out.println("insira sua idade: ");
        idade = sc.nextInt();
        Personagem personagem = criarPersonagem().getPersonagem();

        return new Pessoa(nome,idade,personagem);
    }

    public static void combateMortal() {//iniciar esse aqui
         int vida = pessoa.getPersonagem().getVida();
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
                        vidaImigo -= pessoa.atacar();
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
aaaa

