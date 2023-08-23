import model.Personagem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.*;
import model.armas.*;
import model.classes.*;
import org.w3c.dom.ls.LSOutput;


public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Scanner scfs = new Scanner(System.in);//scanner pra strings
    private static Personagem personagem;
    private static int optionForDeath;
    public static Pessoa pessoaLogada = Pessoa.pessoa;//usuario que esta logado no sistema.
    public static Personagem personagemEscolhido;//personagem que a pessoa logada estara usando.
//    private static Personagem personagem1 = new Personagem("Principal Unico", 1000, 9999);
    private static Inimigo inimigoDaBola;
    private static Random random = new Random();
    public static boolean loginEfetuado = false;
    public static Personagem personagem3 = new Personagem("Teste",99999,9999);

    public static void main(String[] args) {
    personagem3.setArma(new Adaga_do_Pagao(150));
    personagem3.getArma().habilidade();
        bemVindo();
        do {
            menu();
        } while (optionForDeath != 5);
    }
    public static Pessoa cadastro(){
       String nome = "";
       String senha = "";

        System.out.print("Insira seu nome : ");
        nome = scfs.nextLine();
        System.out.print("Insira sua senha : ");
        senha = scfs.nextLine();

        return new Pessoa(nome, senha);
    }


    public static Pessoa login(){

        int codigoLogin;

        do {
            System.out.print("Insira o seu codigo de login : ");
            codigoLogin = sc.nextInt();

            for (Pessoa pessoa : Pessoa.listaDePessoas) {
                if (codigoLogin == pessoa.getCodigo()) {
                    System.out.println(pessoa);
                    pessoaLogada = pessoa;
                } else {
                    System.out.println("Não há nenhum cadastro com esse codigo!");
                    pessoaLogada = null;
                }
            }
        }while(pessoaLogada == null);

        String senhaLogin;
        do {
            System.out.print("Insira sua senha : ");
            senhaLogin = scfs.nextLine();

                if (senhaLogin.equals(pessoaLogada.getSenha())) {
                    System.out.println("Bem vindo! " + pessoaLogada);
                    return pessoaLogada;
                } else {
                    System.out.println("Senha incorreta." + pessoaLogada);
                }
        }while(senhaLogin != pessoaLogada.getSenha());
        loginEfetuado = true;

        return null;
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
                6 -
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
                for (Personagem personagem : Pessoa.listaDePersonagens) {
                    System.out.println(personagem);
                }
                System.out.println("");
                break;
            case 3:
                combateMortal();
                 break;
            case 4:
                editarPersonagens();
                break;
            case 5:
                boolean fecharSistema = false;
                boolean voltarLogin = false;
                do {
                    System.out.println("Você deseja voltar à tela de login?\n1 - Sim\n2 - Não, quero fechar o sistema");
                int opcao = sc.nextInt();
                    if (opcao == 1) {
                        bemVindo();
                        voltarLogin = true;
                    } else if (opcao == 2) {
                        System.out.println("Adeus!");
                        fecharSistema = true;
                    }
                    else{
                        System.out.println("Insira valores validos!");
                    }
                }while(!fecharSistema || !voltarLogin);

                fecharSistema = false;
                voltarLogin = false;
                break;
            case 6:
                break;
            default:
                System.out.println("Insira uma opção valida...");
                break;
        }
    }
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

//region( escolher inimigo)
//private static Inimigo escolherInimigo() {
//
//    System.out.print("Aqui você irá escolher o personagem para batalhar usando ele");
//    for (Inimigo inimigo : Inimigo.listaDeInimigos) {
//        System.out.println(inimigo);
//    }
//    System.out.println("");
//    System.out.print("""
//                Escolha do inimigo (escolha pelo codigo dele)
//                """);
//    int codigo = sc.nextInt();
//
//    for (Inimigo inimigo : Inimigo.listaDeInimigos) {
//        if (codigo == inimigo.getCodigo()) {
//            System.out.println("Personagem escolhido: " + inimigo);
//            inimigoDaBola = inimigo;
//            return inimigoDaBola;
//        }
//        else {
//            System.out.println("Não há nenhum personagem com o codigo: " + codigo);
//            return null;
//        }
//    }
//
//    return null;
//}
//endregion

//region(Criar Personagem)
    public static Personagem criarPersonagem() {

        String nome = "";
        int dano = 0, vida = 0;
        int escolhaVD, idade = 0;
        boolean setVD = false;

        System.out.print("Qual o nome do seu personagem? ");
        nome = scfs.nextLine();
//        System.out.print("Qual a idade do sue personagem? ");
//        idade = sc.nextInt();

        do {
            System.out.println("""
                    Escolha de vida e dano
                    1 - Vida = 1600; Dano = 250
                    2 - Vida = 1550; dano = 280
                    3 - Vida = 1650; dano = 200
                    """);
            escolhaVD = sc.nextInt();
            switch (escolhaVD) {
                case 1:
                    vida = 1600;
                    dano = 250;
                    setVD = true;
                    break;
                case 2:
                    vida = 1550;
                    dano = 280;
                    setVD = true;
                    break;
                case 3:
                    vida = 1650;
                    dano = 200;
                    setVD = true;
                    break;
                default:
                    System.out.print("ESCOLHA UMA OPÇÃO VALIDA");
                    // Volta pra escolha de vida e dano
                    break;
            }
        } while (!setVD);

        return new Personagem(nome,vida, dano);
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
            int danoPersonagemArma = personagemEscolhido.getArma().getDano();

            personagemEscolhido.setDano((danoPersonagem * 0) + danoPersonagem + danoPersonagemArma);
        } while (!escArma);
    }
//endregion

//region(edição dos personagens)
    public static void editarPersonagens() {

        boolean edicacaoCabo = false;
        personagemEscolhido = null;
do {
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
}while(personagemEscolhido == null);

        do {
            System.out.println("Ele esta assim atualmente :\n" + personagemEscolhido);
            System.out.print("""
                    
                    MENU EDIÇÃO
                    
                    1 - Nome
                    2 - Arma
                    3 - Classe
                    4 - Sair
                    
                    Insira o codigo :
                    """);
            int escolhaEdição = sc.nextInt();

            switch (escolhaEdição) {

                case 1:
                    editarNome();
                    break;
                case 2:
//                    if (personagemEscolhido.getClasse()!=null){
                        escolherArma();
//                    }else{
//                        System.out.println("Primeiro decida a classe!");
//                }
                    break;
                case 3:
                    escolherClasse();
                    break;
                case 4:
                    edicacaoCabo = true;
                    personagemEscolhido = null;
                    break;
                default:
                    System.out.println("Insira opções validas!");
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
//    public static void editarIdade() {
//        System.out.print("Insira a idade que deseja possuir : ");
//        int idadeNova = sc.nextInt();
//        personagemEscolhido.setIdade(idadeNova);
//    }
//endregion

//endregion


//region( codigo combate mortal - 2 )
    public static void combateMortal() {//fazer um combate de torre, tp mk

        escolherPersonagem();
        int escMdBtl;
        do {
            System.out.println("""
                    MODO DE BATALHA
                    1 - TORRE
                    2 - (NO FUTURO EXISTIRA)
                    3 - VOLTAR AO MENU
                    """);
            escMdBtl = sc.nextInt();

            switch (escMdBtl) {

                case 1:
                    batalhaTorre();
                    break;
                case 2:
                    System.out.println("Apenas espere");
                    System.out.println("estamos nos esforçando para cria-lo");
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Insira valores validos");
                    break;
            }
        }while(escMdBtl != 3);

    }
    //endregion

//region(modos de batalha)

//region(torre)
    public static void batalhaTorre() {

        System.out.println("Bem vindo!!");
        int escolhaModo;
        do {
            System.out.println("""
                                    
                    1 - Fácil
                    2 - Médio
                    3 - Dificil
                    4 - Voltar
                                    
                    Escolha o modo : """);
            escolhaModo = sc.nextInt();

            switch (escolhaModo) {

                case 1:
                    modoFacil();
                    break;
                case 2:
                    modoMedio();
                    break;
                case 3:
                    modoDificil();
                    break;
                case 4:
                    combateMortal();
                    break;
                default:
                    System.out.println("Insira valores validos!");
                    break;
            }
        }while(escolhaModo != 4);

    }
//endregion
//region(modos torre)
    //region(modo facil refazendo)
    public static void modoFacilRefatorizado() {

        Inimigo.criarInimigos();

        //criando uma variavel booleana para cada habillidade;

        boolean habilidadeAdagaDoPagao = false;
        int contHabilidadedoPagao = 3; //usa pra parar a cura do inimigo;
        boolean habilidadeArco = false;
        boolean habilidadeCajado = false;
        int contHabilidadeDoCajado = 3;
        boolean habilidadeEspada = false;
        boolean habilidadeMachado = false;
        boolean habilidadePerryOnFire = false;
        boolean habilidadeRoloDeCerol = false;
        int contHabillidadeDoCerol = 3;
        boolean habilidadeVacinOfCloroquiha = false;
        boolean habilidadeVarinhaDeCondao = false;

        boolean habilidadeAtivada = false; //usa para proibir o usuario de spamar habilidade.
        int contHabilidadeAtivada = 4;
        //criando e setnado como falas, por que algumas das habilidades podem interferir no curamento dos ininimigos
        //por isso do uso dessas variaveis, por que pode travar a cura, ataque, seja o que for. Somente usando ifs e essas variaveis.


        boolean rodoJaZero = false;
        boolean rodoJaDois = false;
        boolean rodoJaTres = false;
        boolean rodoJaQuatro = false;
        boolean rodoJaUm = false;
        boolean decisaoUnica = false; //faz com que o monstro só efetue um dos ifs.
        boolean morreu = false;
        boolean ganhouRodada = false;
        int escolhaNoTurno = 0;
        boolean escolhaValida = false;//usado dentro do "do" como parametro para continuar ou não sendo rodado

        int nivelMasmorra = 0;

        do {
            int numeroInimigoDaVez = random.nextInt(4);

            if (numeroInimigoDaVez == 0 && rodoJaZero) {
                numeroInimigoDaVez = random.nextInt(4);
            }
            if (numeroInimigoDaVez == 1 && rodoJaUm) {
                numeroInimigoDaVez = random.nextInt(4);
            }
            if (numeroInimigoDaVez == 2 && rodoJaDois) {
                numeroInimigoDaVez = random.nextInt(4);
            }
            if (numeroInimigoDaVez == 3 && rodoJaTres) {
                numeroInimigoDaVez = random.nextInt(4);
            }
            if (numeroInimigoDaVez == 4 && rodoJaQuatro) {
                numeroInimigoDaVez = random.nextInt(4);
            } else {
                int cont = 0;
                for (Inimigo inimigo1 : Inimigo.listaDeInimigosFacil) {
                    if (cont == numeroInimigoDaVez) {
                        inimigoDaBola = inimigo1;
                        if (numeroInimigoDaVez == 0) {
                            rodoJaZero = true;
                        } else if (numeroInimigoDaVez == 1) {
                            rodoJaUm = true;
                        } else if (numeroInimigoDaVez == 2) {
                            rodoJaDois = true;
                        } else if (numeroInimigoDaVez == 3) {
                            rodoJaTres = true;
                        } else if (numeroInimigoDaVez == 4) {
                            rodoJaQuatro = true;
                        }
                    }
                    cont++;
                }
                cont = 0;

                int vidaInimigo = inimigoDaBola.getVida();
                int danoInimigo = inimigoDaBola.getDano();
                int vidaTotalInimigo = 0;
                for (int c = 0; c <= vidaInimigo; c++) {//ta aqui pra usar como base da cura
                    vidaTotalInimigo++;
                }

                int vidaPersonagem = personagemEscolhido.getVida();
                int danoPersonagem = personagemEscolhido.getDano();
                int vidaTotalPersonagem = 0;

                for (int c = 0; c <= vidaPersonagem; c++) {
                    vidaTotalPersonagem++;
                }

                System.out.println("""
                        Bem vindo à Masmorra Fácil
                        """);
                String pronto = scfs.nextLine();
                System.out.print(""" 
                        O inimigo : """ + inimigoDaBola +
                        """ 
                                \nVenho ao seu encontro.\n\n"""
                );
                do {
                    do {
                        escolhaValida = false;//setando falsa para sempre ter um looping;
                        System.out.println("""
                                \n  Inimigo : """ + inimigoDaBola + """ 
                                \n  Personagem : """ + personagemEscolhido + """
                                \n  1 - Atacar 
                                    2 - Recuperar-se
                                    3 - Habilidade Arma
                                    4 - sair
                                    """);
                        escolhaNoTurno = sc.nextInt();
                        switch (escolhaNoTurno) {
                            case 1:
                                System.out.println("Você atacou!");
                                inimigoDaBola.setVida(inimigoDaBola.getVida() - danoPersonagem);
                                System.out.println("Você causou :" + danoPersonagem + " de  dano.");
                                escolhaValida = true;
                                break;
                            case 2:
                                int cura = (vidaTotalPersonagem / 7);
                                personagemEscolhido.setVida(personagemEscolhido.getVida() + cura);
                                System.out.println("Você se curou!");
                                System.out.println("Você recuperou : " + cura);
                                escolhaValida = true;
                                break;
                            case 3:
                                if(!habilidadeAtivada) {
                                    int habilidadeArma = personagemEscolhido.getArma().habilidade();
                                    inimigoDaBola.setVida(inimigoDaBola.getVida() - habilidadeArma);
                                    escolhaValida = true;
                                    if (personagemEscolhido.getArma() instanceof Adaga_do_Pagao) {
                                        habilidadeAdagaDoPagao = true;
                                        //ativa a habilidade dele que, enquanto o cont da habilidade for maior q 0, o inimigo n pode curar
                                    } else if (personagemEscolhido.getArma() instanceof Arco) {
                                        habilidadeArco = true;
                                    } else if (personagemEscolhido.getArma() instanceof Cajado) {
                                        habilidadeCajado = true;
                                    } else if (personagemEscolhido.getArma() instanceof Espada) {
                                        habilidadeEspada = true;
                                    } else if (personagemEscolhido.getArma() instanceof Machado) {
                                        habilidadeMachado = true;
                                    } else if (personagemEscolhido.getArma() instanceof Perry_on_Fire) {
                                        habilidadePerryOnFire = true;
                                    } else if (personagemEscolhido.getArma() instanceof Rolo_de_Cerol) {
                                        habilidadeRoloDeCerol = true;
                                    } else if (personagemEscolhido.getArma() instanceof Vacin_of_Cloroquina) {
                                        habilidadeVacinOfCloroquiha = true;
                                    } else if (personagemEscolhido.getArma() instanceof Varinha_de_Condao) {
                                        habilidadeVarinhaDeCondao = true;
                                    }
                                }
                                else {
                                    System.out.println("Espere :"+ contHabilidadeAtivada + " turnos.");
                                }
                                break;
                            case 4:
                                System.out.println("");
                                batalhaTorre();
                                escolhaValida = true;
                                break;
                            default:
                                System.out.println("Insira um valor valido!");
                                break;
                        }
                    } while (!escolhaValida);
//contador para poder ativar a habilidade novamente.
                    //region(cont da habilidade total)
                    if(habilidadeAtivada) {
                        contHabilidadeAtivada--;
                    }
                    else {
                        contHabilidadeAtivada = 4;
                    }
                    //endregion
//habilidade da adaga do pagao, vai ser um if que trava o cont da habilidade, fazendo chegar até 3, numero de vezes que vai ser usada.
                    //region(habilidade pagao)
                    if (habilidadeAdagaDoPagao) {
                        if (contHabilidadedoPagao == 3) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabilidadedoPagao + " rounds");
                        } else if (contHabilidadedoPagao == 2) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabilidadedoPagao + " rounds");
                        } else if (contHabilidadedoPagao == 1) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabilidadedoPagao + " rounds");
                        } else if (contHabilidadedoPagao == 0) {
                            System.out.println("Sua habilidade chegou no limite!");
                            habilidadeAdagaDoPagao = false;
                        }
                        contHabilidadedoPagao--;
                    } else {
                        contHabilidadedoPagao = 3;
                    }
                    //endregion
//habilidade do rolo de cerol, é praticamente a  mesma pegada de travar a cura do inimigo
                    //region(habilidade rolo de cerol)
                    if (habilidadeRoloDeCerol) {
                        if (contHabillidadeDoCerol == 3) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabillidadeDoCerol + " rounds");
                        } else if (contHabillidadeDoCerol == 2) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabillidadeDoCerol + " rounds");
                        } else if (contHabillidadeDoCerol == 1) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabillidadeDoCerol + " rounds");
                        } else if (contHabillidadeDoCerol == 0) {
                            System.out.println("Sua habilidade chegou no limite!");
                            habilidadeRoloDeCerol = false;

                        }
                        contHabillidadeDoCerol--;
                    } else {
                        contHabillidadeDoCerol = 3;
                    }
                    //endregion
//cura do inimigo
                    if (!habilidadeAdagaDoPagao || !habilidadeRoloDeCerol) {
                        if (inimigoDaBola.getVida() <= (vidaTotalInimigo / 4)) {
                            inimigoDaBola.setVida(inimigoDaBola.getVida() + (vidaTotalInimigo / 6));
                            System.out.println("Seu inimigo se curou");
                            decisaoUnica = true;
                        }
                    } else {
                        System.out.println("O inimigo não pode se curar");
                    }
//habilidade do cajado, gera uma barreira que não te deixa receber dano, bloqueando o ataque do inimigo
                    //region(habilidade cajado)
                    if (habilidadeCajado) {
                        if (contHabilidadeDoCajado == 3) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabilidadeDoCajado + " rounds");
                        } else if (contHabilidadeDoCajado == 2) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabilidadeDoCajado + " rounds");
                        } else if (contHabilidadeDoCajado == 1) {
                            System.out.println("Sua habilidade é efetiva por mais :" + contHabilidadeDoCajado + " rounds");
                        } else if (contHabilidadeDoCajado == 0) {
                            System.out.println("Sua habilidade chegou no limite!");
                            habilidadeCajado = false;
                        }
                        contHabilidadeDoCajado--;
                    } else {
                        contHabilidadeDoCajado = 3;
                    }
                        //endregion
//dano do inimigo
                        if (!habilidadeCajado) {
                            if (!decisaoUnica && inimigoDaBola.getVida() > 0) {
                                personagemEscolhido.setVida(personagemEscolhido.getVida() - danoInimigo);
                                System.out.println("Voce foi atacado e recebeu : " + danoInimigo);
                            }
                        } else {
                            System.out.println("O inimigo não pode te atacar!");
                        }

                        decisaoUnica = false;
//se o personagem morreu
                        if (personagemEscolhido.getVida() <= 0) {
                            morreu = true;
                            System.out.println("Você foi derrotado!");
                            System.out.println("Volte ao menu de escolha de level!");
                            batalhaTorre();
                            nivelMasmorra = 0;
                        }
//se o inimigo morreu
                        if (inimigoDaBola.getVida() <= 0) {
                            System.out.println("Você derrotou o Inimigo : " + inimigoDaBola.getNome());
                            ganhouRodada = true;
                        }
//acaba aqui
                    }while (!morreu || !ganhouRodada) ;
//recomeça aqui, quando morreu ou ganhou for verdadeiro, ele para e passa pro if
                    if(!morreu){
                        nivelMasmorra++;
                        System.out.println("Você passou do nivel " + nivelMasmorra);
                    }
//daqui ele sortea outro numero e recomeça, até que você saia ou
                }//esse é a chave do "else" que faz o combate acontecer...
            } while (!rodoJaUm && !rodoJaDois && !rodoJaTres && !rodoJaQuatro && !rodoJaZero || !morreu) ;
            ganhouRodada = false;
            if (rodoJaUm && rodoJaDois && rodoJaTres && rodoJaQuatro && rodoJaZero && !morreu) {
                int opcao;
                System.out.println("Parabens!!!");
                System.out.println("Você concluiu o modo facil");
                do {
                    System.out.print("""
                            Deseja ir para o modo médio?
                            1 - Sim
                            2 - Não
                            Codigo : """);
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            modoMedio();
                            break;
                        case 2:
                            menu();
                            break;
                        default:
                            System.out.println("Insira um valor valido!");
                            break;
                    }
                } while (opcao != 1 || opcao != 2);
            }
//acaba tudo aqui
        }

    //endregion
    //region(
    //region(facil
    public static void modoFacil(){
        Inimigo.criarInimigos();

        boolean rodoJaZero = false;
        boolean rodoJaDois = false;
        boolean rodoJaTres = false;
        boolean rodoJaQuatro = false;
        boolean rodoJaUm = false;
        boolean decisaoUnica = false; //faz com que o monstro só efetue um dos ifs.
        boolean morreu = false;
        boolean ganhouRodada = false;

        int nivelMasmorra = 1;
        int escolhaNoTurno = 0;

        do {
            int numeroInimigoDaVez = random.nextInt(4);

            if ( numeroInimigoDaVez == 0 && rodoJaZero){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 1 && rodoJaUm){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 2 && rodoJaDois){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 3 && rodoJaTres){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 4 && rodoJaQuatro){
                numeroInimigoDaVez = random.nextInt(3);
            }
            else {
                int cont = 0;
                for (Inimigo inimigo1 : Inimigo.listaDeInimigosFacil) {
                    if (cont == numeroInimigoDaVez) {
                        inimigoDaBola = inimigo1;
                    }
                    cont++;
                }

                int vidaInimigo = inimigoDaBola.getVida();
                int danoInimigo = inimigoDaBola.getDano();

                int vidaTotalInimigo = 0;

                for(int c = 0; c <= vidaInimigo; c++){
                    vidaTotalInimigo++;
                }

                int vidaTotalPersonagem = 0;

                for(int c=0; c<= vidaInimigo; c++){
                    vidaTotalPersonagem++;
                }

                int vidaPersonagem = personagemEscolhido.getVida();
                int danoPersonagem = personagemEscolhido.getDano();

                System.out.println("""
                            Bem vindo à Masmorra Fácil
                            
                            Prepare suas coisas e vamos!!
                            """);
                String pqp = scfs.nextLine();
                System.out.println(""" 
                        O inimigo : """ + inimigoDaBola +
                        """ 
                        Venho ao seu encontro."""
                );
                System.out.println("Nivel masmorra : " + nivelMasmorra);
                do {
                    System.out.println("""
                        \n  Inimigo : """ + inimigoDaBola + """ 
                        \n  Personagem : """ + personagemEscolhido + """
                        \n  1 - Atacar 
                            2 - Recuperar-se
                            4 - Habilidade Arma
                            5 - Habilidade Passiva
                            3 - sair
                            """);
                    escolhaNoTurno = sc.nextInt();
                    switch(escolhaNoTurno){
                            case 1:
                                System.out.println("Você atacou!");
                                inimigoDaBola.setVida(inimigoDaBola.getVida() - danoPersonagem);
                                System.out.println("Você causou :" + danoPersonagem + " de  dano.");
                                break;
                            case 2:
                                int cura = (vidaTotalPersonagem/7);
                                personagemEscolhido.setVida(personagemEscolhido.getVida() + cura);
                                System.out.println("Você se curou!");
                                System.out.println("Você recuperou : " + cura);
                                break;
                            case 3:

                                break;
                            case 4:
                                System.out.println("cagao");
                                batalhaTorre();
                                break;
                            default:
                                System.out.println("Perdeu o turno. Insira apenas valores válidos...");
                                break;
                        }

                        if (vidaInimigo <= (vidaTotalInimigo / 4)) {
                            inimigoDaBola.setVida(inimigoDaBola.getVida() + (vidaTotalInimigo / 6));
                            System.out.println("Seu inimigo se curou");
                            decisaoUnica = true;
                        }

                        if (!decisaoUnica && vidaInimigo > 0) {
                           personagemEscolhido.setVida(personagemEscolhido.getVida() - danoInimigo);
                            System.out.println("Voce foi atacado e recebeu : " + danoInimigo);
                        }

                        decisaoUnica = false;

                    if (personagemEscolhido.getVida() <= 0) {
                        morreu = true;
                        System.out.println("Você foi derrotado!");
                        System.out.println("Volte ao menu de escolha de level!");
                        batalhaTorre();
                    }

                    if (inimigoDaBola.getVida() <= 0) {
                        System.out.println("Você derrotou o Inimigo : " + inimigoDaBola.getNome());
                        ganhouRodada = true;
                    }

                    } while (inimigoDaBola.getVida() > 0 || personagemEscolhido.getVida() > 0 || escolhaNoTurno != 3 || !morreu || !ganhouRodada);
                    ganhouRodada = false;

                    nivelMasmorra++;

                    if (personagemEscolhido.getVida() <= 0 || escolhaNoTurno == 3 || morreu) {
                        nivelMasmorra = 0;
                        personagemEscolhido.setVida(vidaTotalPersonagem);
                        System.out.println("Infelizmente você foi derrotado.");
                        System.out.println("Você sera mandado a escolha da dificuldade");
                        batalhaTorre();
                    }
//
                }
            }while(!rodoJaUm && !rodoJaDois && !rodoJaTres && !rodoJaQuatro && !rodoJaZero || !morreu);
        if(rodoJaUm && rodoJaDois && rodoJaTres && rodoJaQuatro && rodoJaZero && !morreu){
            System.out.println("Parabens!!!");
            System.out.println("Você concluiu o modo facil");
            System.out.print("""
                    Deseja ir para o modo médio?
                    1 - Sim
                    2 - Não
                    Codigo : """);
            int opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    modoMedio();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Inserindo valores invalidos... Vá para o menu principal");
                    String tmncKr = scfs.nextLine();
                    menu();
                    break;
            }
        }

    }
    //endregion
    //region(medio
    public static void modoMedio(){
        Inimigo.criarInimigos();

        boolean rodoJaZero = false;
        boolean rodoJaDois = false;
        boolean rodoJaTres = false;
        boolean rodoJaQuatro = false;
        boolean rodoJaUm = false;
        boolean decisaoUnica = false; //faz com que o monstro só efetue um dos ifs.
        boolean morreu = false;
        boolean ganhouRodada = false;

        int nivelMasmorra = 1;
        int escolhaNoTurno;

        do {
            int numeroInimigoDaVez = random.nextInt(4);

            if ( numeroInimigoDaVez == 0 && rodoJaZero){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 1 && rodoJaUm){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 2 && rodoJaDois){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 3 && rodoJaTres){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 4 && rodoJaQuatro){
                numeroInimigoDaVez = random.nextInt(4);
            }
            else {
                int cont = 0;
                for (Inimigo inimigo1 : Inimigo.listaDeInimigosMedio) {
                    if (cont == numeroInimigoDaVez) {
                        inimigoDaBola = inimigo1;
                    }
                    cont++;
                }

                int vidaInimigo = inimigoDaBola.getVida();
                int danoInimigo = inimigoDaBola.getDano();

                int vidaTotalInimigo = 0;

                for(int c = 0; c <= vidaInimigo; c++){
                    vidaTotalInimigo++;
                }

                int vidaTotalPersonagem = 0;

                for(int c = 0; c <= vidaInimigo; c++){
                    vidaTotalPersonagem++;
                }

                int vidaPersonagem = personagemEscolhido.getVida();
                int danoPersonagem = personagemEscolhido.getDano();

                System.out.println("""
                            Bem vindo à Masmorra Média
                            
                            Prepare suas coisas e vamos!!
                            """);
                String pqp = scfs.nextLine();
                System.out.println(""" 
                        O inimigo : """ + inimigoDaBola +
                        """ 
                        \nVenho ao seu encontro."""
                );
                System.out.println("Nivel masmorra : " + nivelMasmorra);
                do {

                    System.out.println("""
                            \nInimigo : """ + inimigoDaBola + """ 
                            \nPersonagem : """ + personagemEscolhido + """
                            \n1 - Atacar 
                            2 - Recuperar-se
                            3 - Fugir
                            """);
                    escolhaNoTurno = sc.nextInt();
                    switch(escolhaNoTurno){
                        case 1:
                            System.out.println("Você atacou");
                            inimigoDaBola.setVida(inimigoDaBola.getVida() - danoPersonagem);
                            break;
                        case 2:
                            personagemEscolhido.setVida(personagemEscolhido.getVida() + (vidaTotalPersonagem / 5));
                            System.out.println("Você se recuperou");
                            break;
                        case 3:
                            System.out.println("cagao");
                            batalhaTorre();
                            break;
                        default:
                            System.out.println("Perdeu o turno. Insira apenas valores válidos...");
                    }
                    if (inimigoDaBola.getVida() <= (vidaTotalInimigo / 4)) {
                        inimigoDaBola.setVida(inimigoDaBola.getVida() + (vidaTotalInimigo / 6));
                        System.out.println("Seu inimigo se curou");
                        decisaoUnica = true;
                    }
                    if (!decisaoUnica && inimigoDaBola.getVida() > 0) {
                        personagemEscolhido.setVida(personagemEscolhido.getVida() - danoInimigo);
                        System.out.println("Voce foi atacado e recebeu : " + danoInimigo);
                    }
                    decisaoUnica = false;

                    if (personagemEscolhido.getVida() <= 0) {
                        System.out.println("Você foi derrotado!");
                        System.out.println("Volte ao menu de escolha de level!");
                        batalhaTorre();
                    }
                    if (inimigoDaBola.getVida() <= 0) {
                        System.out.println("Você derrotou o Inimigo : " + inimigoDaBola.getNome());
                        ganhouRodada = true;
                    }

                    int chancePoderUm = random.nextInt(9);
                    int chancePoderDois = random.nextInt(9);

                    if(inimigoDaBola.getNome().equals("Cleitin do Grau") && chancePoderUm == chancePoderDois){
                        System.out.println("Cleitin ta lançõu um ataque ispeciall...");
                        System.out.println("Receba meu Cerol" + inimigoDaBola.getArma().toString());
                        System.out.println("Você recebeu : " + inimigoDaBola.getArma().getDano());
                        vidaPersonagem = vidaPersonagem - inimigoDaBola.getArma().getDano();
                        System.out.println("");
                        String k = scfs.nextLine();
                    }
                    else if(inimigoDaBola.getNome().equals("Mickey da Craco") && chancePoderUm == chancePoderDois){
                        System.out.println("mickey te da um ataque especial...");
                        System.out.println("Receba meu Poderzinho hehe" + inimigoDaBola.getArma().toString());
                        System.out.println("Você recebeu : " + inimigoDaBola.getArma().getDano());
                        vidaPersonagem -= inimigoDaBola.getArma().getDano();
                        System.out.println("Você se sente meio tonto após o ataque");
                        System.out.println("");
                        String k = scfs.nextLine();
                    }
                    else if(inimigoDaBola.getNome().equals("Pagão da vilinha") && chancePoderUm == chancePoderDois){
                        System.out.println("Pagão lhe acerta de raspão...");
                        System.out.println("Jante o sangue dele ò " + inimigoDaBola.getArma().toString());
                        System.out.println("");
                        String k = scfs.nextLine();
                    }
                    else if(inimigoDaBola.getNome().equals("Agent Perry") && chancePoderUm == chancePoderDois){
                        System.out.println("Perry atira em você com sua pistola de escalar. Fique preso por um turno...");
                        System.out.println("Você recebeu : " + danoInimigo + " de dano.");
                        vidaPersonagem = vidaPersonagem - danoInimigo;
                        System.out.println("");
                        String k = scfs.nextLine();
                    }
                    else if(inimigoDaBola.getNome().equals("Vasilhian Man") && chancePoderUm == chancePoderDois){
                        System.out.println("Vasilhiam lhe acerta uma seringada... ");
                        System.out.println("Você fica fraco e tonto");
                        System.out.println("Mas ele não descansa e te acerta um critico.");
                        System.out.println("Você recebeu : 400 de dano");
                        vidaPersonagem -= 400;
                        System.out.println("");
                        String k = scfs.nextLine();
                    }

                } while (inimigoDaBola.getVida() > 0 && personagemEscolhido.getVida() > 0 && escolhaNoTurno != 3 || morreu || !ganhouRodada);
                ganhouRodada = false;
                nivelMasmorra++;
                if (personagemEscolhido.getVida() <= 0 || escolhaNoTurno == 3 || morreu) {
                    nivelMasmorra = 0;
                    personagemEscolhido.setVida(vidaTotalPersonagem);
                    System.out.println("Infelizmente você foi derrotado.");
                    System.out.println("Você sera mandado a escolha da dificuldade");
                    batalhaTorre();
                }
            }
        }while(!rodoJaUm || !rodoJaDois || !rodoJaTres || !rodoJaQuatro || !rodoJaZero);
        if(rodoJaUm && rodoJaDois && rodoJaTres && rodoJaQuatro && rodoJaZero){
            System.out.println("Parabens!!!");
            System.out.println("Você concluiu o modo medio");
            System.out.print("""
                    Deseja ir para o modo dificil?
                    1 - Sim
                    2 - Não
                    Codigo : """);
            int opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    modoDificil();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Inserindo valores invalidos... Vá para o menu principal");
                    String tmncKr = scfs.nextLine();
                    menu();
            }
        }

    }
    //endregion
    //region(dificil
    public static void modoDificil(){
        Inimigo.criarInimigos();

        boolean rodoJaZero = false;
        boolean rodoJaDois = false;
        boolean rodoJaTres = false;
        boolean rodoJaQuatro = false;
        boolean rodoJaUm = false;
        boolean decisaoUnica = false; //faz com que o monstro só efetue um dos ifs.
        boolean morreu = false;
        boolean ganhouRodada = false;

        int nivelMasmorra = 1;
        int escolhaNoTurno = 0;

        do {
            int numeroInimigoDaVez = random.nextInt(4);

            if ( numeroInimigoDaVez == 0 && rodoJaZero){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 1 && rodoJaUm){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 2 && rodoJaDois){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 3 && rodoJaTres){
                numeroInimigoDaVez = random.nextInt(4);
            }
            if ( numeroInimigoDaVez == 4 && rodoJaQuatro){
                numeroInimigoDaVez = random.nextInt(4);
            }
            else {
                int cont = 0;
                for (Inimigo inimigo1 : Inimigo.listaDeInimigosDificil) {
                    if (cont == numeroInimigoDaVez) {
                        inimigoDaBola = inimigo1;
                    }
                    cont++;
                }

                int vidaInimigo = inimigoDaBola.getVida();
                int danoInimigo = inimigoDaBola.getDano();

                int vidaTotalInimigo = 0;

                for(int c=0; c<= vidaInimigo; c++){
                    vidaTotalInimigo++;
                }

                int vidaTotalPersonagem = 0;

                for(int c=0; c<= vidaInimigo; c++){
                    vidaTotalPersonagem++;
                }

                int vidaPersonagem = personagemEscolhido.getVida();
                int danoPersonagem = personagemEscolhido.getDano();

                int danoTotalPersonagem = 0;

                for(int c = 0; c <= danoPersonagem; c++){
                    danoTotalPersonagem++;
                }

                System.out.println("""
                            Bem vindo à Masmorra Dificil
                            
                            Prepare suas coisas e vamos!!
                            """);
                String pqp = scfs.nextLine();
                System.out.println(""" 
                        O inimigo : """ + inimigoDaBola +
                        """ 
                        Venho ao seu encontro."""
                );
                System.out.println("Nivel masmorra : " + nivelMasmorra);
                do {

                    System.out.println("""
                            \nInimigo : """ + inimigoDaBola + """ 
                            \nPersonagem : """ + personagemEscolhido + """
                            \n1 - Atacar 
                            2 - Recuperar-se
                            3 - Fugir
                            """);
                    escolhaNoTurno = sc.nextInt();
                    switch(escolhaNoTurno){
                        case 1:
                            System.out.println("Você atacou");
                            System.out.println("Dano : " + danoPersonagem);
                            inimigoDaBola.setVida(inimigoDaBola.getVida() - danoPersonagem);
                            break;
                        case 2:
                            personagemEscolhido.setVida(personagemEscolhido.getVida() + (vidaTotalPersonagem / 5));
                            System.out.println("Você se recuperou");
                            break;
                        case 3:
                            System.out.println("cagao");
                            batalhaTorre();
                            break;
                        default:
                            System.out.println("Perdeu o turno. Insira apenas valores válidos...");
                            break;
                    }
                    if (inimigoDaBola.getVida() <= (vidaTotalInimigo / 4)) {
                        inimigoDaBola.setVida(inimigoDaBola.getVida() + (vidaTotalInimigo / 6));
                        System.out.println("Seu inimigo se curou");
                        decisaoUnica = true;
                    }
                    if (!decisaoUnica && vidaInimigo > 0) {
                        personagemEscolhido.setVida(personagemEscolhido.getVida() - danoInimigo);
                        System.out.println("Voce foi atacado e recebeu : " + danoInimigo);
                    }
                    decisaoUnica = false;
                    if (personagemEscolhido.getVida() <= 0) {
                        System.out.println("Você foi derrotado!");
                        System.out.println("Volte ao menu de escolha de level!");
                        batalhaTorre();
                    }
                    if (inimigoDaBola.getVida() <= 0) {
                        System.out.println("Você derrotou o Inimigo : " + inimigoDaBola.getNome());
                        ganhouRodada = true;
                    }

                    int numeroPoder = random.nextInt(5);
                    int chancePoderUm = random.nextInt(10);

                    if(inimigoDaBola.getNome().equals("Cleitin da Viela Ensolarada") && chancePoderUm == numeroPoder){
                        System.out.println("Você recebeu uma cerolzada");
                        System.out.println("Você ativou a habilidade do Cleitin...");
                        System.out.println("Tome o cerol de vidro branco");
                        System.out.println("Você está ficando louco, eletricamente eletrizado");
                        System.out.println("Seus pontos de vida aumentam e caem ao mesmo tempo....");
                        System.out.println("Você desmaia.");
                        vidaPersonagem = 1;
                        System.out.println("Eu lhe mato hoje.");
                        System.out.println("Cleitin fica muito loco e te mata com o cerol branco");
                        vidaPersonagem = 0;
                        System.out.println("");
                        String k = scfs.nextLine();
                    }

                    else if(inimigoDaBola.getNome().equals("EXA Mikey Magic") && chancePoderUm == numeroPoder){
                        System.out.println("mickey te da um tapinha especial...");
                        System.out.println("Receba um pouco do meu mundo");
                        System.out.println("Você se sente meio tonto após isso");
                        danoPersonagem = 1;
                        System.out.println("Você se sente fraco");
                        System.out.println(personagemEscolhido);
                        System.out.println("Após algum tempo fora do mundo do Mickey, suas forças voltaram totalmente.");
                        System.out.println("");
                        String k = scfs.nextLine();
                    }

                    else if(inimigoDaBola.getNome().equals("La Pagon del viela") && chancePoderUm == numeroPoder){
                        System.out.println("Pagão lhe acerta em cheio...");
                        System.out.println("Seu sangue jorra em meio a batalha");
                        System.out.println("O pagão se ve em uma situação engraçada, e começa a rir sem parar.");
                        System.out.println("Uma risada sadica.");
                        System.out.println("E solta a seguinte frase...");
                        String nfd = scfs.nextLine();
                        System.out.println("Desperte Jashin");
                        System.out.println("Sua vida é roubada pelo seu sangue, e Jashin renova as forças do pagão");//jashin rouba 1/5 da sua vida
                        personagemEscolhido.setVida(vidaPersonagem - (vidaTotalPersonagem/5));
                        inimigoDaBola.setVida(vidaInimigo + (vidaTotalPersonagem/5));
                        System.out.println("");
                        String k = scfs.nextLine();
                    }
                    else if(inimigoDaBola.getNome().equals("Agent Perry") && chancePoderUm == numeroPoder){
                        System.out.println("Perry se cansou de brincar com você.");
                        System.out.println("Ele equipa o modo apelão do seu : " + inimigoDaBola.getArma().toString());
                        System.out.println("Você é queimado em questão de segundos, sem sequer ter alguma chance de revidar ou escapar.");
                        System.out.println("Você Morreu...");
                        System.out.println("");
                        String k = scfs.nextLine();
                        vidaPersonagem = 0;
                    }
                    else if(inimigoDaBola.getNome().equals("Vasilhian Man") && chancePoderUm == numeroPoder){
                        int numeroDeSeringadas = 3;
                        System.out.println("Vasilhiam lhe acerta uma seringada... ");
                        System.out.println("Você fica fraco e tonto");
                        System.out.println("Mas ele não descansa e te acerta um critico.");
                        System.out.println("Você recebeu : 400 de dano");
                        personagemEscolhido.setVida(vidaPersonagem - 400);
                        System.out.println("Seu contador de seringadas : " + numeroDeSeringadas);
                        numeroDeSeringadas--;
                        if(numeroDeSeringadas == 0){
                            System.out.println("Você levou minha ultima seringadaaaaaa");
                            System.out.println("Você morreu de ataque cardiaco");
                            vidaPersonagem = 0;
                        }

                    }

                } while (inimigoDaBola.getVida() > 0 || personagemEscolhido.getVida() > 0 || escolhaNoTurno != 3 || morreu || !ganhouRodada);
                ganhouRodada = false;
                nivelMasmorra++;
                if (vidaPersonagem == 0 || escolhaNoTurno == 3) {
                    nivelMasmorra = 0;
                    personagemEscolhido.setVida( vidaTotalPersonagem);
                    morreu = true;
                }
            }
        }while(!rodoJaUm || !rodoJaDois || !rodoJaTres || !rodoJaQuatro || !rodoJaZero || morreu);
        ganhouRodada = false;
        if(rodoJaUm && rodoJaDois && rodoJaTres && rodoJaQuatro && rodoJaZero && !morreu){
            System.out.println("Parabens!!!");
            System.out.println("Você concluiu o modo dificil");
            System.out.println("Muito obrigado por ter jogado, isso me deixa deveras feliz!!");
            menu();
            }
        }
    //endregion
//endregio

//endregion
//função que eu to usando para dar looping no codigo, ele não acaba
//é finalizado somente após o usuario concluir o percurso para dar dalo fim.
    public static void bemVindo(){

        pessoaLogada = null;
        loginEfetuado = false;
        System.out.println("Bem Vindo ao meu RPG");

        do {
            System.out.print("""
               
                    Você possui cadastro?
                    
                    1 - Sim, desejo fazer login.
                    2 - Não, desejo criar meu cadastro agora.
                    
                    :  """);
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    login();
                    loginEfetuado = true;
                    break;
                case 2:
                    cadastro();
                    break;
                default:
                    System.out.println("Insira valores validos!");
                    break;
            }
        }while(!loginEfetuado);
        menu();
    }


}