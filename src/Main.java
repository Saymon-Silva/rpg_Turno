import model.Personagem;

import java.util.Scanner;
import model.*;
import model.classes.Arqueiro;

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
                criarPersonagem().adicionar();
                break;
            case 2:
                System.out.println(pessoa.listarPersonagens());
                break;
            case 3:
                combateMortal();
                break;
            case 4:
                System.out.println("BYEE!!!\n" +
                        "Good luck on your journey... \n" +
                        "And don't forget to be a good person in that life.");
                break;
            default:
                System.out.println("Insira uma opção valida...");
                menu();
                break;
        }
    }
    //endregion

    //region(funções)
    public static Pessoa criarPersonagem() {

        String nome = "";
        int idade = 0, cont = 0;

        System.out.println("Qual o nome do seu personagem? ");
        nome = sc.next();
        System.out.println("insira sua idade: ");
        idade = sc.nextInt();
        Personagem personagem = criarPersonagem().getPersonagem();

        return new Pessoa(nome,idade,personagem);
    }

    public static void combateMortal(){//iniciar esse aqui
//fazer uns sout ai dentro pro usuario escrever, só pra ler a historia
//region(historia do inicio)
        System.out.println("sempre que travar, aperte no '.' e depois no 'enter'");
        System.out.println("Vamos começar...");
        System.out.println("""
                E é assim que sua jornada se inicia...
          
                Um dia você simplesmente dormiu em sua casa e acordau numa vila cheia de estranhos e distante de todo 
                o restante do mundo. Você se ve preocupado e assustado em meio a essa situação.
                    Perceba que a população dessa vila é rude com você, porém não há motivos.
                """);
        String x = sc.next();
//region(inicio do combate)
        System.out.println("""
               Você se deita para descansar... E começa a sonhar... Dentro desse sonho, há um corredor branco, totalmente branco
               e você o segue até o que parece ser o final dele.
               Porém encontra uma pequena criatura, horrenda como um pesadelo...
               Ela te ataca...
                """);
        String a
        Inimigo inimigo1 = new Inimigo(10,10);




//endregion

    }
    //endregion
}

