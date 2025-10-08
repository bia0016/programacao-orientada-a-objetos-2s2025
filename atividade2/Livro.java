public class Livro extends Material {
    private String autor;

    public Livro (String titulo, Integer anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void descricao(){
        System.out.println("- Livro -");
        super.descricao();
        System.out.println("Autor: " + this.autor);
    }
}
