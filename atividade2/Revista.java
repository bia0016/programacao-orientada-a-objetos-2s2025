public class Revista extends Material {
    private Integer edicao;

    public Revista (String titulo, Integer anoPublicacao, Integer edicao){
        super(titulo, anoPublicacao);
        this.edicao = edicao; 
    }

    public Integer getEdicao() {return this.edicao;}
    public void setEdicao(Integer edicao) {this.edicao = edicao;}

    @Override
    public void descricao(){
        System.out.println("- Revista -");
        super.descricao();
        System.out.println("Edição: " + this.edicao);
    }
}
