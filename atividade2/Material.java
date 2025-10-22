public class Material implements ItemEmprestavel {
    private String titulo;
    private Integer anoPublicacao;

    public Material (){}
    public Material (String titulo, Integer anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {return this.titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public Integer getAnoPublicacao() {return this.anoPublicacao;}
    public void setAnoPublicacao(Integer anoPublicacao) {this.anoPublicacao = anoPublicacao;}

    public void descricao(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
    }
}
