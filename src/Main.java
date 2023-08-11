import model.Personagem;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;
import model.armas.*;
import model.classes.*;


public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Scanner scfs = new Scanner(System.in);//scanner pra strings
    private static Personagem personagem;
    private static int optionForDeath;
    private static Personagem personagemEscolhido;
    private static Personagem personagem1 = new Personagem("Principal Unico", 60, 60, 60);


    public static void main(String[] args) {

        Inimigo.criarInimigos();
        for (Inimigo inimigo1 : Inimigo.listaDeInimigos) {
            System.out.println(inimigo1);
        }
        do {

            menu();

        } while (optionForDeath != 5);

    }

    //region(menu)
    public static void menu() {

        System.out.println("""
                    MENU
                1 - CRIAR PERSONAGEM
                2 - VER PERSONAGENS
                3 - BATALHAR
                4 - EDITAR
                5 - SAIR
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
                //escolha do personagem pra usar
                escolherPersonagem();
                //escolha da classe
                escolherClasse();
                //escolha da arma
                escolherArma();
                System.out.println(personagemEscolhido);
                combateMortal();
                //escolherPersonagem() criar essa função para o usuario escolher qual personagem quer usar para o combate

                break;
            case 4:
                editarPersonagens();
                break;
            case 5:
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
//region(escolher personagem - 2)
    private static Personagem escolherPersonagem() {

        System.out.print("Aqui você irá escolher o personagem para batalhar usando ele");
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
//endregion

    //region(Criar Personagem)
    public static Personagem criarPersonagem() {

        String nome = "";
        int dano = 0, vida = 0;
        int escolhaVD, idade = 0;
        boolean setVD = false;

        System.out.print("Qual o nome do seu personagem? ");
        nome = scfs.nextLine();
        System.out.print("Qual a idade do sue personagem? ");
        idade = sc.nextInt();

        do {
            System.out.println("""
                    Escolha de vida e dano
                    1 - Vida = 890; Dano = 120
                    2 - Vida = 740; dano = 170
                    3 - Vida = 800; dano = 150
                    """);
            escolhaVD = sc.nextInt();
            switch (escolhaVD) {
                case 1:
                    vida = 890;
                    dano = 120;
                    setVD = true;
                    break;
                case 2:
                    vida = 740;
                    dano = 120;
                    setVD = true;
                    break;
                case 3:
                    vida = 800;
                    dano = 150;
                    setVD = true;
                    break;
                default:
                    System.out.print("ESCOLHA UMA OPÇÃO VALIDA");
                    // Volta pra escolha de vida e dano
                    break;
            }
        } while (!setVD);


        return new Personagem(nome, idade, dano, vida);
    }
//endregion

    //region(escolher classe)
    public static void escolherClasse() {

        boolean escClass = false;
        System.out.println("AQUI SERA FEITA A ESCOLHA DA SUA CLASSE");
        do {
            System.out.print("""
                    
                    1 - Agente_P
                    2 - Arqueiro
                    3 - Assassino
                    4 - Barbaro
                    5 - Cavaleiro
                    6 - Mago
                    7 - Medico
                    8 - Pipeiro
                    
                    Insira o codigo da classe :
                    """);
            int escC = sc.nextInt();
            switch (escC) {
                case 1:
                    personagemEscolhido.setClasse(new Agente_P(150, 200));

                    escClass = true;
                    break;
                case 2:
                    personagemEscolhido.setClasse(new Arqueiro(155,210));
                    escClass = true;
                    break;
                case 3:
                    personagemEscolhido.setClasse(new Assassino(160,215));
                    escClass = true;
                    break;
                case 4:
                    personagemEscolhido.setClasse(new Barbaro(200,230));
                    escClass = true;
                    break;
                case 5:
                    personagemEscolhido.setClasse(new Cavaleiro(190,210));
                    escClass = true;
                    break;
                case 6:
                    personagemEscolhido.setClasse(new Mago(210,160));
                    escClass = true;
                    break;
                case 7:
                    personagemEscolhido.setClasse(new Medico(50,250));
                    escClass = true;
                    break;
                case 8:
                    personagemEscolhido.setClasse(new Pipeiro(140,150));
                    escClass = true;
                    break;
                default:
                    System.out.println("pô cara, tu ja tens as opções e ainda me marca uma que sequer existe.");
                    break;
            }
            int vidaPersonagem = personagemEscolhido.getVida();
            int vidaPersonagemClasse = personagemEscolhido.getClasse().getMaxVida();
            int danoPersonagem = personagemEscolhido.getDano();
            int danoPersonagemClasse = personagemEscolhido.getClasse().getDano();

            personagemEscolhido.setVida((vidaPersonagem * 0) + vidaPersonagem + vidaPersonagemClasse);
            personagemEscolhido.setDano((danoPersonagem * 0) + danoPersonagem + danoPersonagemClasse);
        } while (!escClass);
    }
//endregion

    //region(escolher arma)
    public static void escolherArma() {
        boolean escArma = false;
        System.out.println("AQUI SERA FEITA A ESCOLHA DA ARMA");
        do {
            System.out.print("""
                    
                    1 - Adaga do Pagão - 130 St
                    2 - Arco - 90 St 
                    3 - Cajado - 150 St
                    4 - Espada - 120 St
                    5 - Machado - 130 St
                    6 - Perry on Fire - 150 St
                    7 - Rolo de Cerol - 60 St
                    8 - Vacin of Cloroquina - 75 St 
                    9 - Varinha de Condão - 150 St
                    
                    Insira o codigo da arma :
                    """);
            int escC = sc.nextInt();
            switch (escC) {
                case 1:
                    personagemEscolhido.setArma(new Adaga_do_Pagao(130));
                    escArma = true;
                    break;
                case 2:
                    personagemEscolhido.setArma(new Arco(90));
                    escArma = true;
                    break;
                case 3:
                    personagemEscolhido.setArma(new Cajado(150));
                    escArma = true;
                    break;
                case 4:
                    personagemEscolhido.setArma(new Espada(120));
                    escArma = true;
                    break;
                case 5:
                    personagemEscolhido.setArma(new Machado(130));
                    escArma = true;
                    break;
                case 6:
                    personagemEscolhido.setArma(new Perry_on_Fire(150));
                    escArma = true;
                    break;
                case 7:
                    personagemEscolhido.setArma(new Rolo_de_Cerol(60));
                    escArma = true;
                    break;
                case 8:
                    personagemEscolhido.setArma(new Vacin_of_Cloroquina(75));
                    escArma = true;
                    break;
                case 9:
                    personagemEscolhido.setArma(new Varinha_de_Condao(150));
                    escArma = true;
                    break;
                default:
                    System.out.println("pô cara, tu ja tens as opções e ainda me marca uma que sequer existe vtfd.");
                    break;
            }
            int danoPersonagem = personagemEscolhido.getDano();
            int danoPersonagemClasse = personagemEscolhido.getClasse().getDano();
            int danoPersonagemArma = personagemEscolhido.getArma().getDano();

            personagemEscolhido.setDano((danoPersonagem * 0) + danoPersonagem + danoPersonagemClasse + danoPersonagemArma);
        } while (!escArma);
    }
//endregion

    //region(edição dos personagens)
    public static void editarPersonagens() {

        boolean edicacaoCabo = false;

        for (Personagem personagem : Personagem.listaPersonagens) {
            System.out.println(personagem);
        }

        System.out.print("""
                
                Escolha do personagem (escolha pelo codigo dele)
                """);
        int codigo = sc.nextInt();

        for (Personagem personagem : Personagem.listaPersonagens) {
            if (codigo == personagem.getCodigo()) {
                System.out.println("Personagem escolhido: " + personagem);
                personagemEscolhido = personagem;
            }
        }

        do {
            System.out.println("Ele esta assim atualmente :\n" + personagemEscolhido);
            System.out.print("""
                    
                    MENU EDIÇÃO
                    
                    1 - Nome
                    2 - Idade
                    3 - Classe
                    4 - Arma
                    5 - Sair
                    
                    Insira o codigo :
                    """);
            int escolhaEdição = sc.nextInt();

            switch (escolhaEdição) {

                case 1:
                    editarNome();
                    break;
                case 2:
                    editarIdade();
                    break;
                case 3:
                    escolherClasse();
                    break;
                case 4:
                    escolherArma();
                    break;
                case 5:
                    edicacaoCabo = true;
                    break;
                default:
                    System.out.println("VALORES VALIDOS PRINCESS!!!!!!");
                    break;
            }
        } while (!edicacaoCabo);
    }
//endregion

//region(funcoes editar)

    //region(nome)
    public static void editarNome() {
        System.out.print("Insira o nome que deseja possuir : ");
        String nomeNovo = scfs.nextLine();
        personagemEscolhido.setNome(nomeNovo);
    }

    //endregion
//region(edição idade)
    public static void editarIdade() {
        System.out.print("Insira a idade que deseja possuir : ");
        int idadeNova = sc.nextInt();
        personagemEscolhido.setIdade(idadeNova);
    }


//endregion

//endregion

    //region( codigo combate mortal - 2 )
    public static void combateMortal() {//fazer um combate de torre, tp mk

        int vida = personagemEscolhido.getVida();

        int dano = personagemEscolhido.getDano();

        System.out.println("""
                MODO DE BATALHA
                1 - TORRE
                2 - HISTORIA
                3 - DESAFIO
                ?? - CONTRA SI
                """);
        int escMdBtl = sc.nextInt();

        switch (escMdBtl) {

            case 1:
                batalhaTorre();
                break;
            case 2:
                break;
            case 3:
                break;

        }

    }
    //endregion

//region(modos de batalha)

    //region(torre)
    public static void batalhaTorre() {

        System.out.println("Bem vindo!!");

        System.out.println("""
                
                1 - Fácil
                2 - Médio
                3 - Dificil
                
                Escolha o modo : """);
        int escolhaModo = sc.nextInt();

        switch(escolhaModo){

            case 1:
                modoFacil();
                break;
            case 2:
                modoMedio();
                break;
            case 3:
                modoDificil();
                break;
        }

    }
    //endregion
//region(modos torre)

    //region(facil
    public static void modoFacil(){

    }
    //endregio
    //region(medio
    public static void modoMedio(){

    }
    //endregion
    //region(dificil
    public static void modoDificil(){

        System.out.println("so pra comitar");
        System.out.println("cadela não comita");

    }
    //endregion
//endregion

//endregion

}
