import model.Personagem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private ArrayList<Personagem> listaPersonagens = new ArrayList<>();

     public static void main(String[]args){


        do{

           menu();

        }while( != 4);
    }
    //region(menu)

    public static void menu() {

     int opcao;

        System.out.println("""
                    MENU
                1 - CRIAR PERSONAGEM
                2 - VER PERSONAGENS
                3 - BATALHAR
                4 - SAIR
                """);
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                criarPersonagem();
                break;
            case 2:
                listarPersonagens();
                break;
            case 3:
                combateMortal();
                break;
            case 4:
                System.out.println("BYEE!!!" +
                        "Good luck on your journey... And don't forget to be a good person in that life.");
                break;
            default:
                System.out.println("Insira uma opção valida...");
                menu();
                break;
        }
    }
    //endregion

    //region(funções)
    public static Personagem criarPersonagem(){

         String nome;
         int idade, vida, dano;

        System.out.println("Quantos personagens você deseja criar? ");
        int opcao = sc.nextInt();

        if (opcao == 0) {
            System.out.println("Como desejar... \n\n\n");
            System.out.println("""
                Você deseja voltar ao menu principal?
                
            1 - Sim
            2 - Não
            
            """);
            int opcaoMenu = sc.nextInt();

                switch(opcaoMenu){
                    case 1:
                        menu();
                        break;
                    case 2:
                        System.out.println("Deseja reiniciar a criação do personagem?\n 1 - Sim\n2 - não");
                        int opcaoFreshOrBack = sc.nextInt();
                        if (opcaoFreshOrBack == 1) {
                            criarPersonagem();
                        } else if (opcaoFreshOrBack == 2) {
                            System.out.println("Então adeus... Pô não sei oque fazer aqui...");
                            for(int p = 0; p <= 5; p++){
                                System.out.println("KKKKKKKKKKKKKKKKK");
                            }
                            System.out.println("Você caiu na maldição do Carlos Henrique...");
                            for(int j = 0; j <= 5; j++){
                                for(int g = 0; g <= 2; g++){
                                    System.out.println("VOCÊÊÊÊÊ");
                                }
                                for(int h = 0; h <= 3; h++){
                                    System.out.println("CORRAA!!!!");
                                }
                                for(int l = 0; l <= 5; l++){
                                    System.out.println("NÃO SE ESQUEÇA PEQUENO HUMANO...\n\n\n " +
                                            "A PACIÊNCIA DE TODOS POSSUI UM LIMITE...");
                                }
                            }
                        }
                }
        }
        if (opcao != 0) {
            for( int option = 0; option < opcao; option++){
                System.out.println("Qual o nome do seu personagem? ");
                nome = sc.next();
                System.out.println("insira sua idade: ");
                idade = sc.nextInt();
                Personagem personagem = criarPersonagem();
            }
        }
        return new Personagem();
    }
    //endregion
}
