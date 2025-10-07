public class Revista extends Material {
    private String edicao;

    public Revista (String titulo, Integer anoPublicacao, String edicao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao; 
    }

    public String getEdicao() {return this.edicao;}
    public void setEdicao(String edicao) { this.edicao = edicao;}

    @Override
    public void descricao(){
        super.descricao();
        System.out.println("Edição: " + this.edicao);
    }
}
