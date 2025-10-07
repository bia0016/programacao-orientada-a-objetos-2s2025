public class Material {
    protected String titulo;
    protected Integer anoPublicacao;

    public Material (){}
    public Material (String titulo, Integer anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void descricao(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
    }
}
