//Codigo feito por João Pedro Marçal Moreira e Fernanda Ramalho

import java.util.ArrayList;
import java.util.Scanner;
public class Main {




        static void exibirMenu() {
            System.out.println("===== CINEMA =====");
            System.out.println("1 - Gerenciar filmes");
            System.out.println("2 - Gerenciar sessoes e vender ingressos");
            System.out.println("3 - Informacoes do cinema");
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao desejada: ");
        }

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            int opcao;

            Filme Filme1 = new Filme("Amanhecer na Colheita",120);
            Filme Filme2 = new Filme("Homem-Aranha no Aranhaverso",120);
            Filme Filme3 = new Filme("Verity",120,14,"Terror");

            ArrayList<Filme> filmes = new ArrayList<>();

            filmes.add(Filme1);
            filmes.add(Filme2);
            filmes.add(Filme3);


            Sessao Sessao1 = new Sessao("1",Filme3,50,14,30);
            Sessao Sessao2 = new Sessao("12",Filme1,50,16,30);
            Sessao Sessao3 = new Sessao("123",Filme1,20, 0);
            Sessao Sessao4 = new Sessao("1234",Filme2,15,40);
            Sessao Sessao5 = new Sessao("12345",Filme2,50,17,0 );


            do {
                exibirMenu();
                opcao = teclado.nextInt();
                teclado.nextLine();

                switch (opcao) {

                    case 1:
                        do {
                            System.out.println("");
                            System.out.println("GERENCIAR FILMES");
                            System.out.println("Selecione um dos filmes abaixo");
                            System.out.println("1 para " + Filme1.getTitulo() + " Categoria " + Filme1.getCategoria());
                            System.out.println("2 para " + Filme2.getTitulo() + " Categoria " + Filme2.getCategoria());
                            System.out.println("3 para " + Filme3.getTitulo() + " Categoria " + Filme3.getCategoria());
                            opcao = teclado.nextInt();
                            teclado.nextLine();

                            if (opcao<1 || opcao>3){
                                System.out.println("Opção inválida Digite novamente");
                            }
                        }


                        while (opcao<0 || opcao>3);

                        System.out.println("");
                        System.out.println("Opção selecionada, Filme escolhido foi "+ filmes.get(opcao-1).getTitulo());
                        System.out.println("");
                        System.out.println("Escolha uma das seguintes opções");
                        System.out.println("1 para Consultar os dados do filme");
                        System.out.println("2 para Alterar a categoria");
                        System.out.println("3 para Alterar a sinopse");
                        System.out.println("0 para Voltar ao menu principal");
                        int opcao3 = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcao3){

                            case 1:
                                System.out.println("");
                                System.out.println("Titulo: "+filmes.get(opcao-1).getTitulo());
                                System.out.println("Categoria: "+filmes.get(opcao-1).getCategoria());
                                System.out.println("Duração: "+filmes.get(opcao-1).getDuracao()+ " Minutos" );
                                System.out.println("Sinopse: "+filmes.get(opcao-1).getSinopse());
                                System.out.println("Faixa etária: "+filmes.get(opcao-1).getFaixaetaria());

                                break;

                            case 2:
                                String novacategoria;
                                System.out.println("");
                                System.out.println("Alterar a categoria");
                                System.out.println("As categorias são Ação, Aventura, Comédia, Drama e Terror");
                                System.out.println("Digite o nome da categoria");
                                novacategoria = teclado.nextLine();

                                while (!filmes.get(opcao - 1).setCategoria(novacategoria)){
                                    System.out.println("Digite categoria Valida");
                                    novacategoria = teclado.nextLine();
                                    filmes.get(opcao - 1).setCategoria(novacategoria);
                                }
                                break;

                            case 3:
                                String novasinopse;
                                System.out.println("");
                                System.out.println("Alterar a sinopse");
                                System.out.println("Digite a sinopse do filme "+filmes.get(opcao-1).getTitulo());
                                novasinopse= teclado.nextLine();
                                filmes.get(opcao-1).setSinopse(novasinopse);

                                break;

                            case 0:
                                System.out.println("Voltando ao Menu Principal");
                                break;

                            default:
                                System.out.println("Opção inválida");
                        }
                        break;










                    case 2:
                        System.out.println("GERENCIAR SESSÕES");

                        System.out.println("1 - " + Sessao1.getCodigoideneficador() + " - " + Sessao1.getFilmesessao().getTitulo() + " - " + Sessao1.getHorario());
                        System.out.println("2 - " + Sessao2.getCodigoideneficador() + " - " + Sessao2.getFilmesessao().getTitulo() + " - " + Sessao2.getHorario());
                        System.out.println("3 - " + Sessao3.getCodigoideneficador() + " - " + Sessao3.getFilmesessao().getTitulo() + " - " + Sessao3.getHorario());
                        System.out.println("4 - " + Sessao4.getCodigoideneficador() + " - " + Sessao4.getFilmesessao().getTitulo() + " - " + Sessao4.getHorario());
                        System.out.println("5 - " + Sessao5.getCodigoideneficador() + " - " + Sessao5.getFilmesessao().getTitulo() + " - " + Sessao5.getHorario());

                        System.out.print("Escolha uma sessão: ");
                        int escolha = teclado.nextInt();
                        teclado.nextLine();

                        Sessao selecionada = null;

                        if (escolha == 1) {
                            selecionada = Sessao1;
                        } else if (escolha == 2) {
                            selecionada = Sessao2;
                        } else if (escolha == 3) {
                            selecionada = Sessao3;
                        } else if (escolha == 4) {
                            selecionada = Sessao4;
                        } else if (escolha == 5) {
                            selecionada = Sessao5;
                        } else {
                            System.out.println("Sessão inválida");
                        }

                        if (selecionada != null) {
                            int opcao2;

                            do {
                                System.out.println("MENU DA SESSÃO");
                                System.out.println("1 - Consultar detalhes");
                                System.out.println("2 - Vender ingresso");
                                System.out.println("3 - Lugares disponíveis");
                                System.out.println("4 - Horário de término");
                                System.out.println("0 - Voltar");
                                System.out.print("Escolha: ");

                                opcao2 = teclado.nextInt();
                                teclado.nextLine();

                                switch (opcao2) {

                                    case 1:
                                        System.out.println("DADOS DA SESSÃO");
                                        System.out.println("Código: " + selecionada.getCodigoideneficador());
                                        System.out.println("Início: " + selecionada.getHorario());
                                        System.out.println("Término: " + selecionada.getHorariotermino());
                                        System.out.println("Filme: " + selecionada.getFilmesessao().getTitulo());
                                        System.out.println("Duração: " + selecionada.getFilmesessao().getDuracao()+"Minutos");
                                        System.out.println("Classificação: " + selecionada.getFilmesessao().getFaixaetaria());
                                        System.out.println("Categoria: " + selecionada.getFilmesessao().getCategoria());
                                        System.out.println("Sinopse: " + selecionada.getFilmesessao().getSinopse());
                                        System.out.println("Capacidade: " + selecionada.getCapacidademax());
                                        System.out.println("Vendidos: " + selecionada.getQuantingressosvendidos());
                                        System.out.println("Disponíveis: " + selecionada.getLugaresdisponiveis());
                                        System.out.println("Valor Arrecadado R$: " + selecionada.getValorarrecadado());

                                        break;

                                    case 2:
                                        System.out.println("===== VENDA DE INGRESSOS =====");

                                        System.out.print("Digite a idade do espectador: ");
                                        int idade = teclado.nextInt();
                                        teclado.nextLine();

                                        System.out.print("Para meia-entrada, digite o código do documento comprobatório (pressione ENTER para ingresso inteiro): ");
                                        String documento = teclado.nextLine();

                                        int resultado;

                                        if (documento.isEmpty()) {
                                            resultado = selecionada.Compraringresso(idade);
                                        } else {
                                            resultado = selecionada.Compraringresso(idade, documento);
                                        }

                                        if (resultado == -1) {
                                            System.out.println("Venda recusada: dados inválidos.");
                                        } else if (resultado == -2) {
                                            System.out.println("Venda recusada: idade incompatível com a classificação indicativa do filme.");
                                        } else if (resultado == -3) {
                                            System.out.println("Venda recusada: não há lugares disponíveis nesta sessão.");
                                        } else {
                                            System.out.println("Ingresso vendido com sucesso!");

                                            if (documento.isEmpty()) {
                                                System.out.println("Tipo de ingresso: Inteiro");
                                                System.out.printf("Valor cobrado: R$ %.2f%n", selecionada.getValoringresso());
                                            } else {
                                                System.out.println("Tipo de ingresso: Meia-entrada");
                                                System.out.printf("Valor cobrado: R$ %.2f%n", selecionada.getValoringresso() / 2);
                                            }
                                        }
                                        break;


                                    case 3:
                                        System.out.println("Lugares disponíveis: " +
                                                selecionada.getLugaresdisponiveis());
                                        break;

                                    case 4:
                                        System.out.println("Horário de término: " +
                                                selecionada.getHorariotermino());
                                        break;

                                    case 0:
                                        System.out.println("Voltando ao Menu Principal");
                                        break;

                                    default:
                                        System.out.println("Opção inválida");
                                }

                            } while (opcao2 != 0);
                        }

                        break;


                    case 3:
                        int opcao4;

                        do {
                            System.out.println("Consultar e atualizar informações do cinema");
                            System.out.println("1 - Consultar o preço integral do ingresso");
                            System.out.println("2 - Alterar o preço integral do ingresso");
                            System.out.println("3 - Consultar ingressos vendidos e arrecadação");
                            System.out.println("0 - Voltar ao menu principal");
                            System.out.print("Digite a opção desejada: ");

                            opcao4 = teclado.nextInt();
                            teclado.nextLine();

                            switch (opcao4) {

                                case 1:
                                    System.out.println("Preço integral do ingresso: R$ "
                                            + Sessao1.getValoringresso());
                                    break;

                                case 2:
                                    System.out.print("Digite o novo preço do ingresso: ");
                                    double novoValor = teclado.nextDouble();

                                    if (Sessao.setValoringresso(novoValor)) {
                                        System.out.println("Preço alterado com sucesso.");
                                    } else {
                                        System.out.println("Alteração recusada. Valor inválido.");
                                    }
                                    break;

                                case 3:
                                    int totalIngressos =
                                            Sessao1.getQuantingressosvendidos() +
                                                    Sessao2.getQuantingressosvendidos() +
                                                    Sessao3.getQuantingressosvendidos() +
                                                    Sessao4.getQuantingressosvendidos() +
                                                    Sessao5.getQuantingressosvendidos();

                                    double totalArrecadado =
                                            Sessao1.getValorarrecadado() +
                                                    Sessao2.getValorarrecadado() +
                                                    Sessao3.getValorarrecadado() +
                                                    Sessao4.getValorarrecadado() +
                                                    Sessao5.getValorarrecadado();

                                    System.out.println("Total de ingressos vendidos: " + totalIngressos);
                                    System.out.println("Arrecadação total: R$ " + totalArrecadado);
                                    break;

                                case 0:
                                    System.out.println("Voltando ao menu principal...");
                                    break;

                                default:
                                    System.out.println("Opção inválida.");
                            }

                        } while (opcao4 != 0);

                        break;


                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opcao invalida");
                }

            } while (opcao != 0);

            teclado.close();
        }

}
