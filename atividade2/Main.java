import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Material> materiais = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        int opcao;

        //exemplo fixo
        Instituicao i1 = new Instituicao("UCB", "123456", "Brasília-DF");
        Livro l1 = new Livro("livro 1", 2025, "joao");
        Emprestimo e1 = new Emprestimo(i1, l1, "22/10/2025", "23/10/2025");
        emprestimos.add(e1);

        //exemplo colecao
        Instituicao i2 = new Instituicao("UCB", "12345678", "Brasilia-DF");
        Colecao c1 = new Colecao("Biblioteca", 43);
        Emprestimo e2 = new Emprestimo(i2, c1, "01/11/2025", "03/11/2025");
        emprestimos.add(e2);

        do {
            System.out.println("===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Cadastrar Livro");
            System.out.println("5 - Cadastrar Revista");
            System.out.println("6 - Listar Materiais");
            System.out.println("7 - Cadastrar Empréstimo");
            System.out.println("8 - Listar Empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeU = sc.nextLine();
                    System.out.print("Email: ");
                    String emailU = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    try {
                        pessoas.add(new Usuario(nomeU, emailU, matricula));
                        System.out.println("Usuário cadastrado com sucesso!\n");
                    } catch (NomeInvalidoException e) {
                        System.out.println("Nome inválido.");
                    }
                    try {
                        pessoas.add(new Usuario(nomeU, emailU, matricula));
                        System.out.println("Usuário cadastrado com sucesso!\n");
                    } catch (EmailInvalidoException e) {
                        System.out.println("Email inválido.");
                    }
                    
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();
                    System.out.print("Email: ");
                    String emailF = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    pessoas.add(new Funcionario(nomeF, emailF, cargo));
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;

                case 3:
                    System.out.println("=== Lista de Pessoas ===");
                    for (Pessoa p : pessoas) {
                        p.exibirInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 4:
                    System.out.print("Título: ");
                    String tituloL = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoL = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    materiais.add(new Livro(tituloL, anoL, autor));
                    System.out.println("Livro cadastrado!\n");
                    break;

                case 5:
                    System.out.print("Título: ");
                    String tituloR = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoR = sc.nextInt();
                    System.out.print("Edição: ");
                    int edicao = sc.nextInt();
                    sc.nextLine();
                    materiais.add(new Revista(tituloR, anoR, edicao));
                    System.out.println("Revista cadastrada!\n");
                    break;

                case 6:
                    System.out.println("=== Lista de Materiais ===");
                    for (Material m : materiais) {
                        m.descricao();
                        System.out.println("-------------------");
                    }
                    break;

                case 7:
                    if (pessoas.isEmpty() || materiais.isEmpty()) {
                        System.out.println("É necessário ter pelo menos uma pessoa e um material cadastrados.\n");
                        break;
                    }
                    System.out.println("Escolha o usuário (índice):");
                    for (int i = 0; i < pessoas.size(); i++) { 
                            System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int idxUsuario = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Escolha o material (índice):");
                    for (int i = 0; i < materiais.size(); i++) {
                        System.out.println(i + " - " + materiais.get(i).getTitulo());
                    }
                    int idxMaterial = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Data de empréstimo: ");
                    String dataE = sc.nextLine();
                    System.out.print("Data de devolução: ");
                    String dataD = sc.nextLine();
                    try { // try-catch garante segurança no codigo 
                        emprestimos.add(new Emprestimo(pessoas.get(idxUsuario),
                                                   materiais.get(idxMaterial),
                                                   dataE, dataD));
                    } catch (Exception e) {
                        System.out.println("Algo deu errado, tente novamente.");
                    }
                
                    System.out.println("Empréstimo cadastrado!\n");
                    break;

                case 8:
                    System.out.println("=== Lista de Empréstimos ===");
                    for (Emprestimo e : emprestimos) {
                        e.exibirDetalhes();
                        System.out.println("-------------------");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }

        } while (opcao != 0);

        sc.close();
    }
}
