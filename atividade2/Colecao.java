public class Colecao implements ItemEmprestavel{
    private String proprietario;
    private Integer qtdItens;

    public Colecao(String proprietario, Integer qtdItens) {
        this.proprietario = proprietario;
        this.qtdItens = qtdItens;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQtdItens() {
        return this.qtdItens;
    }

    public void setQtdItens(Integer qtdItens) {
        this.qtdItens = qtdItens;
    }
    
    @Override
    public void descricao(){
        System.out.println("Proprietário: " + this.proprietario);
        System.out.println("Quantidade de itens: " + this.qtdItens);
    }
}
