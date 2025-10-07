public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Alessandro", "alessandro@gmail.com", 5908);
        Funcionario employee = new Funcionario("Camila", "camila@biblioteca.com", "Locação");
        Livro book = new Livro("A Revolução dos Bichos", 1945, "George Orwell");
        Revista magazine = new Revista("Vogue", 2025, "#487");

        Emprestimo loan1 = new Emprestimo(user, book, "14/09/2025", "04/10/2025");
        Emprestimo loan2 = new Emprestimo(user, magazine, "04/10/2025", "24/10/2025");

        loan1.exibirDetalhes();
        loan2.exibirDetalhes();
    }
}
