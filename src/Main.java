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
        int idade = 0;

        System.out.println("Quantos personagens você deseja criar? ");
        int opcaoQuan = sc.nextInt();

        if (opcaoQuan <= 0) {
            System.out.println("Como desejar... \n\n\n");
            System.out.println("""
                        Você deseja voltar ao menu principal?
                    1 - Sim
                    2 - Não
                    """);
            int opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("""
                                        Deseja reiniciar a criação do personagem?
                                        1 - Sim
                                        2 - não
                                        """);
                    int opcaoFreshOrBack = sc.nextInt();
                    if (opcaoFreshOrBack == 1) {
                        criarPersonagem();
                    } else if (opcaoFreshOrBack == 2) {
                        System.out.println("Então adeus... Pô não sei oque fazer aqui...");
                        //
                        System.out.println("Escreva suas revelações... ");
                        String nota = sc.next();
                        //
                        System.out.println("\n\n");
                        //
                        System.out.println("Qual o maior numero que você conhece??");
                        int numerPegadin = sc.nextInt();
                        //
                        System.out.println("Você caiu na maldição do GRANDE CARLOS HENRIQUE!...");
                        for (int j = 0; j <= numerPegadin; j++) {//uso  do numerPegadin pra utilizar como parametro no for.
                            for (int g = 0; g <= 2; g++) {
                                System.out.println("VOCÊÊÊÊÊ");
                            }
                            for (int h = 0; h <= 2; h++) {
                                System.out.println("CORRAA!!!!");
                            }
                            for (int l = 0; l <= 2; l++) {
                                System.out.println("""
                                        NÃO SE ESQUEÇA PEQUENO HUMANO...
                                        A PACIÊNCIA DE TODOS POSSUI UM LIMITE...
                                        """);
                            }
                            for (int p = 0; p <= 3; p++) {
                                System.out.println("KKKKKKKKKK\n");
                            }
                        }
                        System.out.println("""
                                Agora deu...
                                Adeus ksksksks.
                                Volte ao menu inicial.
                                """);
                        menu();
                    }
                    else{
                        System.out.println("Insira um valor valido!!");
                    }
                    break;
                default:
                    System.out.println("insira um valor valido!!");
                    break;
            }
        }
        else {
            for (int ala = 0; ala < opcaoQuan; ala++) {
                System.out.println("Qual o nome do seu personagem? ");
                nome = sc.next();
                System.out.println("insira sua idade: ");
                idade = sc.nextInt();
                Personagem personagem = criarPersonagem().getPersonagem();
            }
        }
        return new Pessoa(nome,idade,personagem);
    }

    public static void combateMortal(){//iniciar esse aqui
//fazer uns sout ai dentro pro usuario escrever, só pra ler a historia
//region(historia do inicio)
        System.out.println("Vamos começar...");
        System.out.println("Escreva sua ultima palavra");
        String klo = sc.next();
        for(int j = 0; j <= 2; j++){
            System.out.println("----------------");
            System.out.println("|----|----|----|");
            System.out.println("----------------");
        }
        System.out.println("Qual seu nome pequeno humano? \n");
        String nomePeq = sc.next();
        System.out.println("""
                E é assim que sua grande jornada se inicia...""" + nomePeq +
                """
                    A lenda do grande calice de fogo, um item unico neste pequeno mundo...
                    Um artefato capaz de realizar a maior ambição de todos...
                """);
        System.out.println("Preparado? " + nomePeq + "\n");
        String answer = sc.next();

        for(int h = 0; h <= 3; h++){
            System.out.println("PAM PAM PAM!");
            if (h == 3) {
                System.out.println("A IMORTALIDADE!.");
            }
        }

        System.out.println("\n\n");
//endregion
//region(escolher classe)
        System.out.println("""
                Escolha sua classe
                1 - Arqueiro
                2 - Barbaro
                3 - Cavaleiro
                4 - Mago
                """);
        int classeEscolha = sc.nextInt();

        switch(classeEscolha){
            case 1:
                pessoa.getPersonagem().setClasse(Arqueiro, );
                break;

        }

//endregion
//region(escolher arma)
        System.out.println("""
                Escolha sua arma:
                1 - Arco
                2 - Cajado
                """);

//endregion
//a
    }
    //endregion
}

