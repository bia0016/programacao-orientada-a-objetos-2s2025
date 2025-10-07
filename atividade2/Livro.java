public class Livro extends Material {
    private String autor;

    public Livro (String titulo, Integer anoPublicacao, String autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public void descricao(){
        super.descricao();
        System.out.println("Autor: " + this.autor);
    }
}
