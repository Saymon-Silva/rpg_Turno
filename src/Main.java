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
    private static Inimigo inimigoEscolhido;
    private static Personagem personagem1 = new Personagem("Principal Unico", 60, 60, 60);

    public static void main(String[] args) {
        Inimigo.criarInimigos();
        for (Inimigo inimigo1 : Inimigo.listaDeInimigos) {
            System.out.println(inimigo1);
        }
        System.out.println("aa");
        String a = sc.next();
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
                    1 - Vida = 170; Dano = 120
                    2 - Vida = 190; dano = 100
                    3 - Vida = 180; dano = 110
                    """);
            escolhaVD = sc.nextInt();
            switch (escolhaVD) {
                case 1:
                    vida = 170;
                    dano = 120;
                    setVD = true;
                    break;
                case 2:
                    vida = 190;
                    dano = 100;
                    setVD = true;
                    break;
                case 3:
                    vida = 180;
                    dano = 110;
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

        System.out.println("AQUI SERA FEITA A ESCOLHA DA CLASSE");
        do {
            System.out.println("""
                    1 - Arqueiro - 100 St - 220 Hp
                    2 - Barbaro - 100 St - 280 Hp
                    3 - Cavaleiro - 110 St - 260 Hp
                    4 - Mago - 130 St - 200 Hp
                    
                    """);
            int escC = sc.nextInt();
            switch (escC) {
                case 1:
                    personagemEscolhido.setClasse(new Arqueiro(100,220));
                    escClass = true;
                    break;
                case 2:
                    personagemEscolhido.setClasse(new Barbaro(100,280));
                    escClass = true;
                    break;
                case 3:
                    personagemEscolhido.setClasse(new Cavaleiro(110,260));
                    escClass = true;
                    break;
                case 4:
                    personagemEscolhido.setClasse(new Mago(130,200));
                    escClass = true;
                    break;
                default:
                    System.out.println("pô cara, tu ja tens as opções e ainda me marca uma que sequer existe.");
                    break;
            }

            int danoPersonagem = personagemEscolhido.getDano();
            int vidaPersonagem = personagemEscolhido.getVida();

            int danoClasse = personagemEscolhido.getClasse().getDano();
            int vidaClasse = personagemEscolhido.getClasse().getMaxVida();
            personagemEscolhido.setDano((danoPersonagem * 0) + danoPersonagem + danoClasse);
            personagemEscolhido.setVida((vidaPersonagem * 0 ) +vidaPersonagem + vidaClasse);

        } while (!escClass);
    }
//endregion

    //region(escolher arma)
    public static void escolherArma() {
        boolean escArma = false;

        System.out.println("AQUI SERA FEITA A ESCOLHA DA ARMA");
        do {
            System.out.print("""
                    
                    1 - Arco - 60 dano
                    2 - Cajado - 90 dano
                    3 - Espada - 45 dano
                    4 - Machado - 60
                    Escolha sua Arma - 
                    """);
            int escC = sc.nextInt();
            switch (escC) {
                case 1:
                    personagemEscolhido.setArma(new Arco(80));
                    escArma = true;
                    break;
                case 2:
                    personagemEscolhido.setArma(new Cajado(90));
                    escArma = true;
                    break;
                case 3:
                    personagemEscolhido.setArma(new Espada(85));
                    escArma = true;
                    break;
                case 4:
                    personagemEscolhido.setArma(new Machado(85));
                    escArma = true;
                    break;
                default:
                    System.out.println("pô cara, tu ja tens as opções e ainda me marca uma que sequer existe vtfd.");
                    break;
            }

            int danoPersonagem = personagemEscolhido.getDano();
            int danoArma = personagemEscolhido.getArma().getDano();
            int danoClasse = personagemEscolhido.getClasse().getDano();

            personagemEscolhido.setDano((danoPersonagem * 0) + danoPersonagem + danoClasse + danoArma);

        } while (!escArma);
    }
//endregion

    //region(edição dos personagens)
    public static void editarPersonagens() {

        boolean edicacaoCabo = false;

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
            }
        }
        System.out.println(" Correto : " + personagemEscolhido);

        do {
            System.out.println("""
                    MENU EDIÇÃO
                    1 - Nome
                    2 - Idade
                    3 - Classe
                    4 - Arma
                    5 - Sair
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
            System.out.println("\n");
            System.out.println("Ele está assim : " + personagemEscolhido);
            System.out.println("\n");
        } while (!edicacaoCabo);
    }
//endregion

//region(funcoes editar)

    //region(nome)
    public static void editarNome() {
        System.out.print("Insira o nome que deseja possuir : ");
        String nomeNovo = scfs.nextLine();
        personagemEscolhido.setNome(nomeNovo);
        System.out.println("\n");
    }

    //endregion
//region(edição idade)
    public static void editarIdade() {
        System.out.print("Insira a idade que deseja possuir : ");
        int idadeNova = sc.nextInt();
        personagemEscolhido.setIdade(idadeNova);
        System.out.println("\n");
    }


//endregion

//endregion

//region(codigo combate mortal - 1)
//    public static void combateMortal() {//iniciar esse aqui
//         int vida = personagemEscolhido.getVida();
////region(historia do inicio)
//        System.out.println("sempre que travar, aperte no '.' e depois no 'enter'");
//        System.out.println("Vamos começar...");
//        System.out.println("""
//                E é assim que sua jornada se inicia...
//
//                Um dia você simplesmente dormiu em sua casa e acordau numa vila cheia de estranhos e distante de todo
//                o restante do mundo. Você se vê preocupado e assustado em meio a essa situação.
//                    Perceba que a população dessa vila é rude com você, porém não há motivos.
//                """);
//        String x = sc.next();
////region(inicio do combate)
//        System.out.println("""
//                O dia passa num piscar de olhos.
//                E você se deita para descansar... E começa a sonhar... Dentro desse sonho, há um corredor branco, totalmente branco
//                e você o segue até o que parece ser o final dele.
//                Porém encontra uma pequena criatura, horrenda como um pesadelo...
//                Ela te ataca...
//                 """);
//        String a = sc.next();
//        Inimigo inimigo1 = new Inimigo(10, 10);
//        int vidaImigo = inimigo1.getVida();
//        int danoImigo = inimigo1.getDano();
//        System.out.println("""
//                1 - Revidar
//                2 - Ignorar e correr
//                """);
//        int opcao = sc.nextInt();
//
//        switch (opcao) {
//            case 1:
//                System.out.println("Você revidou o ataque dela e agora um duelo esta por vir.");
//                int escMov;
//                do {
//                    System.out.println("""
//                            1 - Atacar
//                            2 - regenerar
//                            3 - desisitir
//                            """);
//                    escMov = sc.nextInt();
//
//                    if (escMov == 1) {
//                        vidaImigo -= personagemEscolhido.atacar();
//                        System.out.println("Você atacou e o acertou");
//                    } else if (escMov == 2) {
//                        vida += 5;
//                    } else if (escMov == 3 ){
//                        System.out.println("você desistiu!! ");
//                        System.out.println("""
//                                        Você corre deseperadamente para longe dessa coisa.
//                                            Você acorda com medo e suado, sua cama tem sangue... Mas não é seu, aparentemente.
//                                        """);
//                    }
//                    vida -= danoImigo;
//
//                    if (vida <= 0) {
//                        System.out.println("""
//                                        Seu corpo foi atacado diversas vezes...
//                                            Você acorda com medo e suado, sua cama possui sangue... Mas aparentemente não é seu.
//                                        """);
//                    }
//                    if (vidaImigo <= 0) {
//                        System.out.println("""
//                                Você derrotou a criatura... Porém quando acordou notou que estava com sangue em suas mãos
//                                e olhando mais atentamente para o chão você encontrou um pequeno rastro de sangue.
//                                """);
//                    }
//                } while (vida > 0 || escMov == 3 || vidaImigo > 0);
//                Inimigo inimigo2 = new Inimigo(20, 30);
//                int vidaImigo2 = inimigo2.getVida();
//                int danoImigo2 = inimigo2.getDano();
//
//                System.out.println("");
//        }
////endregion
//
//    }

    //endregion
    //endregion

    //region( codigo combate mortal - 2 )
    public static void combateMortal() {//fazer um combate de torre, tp mk

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
//                desafio();
                break;
            case 3:
                break;

        }

    }
    //endregion

//region(modos de batalha)

    //region(torre)
    public static void batalhaTorre() {
        Inimigo.criarInimigos();

        System.out.println("""
                Bem Vindo !
                Nossos agradecimentos por ter escolhido esse modo.
                """);
        System.out.println("""
                Escolha o modo
                1 - Facil
                2 - Medio
                3 - Dificil
                """);
        int escolhaModo = sc.nextInt();

        switch(escolhaModo){

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }



    }
    //endregion
    //region(desafio)
    //endregion


//endregion
}
